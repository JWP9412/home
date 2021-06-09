package sec03.s05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterEx {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/TT/TT.txt");
		Writer w = new OutputStreamWriter(fos);
		
		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
		w.write(data);
		
		w.flush();
		w.close();
		System.out.println("파일 저장 완료");

	}

}
