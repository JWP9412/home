package calc;

public class Calc {
	protected int sum;// �ڽ� Ŭ�������� ���� ���

	public Calc() {// �⺻ �����ڴ� ���������� ����� �ִ°� ����
		this.sum = 0;
	}

	public Calc(int sum) {
		this.sum = sum;
	}

	public int compute(int x) {
		this.sum += x;
		return this.sum;
	}

	public int getSum() {
		return this.sum;
	}
}
