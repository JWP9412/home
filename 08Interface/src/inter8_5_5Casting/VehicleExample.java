package inter8_5_5Casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.chekFare(); //Vehicle �������̽����� checkFare ()������
		
		Bus bus = (Bus)vehicle; //���� Ÿ�� ��ȯ
		
		bus.run();
		bus.checkFare(); // BusŬ�������� checkFare()�� ����

	}

}
