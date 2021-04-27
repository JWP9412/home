package chap7_8_3abstract;
//실체 클래스
public class SmartPhone extends Phone{
	public SmartPhone(String owner) {
		super(owner);
	}
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
	
}
