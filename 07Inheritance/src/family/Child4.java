package family;
/*
 * 부모가 가지고 있는 필드(money)를 자식이 다시 정의 할 수 있다
 * 부모의 메소드를 통해서 부모에 정의된 필드 (money)에 접근하게 되면
 * 자신의 필드가 (money)가 아닌 부모의 필드(money)를 값을 참조하게 된다
 */

public class Child4 extends Parent	{
	int money = 900;
	int stock = 700;
	
	Child4(){
		super("444"); // 부모의 생성자를 호출
		System.out.printf("Child4.Child4 (%d)\n",this.money);
		this.money += super.money;
	}
	/*
	 * 메소드 재정의(Overriding)
	 * 부모(Parent)에 정의되어 있는 메소드(print)를 자식(Child)에서 다시 정의(재정의/overriding)
	 * 재정의(교체)는 상속관계에 있을 때 자식 클래스에서 메소드를 교체할 때 사용한다
	 */
	
	void print(String title) {
		int parentMoney = super.money;//부모 속성에 접근
		System.out.printf("C4 [%s] money = (%d) ,parentMoney(superMoney) = (%d), stock =(%d)\n",
				title, this.money,super.money,this.stock);
	}
	
	int addStock(int stock	) {
		this.stock += stock;
		return this.stock;
	}
}
