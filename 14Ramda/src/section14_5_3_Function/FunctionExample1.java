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
		for(Student student : list) {// list에 저장된 항목 수만큼 루핑
			System.out.print(function.apply(student)+" ");

		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {// list에 저장된 항목 수만큼 루핑
			System.out.print(function.applyAsInt(student)+" ");

		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString(t -> t.getName());
		
		System.out.println("[영어 점수]");
		printInt(t -> t.getEngScore());
		
		System.out.println("[수학 점수]");
		printInt(t -> t.getMathScore());
	}
}
