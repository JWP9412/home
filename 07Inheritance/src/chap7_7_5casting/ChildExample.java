package chap7_7_5casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data 1";
		parent.method1();
		parent.method2();
		
	
		/*
		 * 
		 */
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
		
		System.out.println();
		System.out.println("cf1 : "+child.field1);
		System.out.println("cf2 : "+child.field2);
		System.out.println("pf1 : "+parent.field1);
	}

}
