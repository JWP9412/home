package mt12_4_2_syncMethod;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		User1 user1 = new User1(); 	// User1 ������ ����
		user1.setCalculator(cal);	// ���� ��ü ����
		user1.start();				// User1 ������ ����

		User2 user2 = new User2();	// User2 ������ ����
		user2.setCalculator(cal);	// ���� ��ü ����
		user2.start();				// User2 ������ ����
	}

}
