package mt12_6_5_stop_interrupt;

public class PrintThread2 extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("���� ��");
				//Thread.sleep(1);
				if(Thread.interrupted()) {
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
