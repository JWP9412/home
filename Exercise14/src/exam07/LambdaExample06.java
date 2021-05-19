package exam07;

import java.util.function.ToIntFunction;

public class LambdaExample06 {
	private static Student[] students = { new Student("Hong", 90, 96), new Student("Shin", 95, 93) };

	// avg() 메소드 작성
	public static double avg(ToIntFunction<Student> tif) {
		int sum = 0;
		for (Student student : students) {
			sum += tif.applyAsInt(student);
		}
		return (double) sum/students.length;
	}

	public static void main(String[] args) {
		double engAvg = avg(s -> s.getEngScore());
		System.out.println("Eng Avg : " + engAvg);
		double engAvg1 = avg(Student :: getEngScore);
		System.out.println("Eng Avg1 : " + engAvg1);

		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("Math Avg : " + mathAvg);
		double mathAvg1 = avg(Student :: getMathScore);
		System.out.println("Math Avg1 : " + mathAvg1);
	}

	public static class Student {
		private String name;
		private int engScore;
		private int mathScore;

		public Student(String name, int engScore, int mathScore) {
			this.name = name;
			this.engScore = engScore;
			this.mathScore = mathScore;
		}

		public String getName() {
			return name;
		}

		public int getEngScore() {
			return engScore;
		}

		public int getMathScore() {
			return mathScore;
		}
	}
}
