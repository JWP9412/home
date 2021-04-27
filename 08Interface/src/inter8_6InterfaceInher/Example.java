package inter8_6InterfaceInher;

public class Example {

	public static void main(String[] args) {
		ImplemetationC impl = new ImplemetationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
