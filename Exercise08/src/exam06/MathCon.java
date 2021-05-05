package exam06;

public class MathCon implements Math {
	int sum;

	@Override
	public void plus(int p) {
		System.out.print(sum);
		sum += p;
		System.out.println(" + " + p + " = " + sum);

	}

	@Override
	public void minus(int mi) {
		System.out.print(sum);
		sum -= mi;
		System.out.println(" - " + mi + " = " + sum);
	}

	@Override
	public void multiple(int mu) {
		System.out.print(sum);
		sum *= mu;
		System.out.println(" * " + mu + " = " + sum);
	}

	@Override
	public void divide(int d) {
		System.out.print(sum);
		sum /= d;
		System.out.println(" / " + d + " = " + sum);
	}

	public static void main(String[] args) {
		
		Math mc = new MathCon();
		
		mc.plus(1);
		mc.minus(3);
		mc.multiple(-3);
		mc.divide(2);
		mc.plus(2);

	}

}
