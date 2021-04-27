package main;

public class Exer05 {

	public static void main(String[] args) {

		for (int x = 0; x <= 10; ++x) {
			for (int y = 0; y <= 10; ++y) {
				// System.out.println("x : " + x +" , " + "y : " + y);
				int z = 4 * x + 5 * y;
				if (z == 60) {
					System.out.println("x : " + x + " , " + "y : " + y);
					
				}

			}

		}

	}

}
