package mt12_6_2_yield;

public class ThreadA extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) { // stop이 true가 되면 while문 종료
			if(work) {
				System.out.println("ThreadA runs");
			}else {
				Thread.yield(); // work가 false가 되면 다른 스레드에게 실행 양보
			}
		}
		System.out.println("ThreadA ends");
	}
}
