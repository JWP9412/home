package sec03.s05.serialVersuinUID;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// °´Ã¼ Á÷·ÄÈ­
public class SerialVersionUIDEx1 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/te/SerialVersionUIDEx1.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassC c = new ClassC();
		c.field1 =1;
		oos.writeObject(c);
		oos.flush(); oos.close(); fos.close();

	}

}
