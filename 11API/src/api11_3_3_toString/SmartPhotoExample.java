package api11_3_3_toString;

public class SmartPhotoExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����","�ȵ���̵�");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
	}

}
