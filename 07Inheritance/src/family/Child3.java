package family;
/*
 * 부모가 가지고 있는 필드(money)를 자식이 다시 정의 할 수 있다
 * 부모의 메소드를 통해서 부모에 정의된 필드 (money)에 접근하게 되면
 * 자신의 필드가 (money)가 아닌 부모의 필드(money)를 값을 참조하게 된다
 */

public class Child3 extends Parent	{
	int money = 900;
	int stock = 700;
	
	void print(String title) {
		int parentMoney = super.money;//부모 속성에 접근
		System.out.println("Super money : "+parentMoney);
		System.out.printf("C3 [%s] money = (%d) , stock =(%d)\n",title, this.money,this.stock);
	}
	
	int addStock(int stock	) {
		this.stock += stock;
		return this.stock;
	}
}
