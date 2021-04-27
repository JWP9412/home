package main;

public class Exer03 {

	public static void main(String[] args) {
		int sum = 0;
		for (int x = 0; x < 100; ++x) {
			if (x % 3 == 0) {
				sum += x;
				// System.out.println("3의 배수 : " + x);

			}

		}
		System.out.println("3의 배수의 합 : " + sum);
	}

}
