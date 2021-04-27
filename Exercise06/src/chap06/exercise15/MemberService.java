package chap06.exercise15;



/*
 * [15] MemberService 클래스 선언
 * 	login(id, passsword)
 * 	logout(id)
 * 		
 */
public class MemberService {
	private static final String MEMBER_ID = "hong";
	private static final String MEMBER_PW = "1234";

	boolean logined = false;

	MemberService() {
	}

	boolean login(String id, String password) {
		if (id.equals(MEMBER_ID) && password.equals(MEMBER_PW)) {
			logined = true;
			return true;
		} else {
			return false;
		}

	}

	void logout(String id) {
		if (logined && id.equals(MEMBER_ID)) {
			System.out.printf("id(%s)가 로그아웃\n", id);
			logined = false;
			return;
		}
		System.out.printf("id(%s)가 없거나 이미 로그아웃 되었습니다 \n", id);
	}

	public static void main(String[] args) {
		MemberService m = new MemberService();
		if (m.login("hong", "1234")) {
			System.out.println("log in");
		} else {
			System.out.println("fail");
		}
		
		m.logout("hong");
		m.logout("hong");

	}
}
