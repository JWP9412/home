package chap7_7_3array;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 10; i++) {
			int problemLocation = car.run();
			if (problemLocation != 0) {
				System.out.println("problemLocation : "+ problemLocation);
				System.out.println("problemLocation -1 : "+ (problemLocation-1));
				System.out.println("car.tires["+i+"] 위치 : ");
				System.out.println(car.tires[problemLocation - 1].location + " : HankookTire로 교체");
				car.tires[problemLocation - 1] = new HankookTire(car.tires[problemLocation - 1].location, 15);
			}
			System.out.println("----------------------------------------------------");
		}

	}
}
