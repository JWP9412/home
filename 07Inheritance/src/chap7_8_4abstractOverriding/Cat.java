package chap7_8_4abstractOverriding;
//추상 메소드 오버라이딩
public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	public void sound() {
		System.out.println("야옹");
	}

}
