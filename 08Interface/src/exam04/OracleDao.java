package exam04;

public class OracleDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("����Ŭ ��񿡼� �˻�");
	}
	
	public void insert() {
		System.out.println("����Ŭ ��� ����");
	}
	
	public void update() {
		System.out.println("����Ŭ ��� ����");
	}
	
	public void delect() {
		System.out.println("����Ŭ ��񿡼� ����");
	}
}
