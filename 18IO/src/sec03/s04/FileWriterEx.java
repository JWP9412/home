package sec03.s04;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) throws Exception {
		File file = new File("C:/te/String4.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("FileWriter�� �ѱ۷� ��"+"\n"); // ĳ��������(\n) �����ǵ�(\n)�� enter�� ���� ����
		fw.write("���ڿ��� �ٷ� ��� ����"+"\r");
		fw.flush();
		fw.close();
		System.out.println("���� ���� �Ϸ�");
	}
}
