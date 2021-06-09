package sec03.s05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferReaderEx {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);
		
		System.out.print("입력 : ");
		String lineString = br.readLine();
		
		
		System.out.println("출력 : " + lineString);
	}

}
