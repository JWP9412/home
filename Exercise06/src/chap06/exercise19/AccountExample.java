package chap06.exercise19;

public class AccountExample {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.setBalance(10000);
		acc.printBalance();
		System.out.println("!ÇöÀç ÀÜ°í : "+ acc.getBalance());
		
		acc.setBalance(-100);
		acc.printBalance();
		System.out.println("!ÇöÀç ÀÜ°í : "+ acc.getBalance());
		
		acc.setBalance(2000000);
		acc.printBalance();
		System.out.println("!ÇöÀç ÀÜ°í : "+ acc.getBalance());
		
		acc.setBalance(300000);
		acc.printBalance();
		System.out.println("!ÇöÀç ÀÜ°í : "+ acc.getBalance());
	}
	
	

}
