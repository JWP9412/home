package mt12_6_5_stop_interrupt;

public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
		}
		thread.interrupt();

	}

}
