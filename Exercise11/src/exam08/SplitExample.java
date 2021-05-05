package exam08;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";

		// 방법1 (split() 메소드 이용)
		String[] splits = str.split(",");
		for (String t : splits) {
			System.out.println("1 : " + t);

		}
		System.out.println();

		// 방법2-1 (StringTokenizer 이용)

		StringTokenizer st1 = new StringTokenizer(str, ",");
		int ct = st1.countTokens();
		for (int a = 0; a < ct; a++) {
			String token = st1.nextToken();
			System.out.println("2 : " + token);
		}
		System.out.println();
		// 방법2-2 (StringTokenizer 이용)
		st1 = new StringTokenizer(str, ",");
		while (st1.hasMoreTokens()) {
			String token = st1.nextToken();
			System.out.println("3 : " + token);
		}
	}

}
