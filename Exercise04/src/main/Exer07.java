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
				System.out.println("|1.���� | 2.��� | 3. �ܰ� | 4. ����|");
				System.out.println("---------------------------------");
				System.out.print("���� > ");
			}
			keyCode = System.in.read();
			if (keyCode == 49) {// 1
				System.out.println("���ݾ�>");
				int money = scanner.nextInt();
				balance += money;
			} else if (keyCode == 50) {// 1
				System.out.println("��ݾ�>");
				int money = scanner.nextInt();
				balance -= money;
			} else if (keyCode == 51) {// 1
				System.out.println("�ܰ�>" + balance);

			} else if (keyCode == 52) {// 1

				run = false;
			}

		}

		System.out.println("���α׷� ����");
	}

}
