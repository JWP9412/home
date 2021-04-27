package inter8_7_2InterfaceInheritageDefault;

public class Exam1 {

	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {
			
			@Override
			public void method1() {
				System.out.println("met1");
				
			}
			
			@Override
			public void method3() {
				System.out.println("met3");
				
			}
		};
		
		ci1.method1();
		ci1.method2();
		ci1.method3();

	}

}
