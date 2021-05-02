package api11_15_Format;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		String id = "java";
		String name = "�ſ��";
		String tel = "010-123-5678";
		
		String text = "ȸ�� ID : {0} \nȸ�� �̸� :  {1} \nȸ�� ��ȭ : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sql = "insert into member values( {0}, {1}, {2} )";
		Object[] arguments1 = {"'java'","'�ſ��'","'010-123-4567'"};
		String result2 = MessageFormat.format(sql, arguments1);
		System.out.println(result2);
		}

	}


