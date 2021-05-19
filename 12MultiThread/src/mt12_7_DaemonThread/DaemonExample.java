package mt12_7_DaemonThread;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true);
		ast.start();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("메인 스레드 종료");
	}
}
