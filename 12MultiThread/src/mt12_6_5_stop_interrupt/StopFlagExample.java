package mt12_6_5_stop_interrupt;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 pt = new PrintThread1();
		pt.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		pt.setStop(true);
	}
}
