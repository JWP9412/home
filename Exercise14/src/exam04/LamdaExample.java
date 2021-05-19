package exam04;

import java.util.function.IntSupplier;

public class LamdaExample {
	public static int method(int x, int y) {
		IntSupplier supplier = () -> {
			//x *= 10; //매개 변수, 로컬 변수는 final 특성을 갖기 때문
			int result = x + y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}

	public static void main(String[] args) {
		System.out.println(method(3, 5));
		

	}

}
