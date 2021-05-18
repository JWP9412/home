package exam06;

import java.util.function.Predicate;

public class LambdaExample06 {
	private static Student[] students = { new Student("Hong", 90, 96), new Student("Shin", 95, 93) };

	// avg() 메소드 작성
	public static double avg(Predicate<Student> pr) {
		int cnt = 0, esum = 0, msum = 0;
		for (Student student : students) {
			if (pr.test(student)) {
				cnt++;
				esum += student.getEngScore();
				msum += student.getMathScore();
			}
		}
		return (double) esum/cnt;
	}

	public static void main(String[] args) {
		double engAvg = avg(s -> s.getEngScore());
		System.out.println("Eng Avg : " + engAvg);

		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("Math Avg : " + mathAvg);

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
