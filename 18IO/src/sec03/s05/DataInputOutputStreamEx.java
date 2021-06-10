package sec03.s05;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamEx {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/te/ppp.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("Lee");
		dos.writeDouble(1.23);
		dos.writeInt(1);
		
		dos.writeUTF("Kim");
		dos.writeDouble(53.41);
		dos.writeInt(2);
		
		dos.flush(); dos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("C:/te/ppp.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i =0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : "+order);
			
		}
		dis.close(); fis.close();
	}

}
