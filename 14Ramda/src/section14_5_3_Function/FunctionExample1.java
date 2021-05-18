package section14_5_3_Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	private static List<Student>list = Arrays.asList(
			new Student("kim",90,96),
			new Student("shin",95,93)
			);
	
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {// list�� ����� �׸� ����ŭ ����
			System.out.print(function.apply(student)+" ");

		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {// list�� ����� �׸� ����ŭ ����
			System.out.print(function.applyAsInt(student)+" ");

		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[�л� �̸�]");
		printString(t -> t.getName());
		
		System.out.println("[���� ����]");
		printInt(t -> t.getEngScore());
		
		System.out.println("[���� ����]");
		printInt(t -> t.getMathScore());
	}
}
