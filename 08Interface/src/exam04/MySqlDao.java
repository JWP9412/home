package exam04;

public class MySqlDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("���� ��񿡼� �˻�");
	}
	
	public void insert() {
		System.out.println("���� ��� ����");
	}
	
	public void update() {
		System.out.println("���� ��� ����");
	}
	
	public void delect() {
		System.out.println("���� ��񿡼� ����");
	}
}
