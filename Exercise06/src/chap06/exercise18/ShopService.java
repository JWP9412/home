package chap06.exercise18;

/*[18]
 * ShopServie 객체를 싱글톤으로 만들고 ShopService 클래스에서 ShopService의 
 *  getInstance() 메소드로 싱글톤을 얻을 수 있도록 ShopService 클래스를 작성해.
 */
public class ShopService {
	private static ShopService static_shopService = new ShopService();
	//StackOverFlow Error
	//private ShopService shopService = new ShopService();
	private ShopService() {
	};

	public static ShopService getInstance() {
		return static_shopService;
	}
	//ShopService getInstance1() {
	//	return this.shopService;
	//}
}


