package sec03.s02;

import java.io.OutputStream;

public class SystemOtEx {

	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;
		
		for(byte b=48; b<58;b++) {
			os.write(b); // �ƽ�Ű �ڵ� 48~57������ ���ڸ� ���
		}
		os.write(10); // �����ǵ�(10)�� ����ϸ� ���� ������ �Ѿ��
		
		for(byte b=97; b<123;b++) {
			os.write(b); // �ƽ�Ű �ڵ� 97~ 122������ ���ڸ� ���
		}
		os.write(10);
		
		String han = "�����ٶ󸶹ٻ������īŸ����";
		byte[] hanBytes = han.getBytes();
		os.write(hanBytes);
		
		os.flush();
	}

}
