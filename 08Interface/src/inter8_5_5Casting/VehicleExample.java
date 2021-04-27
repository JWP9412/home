package inter8_5_5Casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.chekFare(); //Vehicle 인터페이스에는 checkFare ()가없다
		
		Bus bus = (Bus)vehicle; //강제 타입 변환
		
		bus.run();
		bus.checkFare(); // Bus클래스에는 checkFare()가 있음

	}

}
