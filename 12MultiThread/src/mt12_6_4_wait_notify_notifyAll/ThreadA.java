package mt12_6_4_wait_notify_notifyAll;

public class ThreadA extends Thread {
	private WorkObject wo;
	
	public ThreadA(WorkObject wo) {
		this.wo =wo;// ���� ��ü�� �Ű������� �޾� �ʵ忡 ����
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {// ���� ��ü�� methodB() �� 10�� �ݺ� ȣ��
			wo.methodA();
		}
	}
	public void run2() {
		for(int k=1; k<10;k++) {
			System.out.println(k);
		}
	}
}
