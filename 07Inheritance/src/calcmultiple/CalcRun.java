package calcmultiple;

public class CalcRun {

	
	public static void main(String[] args) {
		CalcMultiple calc = new CalcMultiple(10);
		calc.compute(30);					//plus
		calc.computeMinus(20);				//minus
		int sum = calc.computeMultiple(2);	//multiple
		System.out.println("Calc : sum = " +sum);
		System.out.println("Calc : sum = " +calc.getSum());
		
	
	}
}