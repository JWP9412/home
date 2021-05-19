package mt12_9_2_Runnable_Callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {

	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(2); // �ִ� ������ ������ 2�� ������Ǯ ����
		
		for(int i=0; i<10; i++) {
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					// �׷��� �� ���� �� �۾� ������ �̸� ���
					ThreadPoolExecutor threadPoolExecutor =
							(ThreadPoolExecutor) es;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ ���� : "+poolSize + "] �۾� ������ �̸� : "+threadName);
					//���� �߻� ��Ŵ
					int value = Integer.parseInt("��");
				}
			};
			
			es.execute(runnable);
			//es.submit(runnable);
			
			Thread.sleep(10); // �ֿܼ� ��� �ð��� �ֱ� ���� 0.1�� �Ͻ� ������Ŵ
			
		}
			es.shutdown();
	}

}
