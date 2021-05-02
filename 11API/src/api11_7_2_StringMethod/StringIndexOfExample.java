package api11_7_2_StringMethod;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("related JAVA");
		}else {
			System.out.println("NOPE");
		}

	}

}
