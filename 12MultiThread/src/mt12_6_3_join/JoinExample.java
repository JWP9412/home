package mt12_6_3_join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread st = new SumThread();
		st.start();
		
		
		try {
			st.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("1~100 гу : "+st.getSum());
	}

}
