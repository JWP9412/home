import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket();
		//ss.close();
		ss.bind(new InetSocketAddress("localhost",5001));
		
		System.out.println("[���� ����]");
		
		while(true) {
			try {
				Socket socket = ss.accept();
				
				InputStream is = socket.getInputStream();
				
				byte[] bytes = new byte[1000];
				int readByteCount = -1;
				
				is.read(bytes,0,100);
				String fileName = new String(bytes,0,100,"UTF-8");
				fileName = fileName.trim();
				System.out.println("[���� �̸�] : "+fileName);
				
				
				System.out.println("[���� �ޱ� ����] " +fileName);
				FileOutputStream fos = new FileOutputStream("C:/te/18.jpg");
				while((readByteCount = is.read(bytes)) != -1) {
					fos.write(bytes,0,readByteCount);
				}
				fos.flush();
				
				System.out.println("[���� �ޱ� �Ϸ�]");
				
				fos.close();
				is.close();
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
