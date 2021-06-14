package sec03.s06;

import java.net.InetAddress;

public class InetAddressEx {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("�� ��ǻ�� IP�ּ� : "+ local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP�ּ� : "+remote.getHostAddress());
			}
			InetAddress[] iaArr1 = InetAddress.getAllByName("www.google.com");
			for(InetAddress remote1 : iaArr1) {
				System.out.println("www.google.com IP�ּ� : "+remote1.getHostAddress());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
