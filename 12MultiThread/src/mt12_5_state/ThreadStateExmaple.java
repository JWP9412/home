package mt12_5_state;

public class ThreadStateExmaple {
	public static void main(String[] args) {
		StatePrintThread statePrintThread =
				new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}

}
