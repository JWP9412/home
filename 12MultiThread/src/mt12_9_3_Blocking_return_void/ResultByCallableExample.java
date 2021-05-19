package mt12_9_3_Blocking_return_void;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//���ϰ��� �ִ� �۾� �Ϸ� �뺸
public class ResultByCallableExample {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("[�۾� ó�� ��û]");
		Callable<Integer> task = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				return sum;
			}
		};
		Future<Integer> future = es.submit(task);

		try {
			int sum = future.get();
			System.out.println("[ó�� ���] " + sum);
			System.out.println("[�۾� ó�� �Ϸ�");
		} catch (Exception e) {
			System.out.println("[���� ���� �߻���]" + e.getMessage());
		}
		es.shutdown();
	}

}
