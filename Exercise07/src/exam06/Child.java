package exam06;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("4.Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("3.Child(String name) call");
	}
}
