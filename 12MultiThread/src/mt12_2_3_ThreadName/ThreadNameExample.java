package mt12_2_3_ThreadName;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mt = Thread.currentThread(); // �� �ڵ带 �����ϴ� ������ ��ü ���
		System.out.println("���α׷� ���� ������ �̸� : "+mt.getName());
		
		ThreadA ta = new ThreadA();
		System.out.println("�۾� ������ �̸� : "+ ta.getName());
		ta.start();
		
		ThreadB tb = new ThreadB();
		System.out.println("�۾� ������ �̸� : "+ tb.getName());
		tb.start();

	}

}
