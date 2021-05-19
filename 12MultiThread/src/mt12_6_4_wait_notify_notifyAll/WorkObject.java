package mt12_6_4_wait_notify_notifyAll;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA �� methodA() �۾� ����");
		notify();	// �Ͻ� ���� ���¿� �ִ� ThreadB�� ���� ��� ���·� ����
		try {
			wait();	// ThreadA�� �Ͻ� ���� ���·� ����
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public synchronized void methodB() {
		System.out.println("ThreadA �� methodB() �۾� ����");
		notify();	// �Ͻ� ���� ���¿� �ִ� ThreadA�� ���� ��� ���·� ����
		try {
			wait();	// ThreadB�� �Ͻ� ���� ���·� ����
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
