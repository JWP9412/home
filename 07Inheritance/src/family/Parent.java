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
	/*�����ڳ� �޼ҵ��� �Ķ������ ���������� �ĺ����� �ʴ´�
	 * �ñ״�ó: ����Ÿ��, �޼ҵ��̸�, �Ķ���� Ÿ��
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
