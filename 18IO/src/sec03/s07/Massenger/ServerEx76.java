package sec03.s07.Massenger;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class ServerEx76 extends Application{
	ExecutorService es;
	ServerSocket ss;
	List<Client> connections = new Vector<Client>();
	
	//FX
	TextArea txt;
	Button btnStartStop;
	
	void startServer() {
		es = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
				);
		
		try {
			ss = new ServerSocket();
			ss.bind(new InetSocketAddress("localhost",5001));
		} catch (Exception e) {
			if(!ss.isClosed()) {stopServer();}
			return;
		}
		
		Runnable runnable = new Runnable() {	//���� �۾� ����
			@Override
			public void run() {
				Platform.runLater(()->{
				 displayText("[���� ����]");
				 btnStartStop.setText("stop");
				});
				while(true) {
					try {
						Socket socket = ss.accept();	//���� ����
						String message = "[���� ����: " + socket.getRemoteSocketAddress() + 
								" : "+ Thread.currentThread().getName() +"]";
						Platform.runLater(()->displayText(message));
						
						Client client = new Client(socket);
						connections.add(client);
						Platform.runLater(()->displayText("[���� ���� : " + connections.size() + " ]"));
					} catch (Exception e) {
						if(!ss.isClosed()) {stopServer();}
						break;
					}
				}
			}
		}; 
		es.submit(runnable);
	}//startServer �޼ҵ� ��
	
	void stopServer() {
		try {																	//��� ���� �ݱ�
			Iterator<Client> iterator = connections.iterator();
			while(iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();
			}
			if(ss!= null && !ss.isClosed()) {
				ss.close();
			}
			if(es!= null && !es.isShutdown()) {
				es.shutdown();
			}
			Platform.runLater(()->{
				displayText("[���� ����]");
				btnStartStop.setText("start");
			});
		} catch (Exception e) {}
	}
	
	class Client{
		Socket socket;
		
		Client(Socket socket){
			this.socket = socket;
			receive();
		}
		
		void receive() {
			Runnable runnable = new Runnable() {	//�ޱ� �۾� ����
				@Override
				public void run() {
					try {
						while(true) {
							byte[] byteArr = new byte[100];
							InputStream inputStream = socket.getInputStream();
							
							//Ŭ���̾�Ʈ�� ������ ���Ḧ ���� ��� IOExcetion �߻�
							int readByteCount = inputStream.read(byteArr);	// ������ �ޱ�
							
							//Ŭ���̾�Ʈ�� �������� Socket�� close() �� ȣ������ ���
							if(readByteCount == -1) {throw new IOException();}
							
							String message = "[��û ó�� : "+socket.getRemoteSocketAddress() +
									" : " + Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							
							String data = new String(byteArr, 0 , readByteCount, "UTF-8");
							
							for(Client client : connections) {		//��� Ŭ���̾�Ʈ���� ����
								client.send(data);	
							}
						}
					} catch (Exception e) {
						try {
							connections.remove(Client.this);
							String message = "[Ŭ���̾�Ʈ ��� �ȵ� : " +
											socket.getRemoteSocketAddress() +
											" : " + Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							socket.close();
						} catch (Exception e2) {}
					}
				}
			};
			es.submit(runnable);	//������Ǯ���� ó��
		}
		
		void send(String data) {
			Runnable runnable = new Runnable() {// ������ �۾� ����
				
				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream os = socket.getOutputStream();
						os.write(byteArr);
						os.flush();
					} catch (Exception e) {
						try {
							String message = "[Ŭ���̾�Ʈ ��� �ȵ� : " +
											socket.getRemoteSocketAddress() +
											" : " + Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							connections.remove(Client.this);
							socket.close();
						} catch (Exception e2) {}	
					}
				}
			};
			es.submit(runnable);
		}
	}

@Override
public void start(Stage ps) throws Exception {
	BorderPane root = new BorderPane();
	root.setPrefSize(500, 300);
	
	txt =new TextArea();
	txt.setEditable(false);
	BorderPane.setMargin(txt, new Insets(0,0,2,0));
	root.setCenter(txt);
	
	btnStartStop = new Button("start");
	btnStartStop.setPrefHeight(30);
	btnStartStop.setMaxWidth(Double.MAX_VALUE);
	btnStartStop.setOnAction(e->{							//start �� stop ��ư�� Ŭ������ �� �̺�Ʈ ó�� �ڵ�
		if(btnStartStop.getText().equals("start")) {
			startServer();
		}else if(btnStartStop.getText().equals("stop")) {
			stopServer();
		}
	});
	root.setBottom(btnStartStop);
	
	Scene scene = new Scene(root);
	scene.getStylesheets().add(getClass().getResource("app.css").toString());	
	ps.setScene(scene);
	ps.setTitle("Server");
	ps.setOnCloseRequest(event -> stopServer());	//������ ���� ��� �ݱ� ��ư�� Ŭ������ �� �̺�Ʈ ó�� �ڵ�
	ps.show();
}
	void displayText(String text) {					//�۾� �������� �۾� ó�� ������ ����� �� ȣ���ϴ� �޼ҵ�
		txt.appendText(text + "\n"); 
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	} 
}

	
