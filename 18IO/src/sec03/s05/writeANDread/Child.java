package sec03.s05.writeANDread;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//직렬화되지 않는 부모 클래스의 필드 처리
import java.io.Serializable;

public class Child extends Parent implements Serializable {
	public String field2;
	
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.writeUTF(field1);
		out.defaultWriteObject();
	}
	
	private void readObject(ObjectInputStream in) throws IOException,ClassNotFoundException{
		field1 = in.readUTF();
		in.defaultReadObject();
	}
}
