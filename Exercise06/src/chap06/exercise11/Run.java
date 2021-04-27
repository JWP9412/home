package chap06.exercise11;

public class Run {

	public static void main(String[] args) {
		System.out.println("Abc Test!");
		Abc abc = new Abc(10,20);
		System.out.printf("Abc : x(%d),y(%d)\n", abc.x,abc.y);
		System.out.printf("Abc : z(%d)\n", abc.z);
	}

}
