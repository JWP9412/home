package sec03.s04;

import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Áö¿ø\\git\\home\\18IO\\src\\sec03\\s04\\FileInputStreamEx.java");
					
			int data;
			while((data = fis.read())!= -1) {
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
