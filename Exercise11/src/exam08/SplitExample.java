package exam08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";

		// ���1 (split() �޼ҵ� �̿�)
		String[] splits = str.split(",");
		for (String t : splits) {
			System.out.println("1 : " + t);

		}
		System.out.println();

		// ���2-1 (StringTokenizer �̿�)

		StringTokenizer st1 = new StringTokenizer(str, ",");
		int ct = st1.countTokens();
		for (int a = 0; a < ct; a++) {
			String token = st1.nextToken();
			System.out.println("2 : " + token);
		}
		System.out.println();
		// ���2-2 (StringTokenizer �̿�)
		st1 = new StringTokenizer(str, ",");
		while (st1.hasMoreTokens()) {
			String token = st1.nextToken();
			System.out.println("3 : " + token);
		}
	}

}
