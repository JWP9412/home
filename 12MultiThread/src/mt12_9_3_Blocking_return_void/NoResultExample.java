package mt12_9_3_Blocking_return_void;
//리턴값이 있는 작업 완료 통보
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[작업 처리 요청]");
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				int sum = 0;
				for(int i =1; i<=10 ; i++) {sum += i;}
				System.out.println("[처리 결과] "+ sum);
				
			}
		};
		Future future =es.submit(runnable);
		
		try {
			future.get();
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) {
			System.out.println("[실행 예외 발생함"+e.getMessage());
		}
		es.shutdown();
	}
}
