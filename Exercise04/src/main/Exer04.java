package main;

public class Exer04 {

	public static void main(String[] args) {
		int cnt = 0;

		while (true) {
			int x = (int) (Math.random() * 6 + 1);
			int y = (int) (Math.random() * 6 + 1);
			if ((x + y) == 5) {
				System.out.printf("cnt[%d] (%d,%d) STOP!!!\n", ++cnt, x, y);
				break;
			}
			System.out.printf("cnt[%d] (%d,%d) \n", ++cnt, x, y);

		}

	}

}
