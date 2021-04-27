package inter8_5_3PromotionArray;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println();
		myCar.tires[0] =new KumhoTire();
		myCar.tires[2] = new KumhoTire()	;
		
		myCar.run();
	}

}
