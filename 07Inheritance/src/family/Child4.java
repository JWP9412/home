package family;
/*
 * �θ� ������ �ִ� �ʵ�(money)�� �ڽ��� �ٽ� ���� �� �� �ִ�
 * �θ��� �޼ҵ带 ���ؼ� �θ� ���ǵ� �ʵ� (money)�� �����ϰ� �Ǹ�
 * �ڽ��� �ʵ尡 (money)�� �ƴ� �θ��� �ʵ�(money)�� ���� �����ϰ� �ȴ�
 */

public class Child4 extends Parent	{
	int money = 900;
	int stock = 700;
	
	Child4(){
		super("444"); // �θ��� �����ڸ� ȣ��
		System.out.printf("Child4.Child4 (%d)\n",this.money);
		this.money += super.money;
	}
	/*
	 * �޼ҵ� ������(Overriding)
	 * �θ�(Parent)�� ���ǵǾ� �ִ� �޼ҵ�(print)�� �ڽ�(Child)���� �ٽ� ����(������/overriding)
	 * ������(��ü)�� ��Ӱ��迡 ���� �� �ڽ� Ŭ�������� �޼ҵ带 ��ü�� �� ����Ѵ�
	 */
	
	void print(String title) {
		int parentMoney = super.money;//�θ� �Ӽ��� ����
		System.out.printf("C4 [%s] money = (%d) ,parentMoney(superMoney) = (%d), stock =(%d)\n",
				title, this.money,super.money,this.stock);
	}
	
	int addStock(int stock	) {
		this.stock += stock;
		return this.stock;
	}
}
