package section14_6_3_ConstructorReferences;

public class Member {
	private String name;
	private String id;
	
	public Member() {
		System.out.println("Member() runs");
	}
	public Member(String id) {
		System.out.println("Member(String id) runs");
		this.id = id;
	}
	public Member(String name, String id) {
		System.out.println("Member(String name ,String id) runs");
		this.name =name;
		this.id = id;
		
	}
	public String getID() {return id;}
}
