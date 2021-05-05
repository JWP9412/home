package exam09;

public class StringBuilderExample {

	public static void main(String[] args) {
		String str = "";
		for (int i = 1; i <= 100; i++) {
			str += i;
		}
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder();
		for(int k = 1;k <=100; k++) {
			sb.append(k);
		}
		System.out.println(sb.toString());
	}

}
