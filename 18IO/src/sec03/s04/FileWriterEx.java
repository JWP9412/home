package sec03.s04;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) throws Exception {
		File file = new File("C:/te/String4.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("FileWriter는 한글로 된"+"\n"); // 캐리지리턴(\n) 라인피드(\n)로 enter와 같은 역할
		fw.write("문자열을 바로 출력 가능"+"\r");
		fw.flush();
		fw.close();
		System.out.println("파일 저장 완료");
	}
}
