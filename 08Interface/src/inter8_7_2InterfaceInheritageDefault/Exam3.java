package inter8_7_2InterfaceInheritageDefault;

public class Exam3 {

	public static void main(String[] args) {
		ChildInterface3 ci3 = new ChildInterface3() {
			
			@Override
			public void method1() {
				System.out.println("met1");
				
			}
			@Override
			public void method2() {
				System.out.println("met2");
				
			}
			
			@Override
			public void method3() {
				System.out.println("met3");
				
			}
		};
		
		ci3.method1();
		ci3.method2();
		ci3.method3();

	}

}
