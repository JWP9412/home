package mt12_9_3_Blocking_return_void;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ResultByRunnablExample {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("[작업 처리 요청]");
		class Task implements Runnable {
			Result result;

			Task(Result result) {
				this.result = result;
			}

			@Override
			public void run() {
				int sum = 0;
				for (int i = 0; i <= 10; i++) {
					sum += i;
				}
				result.addValue(sum);
			}
		}
		Result result = new Result();
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		Future<Result> future1 = es.submit(task1,result);
		Future<Result> future2 = es.submit(task2,result);

		try {
			result = future1.get();
			result = future2.get();
			System.out.println("[처리 결과]" + result.accumValue);
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		es.shutdown();
	}

}

class Result {
	int accumValue;

	synchronized void addValue(int value) {
		accumValue += value;
	}
}
