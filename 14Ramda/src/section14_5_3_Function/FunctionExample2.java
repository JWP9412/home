package section14_5_3_Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
			new Student("Lim",10,20),
			new Student("Pa",30,50));
	
	public static double avg(ToIntFunction<Student> function) {
		int sum=0;
		for(Student student : list) {
			sum += function.applyAsInt(student); //���ٽ� ����
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double engAvg = avg(s -> s.getEngScore()); // ToIntFunction<Student> �ν��Ͻ� ����
		System.out.println("���� ��� ���� : "+engAvg);
		
		double mathAvg = avg(s->s.getMathScore()); // ToIntFunction<Student> �ν��Ͻ� ����
		System.out.println("���� ��� ���� : "+mathAvg);
	}

}
