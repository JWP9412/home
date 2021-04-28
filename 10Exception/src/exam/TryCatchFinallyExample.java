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
				System.out.println("catch1 순서 [i] : " +i);
				System.out.println("!!인덱스를 초과함");
			}catch(NumberFormatException e)  {
				System.out.println("catch2 순서 [i] : " +i);
				System.out.println("!!숫자로 변환할 수 없음");
			}finally {
				System.out.println("finally 순서 [i] : " +i);
				System.out.println("!!"+value);
				System.out.println("-----------------------");
			}
		}

	}

}
