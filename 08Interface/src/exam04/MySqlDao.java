package exam04;

public class MySqlDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("마이 디비에서 검색");
	}
	
	public void insert() {
		System.out.println("마이 디비에 삽입");
	}
	
	public void update() {
		System.out.println("마이 디비에 수정");
	}
	
	public void delect() {
		System.out.println("마이 디비에서 삭제");
	}
}
