package inter8_5_5Casting;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("Bus is running");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다");
	}
}
