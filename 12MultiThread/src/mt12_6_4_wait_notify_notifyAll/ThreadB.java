package mt12_6_4_wait_notify_notifyAll;

public class ThreadB extends Thread {
	private WorkObject wo;
	
	public ThreadB(WorkObject wo) {
		this.wo =wo; // ���� ��ü�� �Ű������� �޾� �ʵ忡 ����
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) { // ���� ��ü�� methodB() �� 10�� �ݺ� ȣ��
			wo.methodB();
		}
	}
}
