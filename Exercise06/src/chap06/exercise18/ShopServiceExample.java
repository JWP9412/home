package chap06.exercise18;

public class ShopServiceExample {

	public static void main(String[] args) {
		//ShopService obj3 = new ShopService;
		
		ShopService obj1 = ShopService.getInstance()	;
		ShopService obj2 = ShopService.getInstance()	;

		
		if(obj1 == obj2) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		/*ShopService obj3 = obj1.getInstance1();
		if(obj1 == obj3) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		if(obj2 == obj3) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}*/
	}

}
