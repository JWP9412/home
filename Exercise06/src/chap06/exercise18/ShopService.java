package chap06.exercise18;

/*[18]
 * ShopServie ��ü�� �̱������� ����� ShopService Ŭ�������� ShopService�� 
 *  getInstance() �޼ҵ�� �̱����� ���� �� �ֵ��� ShopService Ŭ������ �ۼ���.
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


