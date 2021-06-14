package sec03.s07;

import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientEx {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost",5001));
			System.out.println("[연결 성공]");
		} catch (Exception e) {}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
				System.out.println("[연결 종료]");
			} catch (Exception e) {}
		}
	}

}
