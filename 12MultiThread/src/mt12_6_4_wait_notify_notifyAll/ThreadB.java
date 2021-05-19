package mt12_6_4_wait_notify_notifyAll;

public class ThreadB extends Thread {
	private WorkObject wo;
	
	public ThreadB(WorkObject wo) {
		this.wo =wo; // 공유 객체를 매개값으로 받아 필드에 저장
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) { // 공유 객체의 methodB() 를 10번 반복 호출
			wo.methodB();
		}
	}
}
