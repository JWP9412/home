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
	// ���⼭ �ۼ�

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
