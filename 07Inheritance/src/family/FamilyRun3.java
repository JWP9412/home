package family;

public class FamilyRun3 {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child3 child3 = new Child3();

		System.out.println("Parent == Child : " + (parent == child3));

		System.out.println("Parent : money = " + parent.money);
		System.out.println("Child : money = " + child3.money);

		parent.print("�θ�");
		//parent.addStock(200); //�θ�� �ڽ��� �ʵ� �� �޼ҵ� ���� �Ұ�
		
		child3.addStock(200);
		child3.print("�ڳ�");
	}

}
