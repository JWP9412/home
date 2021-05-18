package section14_5_API;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable r = () ->{
			for(int i =0;i<10;i++) {
				System.out.println(i);
			}
		};

		Thread thread = new Thread(r);
		thread.start();
	}

}
