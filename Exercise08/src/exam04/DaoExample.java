package exam04;

public class DaoExample {
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		
	}
	
	public static void main(String[] args	) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
	
	
}
class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("Oracle DB���� �˻�");
		
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB�� ����");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB�� ����");
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB���� ����");
		
	}
	
}

class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySqlDao DB���� �˻�");
		
	}

	@Override
	public void insert() {
		System.out.println("MySqlDao DB�� ����");
		
	}

	@Override
	public void update() {
		System.out.println("MySqlDao DB�� ����");
		
	}

	@Override
	public void delete() {
		System.out.println("MySqlDao DB���� ����");
		
	}
	
}