package section14_6_1_staticmehtod_instantmethod;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		IntBinaryOperator oper;
		
		//정적 메소드 참조
		oper = (x,y) -> Calculator.staticMethod(x, y);
		System.out.println("re1 : " + oper.applyAsInt(1, 2));
		
		oper = Calculator :: staticMethod;
		System.out.println("re2 : " + oper.applyAsInt(3, 4));
		
		//인스턴스 메소드 참조
		Calculator obj = new Calculator();
		oper = (x,y) -> obj.instanceMethod(x, y);
		System.out.println("re3 : "+oper.applyAsInt(5, 6));
		
		oper = obj :: instanceMethod;
		System.out.println("re4 : "+ oper.applyAsInt(7, 8));
	}
}
