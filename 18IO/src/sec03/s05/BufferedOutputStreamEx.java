package sec03.s05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end =0;
		
		fis = new FileInputStream(
				"C:/te/forest.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/te/forest_copy1.jpg");
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end=System.currentTimeMillis();
		fos.close(); bis.close(); fis.close();
		System.out.println("not using : "+ (end - start) +" ms");
		
		fis = new FileInputStream("C:/te/forest.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/te/forest_copy2.jpg");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		bos.close(); fos.close(); bis.close(); fis.close();
		System.out.println("using : " + (end-start) +" ms");
	}

}
