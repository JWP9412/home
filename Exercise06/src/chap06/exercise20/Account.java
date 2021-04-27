package chap06.exercise20;
/*
 * [20] 계좌정보를 입력받고 관리하는 프로그램을 만들어어ㅓㅓ라
 */
public class Account {

	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano,String owner,int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano =ano;}	
	
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner =owner;}	
	
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance =balance;}
	public void addBalance(int balance) {this.balance += balance;}
	public void delBalacne(int balance) {this.balance -=balance;}

}
