package mt12_6_2_yield;
// 스레드 실행 양보 예제
public class YieldExample {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();

		ta.start();
		tb.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		ta.work = false;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		ta.work = true;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		ta.stop = true;
		tb.stop = true;
	}

}
