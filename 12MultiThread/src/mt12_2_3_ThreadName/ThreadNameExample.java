package mt12_2_3_ThreadName;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mt = Thread.currentThread(); // 이 코드를 실행하는 스레드 객체 얻기
		System.out.println("프로그램 시작 스레드 이름 : "+mt.getName());
		
		ThreadA ta = new ThreadA();
		System.out.println("작업 스레드 이름 : "+ ta.getName());
		ta.start();
		
		ThreadB tb = new ThreadB();
		System.out.println("작업 스레드 이름 : "+ tb.getName());
		tb.start();

	}

}
