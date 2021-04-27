package calculator;

import calcdivide.CalcDivide;

public final class Calculator extends CalcDivide {
	
	public Calculator(){
		super();
	}
	public Calculator(int sum){
		super(sum);
	}
	/*
	 * 메소드 오버로딩(overLoading)
	 * 동일한 이름으로 새로운 메소드를 정의
	 */
	public int compute(String oper,int x) {
		switch(oper) {
		case "+":
			super.compute(x);
			break;
		case "-":
			super.computeMinus(x);
			break;
		case "*":
			super.computeMultiple(x);
			break;
		case "/":
			super.computeDivide(x);
			break;
		}
		return this.sum;
	}
	/*
	 * (CalcDivide.jave)
	 * public final int computeDivide(int x)
	 * final 이므로 재정의 할 수 없다
	 */
	/*
	public int computeDivide(int x) {
		this.sum /= x;
		return this.sum;
	}
	*/

	public void printSum() {
		System.out.println("Calculator:sum = "+this.sum);
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator(0);
		calc.compute("+", 10);
		calc.compute("*", 10);
		calc.compute("-", 50);
		calc.compute("/", 2);
		calc.printSum();
	}
}
