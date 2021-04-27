package chap7_7_1promotion;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		child.method3();
		//parent.method3();

	}

}
