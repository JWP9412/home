package family;
/*
 * �θ� ������ �ִ� �ʵ�(money)�� �ڽ��� �ٽ� ���� �� �� �ִ�
 * �θ��� �޼ҵ带 ���ؼ� �θ� ���ǵ� �ʵ� (money)�� �����ϰ� �Ǹ�
 * �ڽ��� �ʵ尡 (money)�� �ƴ� �θ��� �ʵ�(money)�� ���� �����ϰ� �ȴ�
 */

public class Child3 extends Parent	{
	int money = 900;
	int stock = 700;
	
	void print(String title) {
		int parentMoney = super.money;//�θ� �Ӽ��� ����
		System.out.println("Super money : "+parentMoney);
		System.out.printf("C3 [%s] money = (%d) , stock =(%d)\n",title, this.money,this.stock);
	}
	
	int addStock(int stock	) {
		this.stock += stock;
		return this.stock;
	}
}
