package mt12_8_3_interrupt;

public class WorkThreadExample {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread wtA	= new WorkThread(myGroup, "workThreadA");
		WorkThread wtB	= new WorkThread(myGroup, "workThreadB");
		
		wtA.start();
		wtB.start();
		
		System.out.println("[main 스레드 그룹의 list() 메소드 출력 내용]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		System.out.println("[myGroup 스레드 그룹의 interrupt() 메소드 호출]");
		myGroup.interrupt();
	}

}
