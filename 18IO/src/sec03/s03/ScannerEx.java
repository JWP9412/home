package sec03.s03;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�> ");
		String inStr = sc.nextLine();
		System.out.println(inStr);
		System.out.println();
		
		System.out.print("���� �Է�> ");
		int inInt = sc.nextInt();
		System.out.println(inInt);
		System.out.println();
		
		System.out.print("�Ǽ� �Է�> ");
		double inDou = sc.nextDouble();
		System.out.println(inDou);
		System.out.println();
		
		

	}

}
