package mt12_4_2_syncMethod;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		User1 user1 = new User1(); 	// User1 스레드 생성
		user1.setCalculator(cal);	// 공유 객체 생성
		user1.start();				// User1 스레드 시작

		User2 user2 = new User2();	// User2 스레드 생성
		user2.setCalculator(cal);	// 공유 객체 생성
		user2.start();				// User2 스레드 시작
	}

}
