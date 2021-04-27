package chap06.exercise19;
/*
 * ���� ���� ��ü Account, �ܰ� balance
 * �ִ� 1,000,000 ,�ּ� 0 ������ balance �� ����
 * getter,setter �̿�
 */

public class Account {
	static final int MAX_BALANCE = 1000000;
	static final int MIN_BALANCE = 0;
	private int balance;
	
	

	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		if(balance >= Account.MIN_BALANCE && balance <= Account.MAX_BALANCE)
		this.balance = balance;
	}
	void printBalance() {
		System.out.println("�����ܰ� : "+ this.balance);
	}



	Account(){
		
	}
}
