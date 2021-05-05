package exam06;

public class Parent {
	public String nation;

	public Parent() {
		this("¥Î«—πŒ±π");
		System.out.println("2.Parent() call");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("1.Parent(String nation) call");
	}
}
