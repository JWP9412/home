package sec03.s01;

import java.io.InputStream;

public class SYtemInEx2 {

	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		byte[] datas = new byte[100];
		
		System.out.println("이름 : ");
		int nameBytes = is.read(datas);
		String name = new String(datas, 0 , nameBytes-2);
		
		System.out.println("하고 싶은 말 : ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0 , commentBytes-2);
		
		System.out.println("입력한 이름 : "+name);
		System.out.println("입력한 하고 싶은 말 : "+ comment);
}

}
