package sec03.s05.serialVersuinUID;
//객체 역직결화
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialVesionUIDEx2 {
	public static void main(String [] args) throws Exception{
		FileInputStream fis = new FileInputStream("C:/te/SerialVersionUIDEx1.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassC c = (ClassC) ois.readObject();
		System.out.println("field1 : " + c.field1);
	}
}
