package section14_6_2_References;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {

	public static void main(String[] args) {
		ToIntBiFunction<String, String> fun;
		
		fun = (a,b)-> a.compareToIgnoreCase(b);
		print(fun.applyAsInt("Java", "JAVA"));

		
		fun = String :: compareToIgnoreCase;
		print(fun.applyAsInt("Java1", "JAVA"));

	}
	public static void print(int order) {
		if(order<0) {
			System.out.println("���������� ���� �ɴϴ�");
		}else if(order==0) {
			System.out.println("������ ���ڿ��Դϴ�");
		}else {
			System.out.println("���������� ���߿� �ɴϴ�");
		}
	}
}
