package sec03.s07;
import java.io.InputStream;
import java.io.OutputStream;
//연결 수락
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx1 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost",5001));	//ServerSocket 생성
			while(true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept(); 					// 클라이언트 연결 수락
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println(isa);
				System.out.println("[연결 수락함]" + isa.getHostName());
				
				byte[] bytes = null;
				String message = null;
				
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes,0,readByteCount,"UTF-8");
				System.out.println("[데이터 받기 성공]" + message);
				
				OutputStream os = socket.getOutputStream();
				message = "Hello Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[데이터 보내기 성공]");
				
				is.close();
				os.close();
				socket.close();
			}
		} catch (Exception e) {	}
		
		if(!serverSocket.isClosed()) { 									//ServerSocket이 닫혀있지 않을 경우
			try {
				serverSocket.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
