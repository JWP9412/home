package sec03.s05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamEx {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/te/ObjectInputOutputStreamEx.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//oos.writeObject(new Integer(10));
		//oos.writeObject(new Double(3.14));
		oos.writeObject(10);
		oos.writeObject(3.14);
		oos.writeObject(new int[] {1,2,3});
		oos.writeObject(new String("ȫ�浿"));
		
		oos.flush(); oos.close(); oos.close();
		
		FileInputStream fis = new FileInputStream("C:/te/ObjectInputOutputStreamEx.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int []) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		ois.close(); fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
		System.out.println(obj4);
		

	}

}
