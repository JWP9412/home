package chap7_8_4abstractOverriding;
//추상 메소드 선언
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉰다");
	}
	public abstract void sound();

}
