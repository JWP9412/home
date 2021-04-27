package calcdivide;

public class CalcRun {

	
	public static void main(String[] args) {
		CalcDivide calc = new CalcDivide(10);
		calc.compute(30);					//plus
		calc.computeMinus(20);				//minus
		calc.computeMultiple(2);			//multiple
		int sum = calc.computeDivide(4);	//divide
		System.out.println("Calc : sum = " +sum);
		System.out.println("Calc : sum = " +calc.getSum());
		
	
	}
}