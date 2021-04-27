package family;

public class Parent {
	int money = 100;
	
	Parent(){
		System.out.printf("Parent.Parent(%d) 1\n",this.money);
	}
	
	Parent(int money){
		this.money = money;
		System.out.printf("Parent.Parent(%d) 2\n",this.money);
	}
	/*생성자나 메소드의 파라미터의 변수명으로 식별하지 않는다
	 * 시그니처: 리턴타입, 메소드이름, 파라미터 타입
	 * Parent(int money1){
		this.money = money;
		System.out.printf("Parent.Parent(%d) 2\n",this.money);
	}
	 */
	
	Parent(String strMoney){
		this.money = Integer.parseInt(strMoney);
		System.out.printf("Parent.Parent(%d) 3\n",this.money);
	}
	void print(String title) {
		System.out.printf("P [%s] money = (%d)\n",title, this.money);
	}
}
