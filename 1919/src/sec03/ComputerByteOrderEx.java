package sec03;

import java.nio.ByteOrder;

public class ComputerByteOrderEx {

	public static void main(String[] args) {
		System.out.println("�ü�� ���� : "+System.getProperty("os.name"));
		System.out.println("����Ƽ���� ����Ʈ �ؼ� ���� : "+ ByteOrder.nativeOrder());
	}

}
