package mt12_6_2_yield;

public class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) { // stop�� true�� �Ǹ� while�� ����
			if(work) {
				System.out.println("ThreadB runs");
			}else {
				Thread.yield(); // work�� false�� �Ǹ� �ٸ� �����忡�� ���� �纸
			}
		}
		System.out.println("ThreadB ends");
	}
}
