package inter8_7_2InterfaceInheritageDefault;

public class Exam2 {

	public static void main(String[] args) {
		ChildInterface2 ci2 = new ChildInterface2() {
			
			@Override
			public void method1() {
				System.out.println("met1");
				
			}
			
			@Override
			public void method3() {
				System.out.println("met3");
				
			}
		};
		
		ci2.method1();
		ci2.method2();
		ci2.method3();

	}

}
