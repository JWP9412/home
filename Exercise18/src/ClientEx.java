import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

public class ClientEx {

	public static void main(String[] args) throws Exception {
		System.out.println("[���� ��û]");
		Socket socket = new Socket("localhost",5001);
		System.out.println("[���� �Ϸ�]");
		OutputStream os = socket.getOutputStream();
		
		String filePath = "C:\\te\\forest.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
		//Somethings
		byte[] byteArr = fileName.getBytes("UTF-8");
		byteArr = Arrays.copyOf(byteArr, 100);
		os.write(byteArr);
//		os.flush();
//		FileInputStream fis = new FileInputStream(file);
		
		
		System.out.println("[���� ������ ����]"+ fileName);
		//Some
		FileInputStream fis = new FileInputStream(file);
		byte[] bytes = new byte[1000];
		int readByteCount = -1;
		while((readByteCount = fis.read(bytes)) != -1) {
			os.write(bytes,0,readByteCount);
		}
		
		
		os.flush();
		System.out.println("[���� ������ �Ϸ�]");
		
		fis.close();
		os.close();
		socket.close();

	}

}
