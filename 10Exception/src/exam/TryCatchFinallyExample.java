package exam;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		String[] strArray = {"10","2a"};
		int value = 0;
		for(int i=0; i<=2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
				System.out.println("try");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("catch1 ���� [i] : " +i);
				System.out.println("!!�ε����� �ʰ���");
			}catch(NumberFormatException e)  {
				System.out.println("catch2 ���� [i] : " +i);
				System.out.println("!!���ڷ� ��ȯ�� �� ����");
			}finally {
				System.out.println("finally ���� [i] : " +i);
				System.out.println("!!"+value);
				System.out.println("-----------------------");
			}
		}

	}

}
