package sec03.s03;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력> ");
		String inStr = sc.nextLine();
		System.out.println(inStr);
		System.out.println();
		
		System.out.print("정수 입력> ");
		int inInt = sc.nextInt();
		System.out.println(inInt);
		System.out.println();
		
		System.out.print("실수 입력> ");
		double inDou = sc.nextDouble();
		System.out.println(inDou);
		System.out.println();
		
		

	}

}
