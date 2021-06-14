package sec03.s07.Massenger;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClinetEx76 extends Application {
	Socket socket;
	
	TextArea txt;
	TextField txtInput;
	Button btnConn, btnSend;
	
	@Override
	public void start(Stage ps) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		
		txt = new TextArea();
		txt.setEditable(false);
		BorderPane.setMargin(txt, new Insets(0, 0, 2, 0));
		root.setCenter(txt);
		
		BorderPane bottom = new BorderPane();
		txtInput =new TextField();
		txtInput.setPrefSize(60, 30);
		BorderPane.setMargin(txtInput, new Insets(0,1,1,1));
		
		
		btnConn = new Button("start");
		btnConn.setPrefSize(60, 30);
		btnConn.setOnAction(e->{						// start �� stop ��ư�� Ŭ������ �� �̺�Ʈ ó�� �ڵ�
			if(btnConn.getText().equals("start")) {
				startClient();
			}else if(btnConn.getText().equals("stop")) {
				stopClient();
			}
		});
		
		btnSend = new Button("send");
		btnSend.setPrefSize(60, 30);
		btnSend.setDisable(true);
		btnSend.setOnAction(e->send(txtInput.getText()));
		
		bottom.setCenter(txtInput);
		bottom.setLeft(btnConn);
		bottom.setRight(btnSend);
		root.setBottom(bottom);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		ps.setScene(scene);
		ps.setTitle("Client");
		ps.setOnCloseRequest(event -> stopClient());				//������ ���� ��� �ݱ� ��ư�� Ŭ������ �� �̺�Ʈ ó�� �ڵ�
		ps.show();
	}
	
	void displayText(String text) {
		txt.appendText(text + "\n");
	}
	
	void startClient() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					socket = new Socket();
					socket.connect(new InetSocketAddress("localhost",5001));
					Platform.runLater(()->{
						displayText("[���� �Ϸ�: " + socket.getRemoteSocketAddress()+"]");
						btnConn.setText("stop");
						btnSend.setDisable(false);
					});
				} catch (Exception e) {
					Platform.runLater(() -> displayText("[���� ��� �ȵ�]"));
					if(!socket.isClosed()) {stopClient();}
					return;
				}
				receive();	//�������� ���� ������ �ޱ�
			}
		};
		thread.start();		//������ ���� 	 	
	}
	
	void stopClient() {
		try {
			Platform.runLater(()->{
				displayText("[���� ����]");
				btnConn.setText("start");
				btnSend.setDisable(true);
				});
			if(socket!=null && !socket.isClosed()) {
				socket.close();
			}
		} catch (Exception e) {}
	}
	
	void receive() {
		while(true) {
			try {
				byte[] byteArr = new byte[100];
				InputStream is = socket.getInputStream();
				
				//������ ���������� ���Ḧ ���� ��� IOExcetion �߻�
				int readByteCount = is.read(byteArr);	// ������ �ޱ�
				
				//������ ���������� Socket�� close() �� ȣ������ ���
				if(readByteCount == -1) {throw new IOException();}
				
				String data = new String(byteArr, 0 , readByteCount, "UTF-8");
				
				Platform.runLater(()-> displayText("[�ޱ� �Ϸ�] " + data));
			} catch (Exception e) {
				Platform.runLater(()-> displayText("[���� ��� �ȵ�]"));
				stopClient();
				break;
			}
		}
	}
	
	void send(String data) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					byte[] byteArr = data.getBytes("UTF-8");
					OutputStream os = socket.getOutputStream();
					os.write(byteArr);
					os.flush();
					Platform.runLater(()-> displayText("[������ �Ϸ�]"));
				} catch (Exception e) {
					Platform.runLater(()-> displayText("[���� ��� �ȵ�]"));
					stopClient();
				}
			}
		};
		thread.start();
	}

	public static void main(String[] args) {
		launch(args);

	}

	

}
