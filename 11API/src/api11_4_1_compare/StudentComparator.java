package api11_4_1_compare;
//�л� ��ȣ ����
public class StudentComparator implements Comparable<Student>{
	@Override
	public int compare(Student a,Student b) {
		if(a.sno<b.sno)return -1;
		else if(a.sno == b.sno)return 0;
		else return 1;
	}
}
