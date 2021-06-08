package sec03.s04;

import java.io.FileReader;

public class FileReaderEx {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("C:\\Users\\Áö¿ø\\git\\home\\18IO\\src\\sec03\\s04\\FileReaderEx.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo = fr.read(cbuf))!= -1) {
			String data = new String(cbuf,0, readCharNo);
			System.out.println(data);
		}
		fr.close();
	}
}
