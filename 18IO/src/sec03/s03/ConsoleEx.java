package sec03.s03;

import java.io.Console;

public class ConsoleEx {

	public static void main(String[] args) {
		Console cs = System.console();
		
		System.out.print("���̵� : ");
		String id = cs.readLine();
		
		System.out.print("�н����� : ");
		char[] charPass = cs.readPassword();
		String pw = new String(charPass);
		
		System.out.println("----------------");
		System.out.println(id);
		System.out.println(pw);

	}

}
