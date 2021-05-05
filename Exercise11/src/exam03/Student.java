package exam03;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;

		// this.num = Integer.parseInt(studentNum);
	}

	public String getStudentNum() {
		return studentNum;
	}
	// 여기서 작성

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			if (studentNum.equals(stu.studentNum)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {

		return studentNum.hashCode();
	}
}
