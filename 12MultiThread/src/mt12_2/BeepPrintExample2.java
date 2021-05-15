package mt12_2;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("뿅");
			try {Thread.sleep(500);}catch (Exception e) {} // 0.5초간 일시 정지
		}

	}

}
