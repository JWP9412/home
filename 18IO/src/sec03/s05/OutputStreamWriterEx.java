package sec03.s05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterEx {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/TT/TT.txt");
		Writer w = new OutputStreamWriter(fos);
		
		String data = "����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ";
		w.write(data);
		
		w.flush();
		w.close();
		System.out.println("���� ���� �Ϸ�");

	}

}
