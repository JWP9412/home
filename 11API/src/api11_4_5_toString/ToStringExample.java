package api11_4_5_toString;

import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		String str1 = "�����";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2,"�̸��� �����ϴ�"));
	}

}
