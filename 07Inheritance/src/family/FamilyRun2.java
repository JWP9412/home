package family;

public class FamilyRun2 {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child3 child3 = new Child3();

		System.out.println("Parent == Child : " + (parent == child3));

		System.out.println("Parent : money = " + parent.money);
		System.out.println("Child : money = " + child3.money);

		parent.print("ºÎ¸ð");
		child3.print("ÀÚ³à");
		
		child3.addStock(3000000);
		System.out.println(child3.stock);
	}

}
