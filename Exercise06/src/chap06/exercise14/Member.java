package chap06.exercise14;
/*
 * [14] ���� 13�� �����ڸ� �߰��϶�
 * 		
 */
public class Member {
	String id;
	String name;
	String password;
	int age;
	
	Member m = new Member("kim","jiwon");
	
	
	Member(String name,String id){
		this.name = name;
		this.id = id;
		
		
	}
	public static void main(String[] args) {
		Member m = new Member("kim","jiwon");
		System.out.println(m);
	}
}
