package mt12_5_state;

public class TargetThread extends Thread{
	public void run() {
		for(long i = 0; i<100000000;i++) {}
		
		try {
			//1.5�ʰ� �Ͻ�����
			Thread.sleep(1500);
		}catch (Exception e) {}
		
		for(long i = 0; i<100000000;i++) {}
	}
}
