package chap06.exercise19;
/*
 * 은행 계좌 객체 Account, 잔고 balance
 * 최대 1,000,000 ,최소 0 범위의 balance 값 지정
 * getter,setter 이용
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
		System.out.println("현재잔고 : "+ this.balance);
	}



	Account(){
		
	}
}
