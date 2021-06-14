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
		
		Runnable runnable = new Runnable() {	//수락 작업 생성
			@Override
			public void run() {
				Platform.runLater(()->{
				 displayText("[서버 시작]");
				 btnStartStop.setText("stop");
				});
				while(true) {
					try {
						Socket socket = ss.accept();	//연결 수락
						String message = "[연결 수락: " + socket.getRemoteSocketAddress() + 
								" : "+ Thread.currentThread().getName() +"]";
						Platform.runLater(()->displayText(message));
						
						Client client = new Client(socket);
						connections.add(client);
						Platform.runLater(()->displayText("[연결 개수 : " + connections.size() + " ]"));
					} catch (Exception e) {
						if(!ss.isClosed()) {stopServer();}
						break;
					}
				}
			}
		}; 
		es.submit(runnable);
	}//startServer 메소드 끝
	
	void stopServer() {
		try {																	//모든 소켓 닫기
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
				displayText("[서버 멈춤]");
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
			Runnable runnable = new Runnable() {	//받기 작업 생성
				@Override
				public void run() {
					try {
						while(true) {
							byte[] byteArr = new byte[100];
							InputStream inputStream = socket.getInputStream();
							
							//클라이언트가 비정상 종료를 했을 경우 IOExcetion 발생
							int readByteCount = inputStream.read(byteArr);	// 데이터 받기
							
							//클라이언트가 정상적을 Socket의 close() 를 호출했을 경우
							if(readByteCount == -1) {throw new IOException();}
							
							String message = "[요청 처리 : "+socket.getRemoteSocketAddress() +
									" : " + Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							
							String data = new String(byteArr, 0 , readByteCount, "UTF-8");
							
							for(Client client : connections) {		//모든 클라이언트에게 보냄
								client.send(data);	
							}
						}
					} catch (Exception e) {
						try {
							connections.remove(Client.this);
							String message = "[클라이언트 통신 안됨 : " +
											socket.getRemoteSocketAddress() +
											" : " + Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							socket.close();
						} catch (Exception e2) {}
					}
				}
			};
			es.submit(runnable);	//스레드풀에서 처리
		}
		
		void send(String data) {
			Runnable runnable = new Runnable() {// 보내기 작업 생성
				
				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8");
						OutputStream os = socket.getOutputStream();
						os.write(byteArr);
						os.flush();
					} catch (Exception e) {
						try {
							String message = "[클라이언트 통신 안됨 : " +
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
	btnStartStop.setOnAction(e->{							//start 와 stop 버튼을 클릭했을 때 이벤트 처리 코드
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
	ps.setOnCloseRequest(event -> stopServer());	//윈도우 우측 상단 닫기 버튼을 클릭했을 때 이벤트 처리 코드
	ps.show();
}
	void displayText(String text) {					//작업 스레드의 작업 처리 내용을 출력할 때 호출하는 메소드
		txt.appendText(text + "\n"); 
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	} 
}

	
