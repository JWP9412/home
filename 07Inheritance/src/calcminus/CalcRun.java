package calcminus;

import calc.Calc;

public class CalcRun extends Calc{

	
	public static void main(String[] args) {
		CalcMinus calc = new CalcMinus(1000);
		int sum =calc.compute(10);
		sum = calc.computeMinus(900);
		System.out.println("Calc : sum = " +sum);
		System.out.println("Calc : sum = " +calc.getSum());
		
		//CalcRun�� Calc�κ��� ��ӵ��� �ʾ����Ƿ� calc.sum�� ���� �Ұ�
		//System.out.println("Calc : sum = " +calc.sum);

	}
}
/*
	
	public static void main(String[] args) {
		CalcRun calc = new CalcRun();
		int sum =calc.compute(10);
		//sum = calc.CalcRun(900);
		System.out.println("Calc : sum = " +sum);
		System.out.println("Calc : sum = " +calc.getSum());
		
		//CalcRun�� Calc�κ��� ��ӵ��� �ʾ����Ƿ� calc.sum�� ���� �Ұ�
		System.out.println("Calc : sum = " +calc.sum);

	}
}*/
