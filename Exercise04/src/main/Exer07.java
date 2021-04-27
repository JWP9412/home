package main;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int balance = 0;
		int keyCode = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println();
				System.out.println("---------------------------------");
				System.out.println("|1.예금 | 2.출금 | 3. 잔고 | 4. 종료|");
				System.out.println("---------------------------------");
				System.out.print("선택 > ");
			}
			keyCode = System.in.read();
			if (keyCode == 49) {// 1
				System.out.println("예금액>");
				int money = scanner.nextInt();
				balance += money;
			} else if (keyCode == 50) {// 1
				System.out.println("출금액>");
				int money = scanner.nextInt();
				balance -= money;
			} else if (keyCode == 51) {// 1
				System.out.println("잔고>" + balance);

			} else if (keyCode == 52) {// 1

				run = false;
			}

		}

		System.out.println("프로그램 종료");
	}

}
