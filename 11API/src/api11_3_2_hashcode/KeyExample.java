package api11_3_2_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key,String>();
		
		//�ĺ�Ű "new Key(1)"�� "ȫ�浿"�� ������
		hashMap.put(new Key(1), "ȫ�浿");
		
		//�ĺ�Ű "new Key(1)"�� "ȫ�浿"�� �ҷ���
		String value = hashMap.get(new Key(1));
		System.out.println(value);

	}

}