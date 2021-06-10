package sec03.s05.writeANDread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentEx {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/te/NonSerializableParentEx.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Child child = new Child();
		child.field1 = "hong";
		child.field2 = "kim";
		oos.writeObject(child);
		oos.flush(); oos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("C:/te/NonSerializableParentEx.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Child v = (Child) ois.readObject();
		System.out.println("field1 : " +v.field1);
		System.out.println("field2 : " +v.field2);
		ois.close(); fis.close();
	}

}
