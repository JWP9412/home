package api11_7_2_StringMethod;

public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length();
		System.out.println("Length : " + length);
		if(length == 13) {
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�");
		}else {
			System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�");
		}
	}

}
