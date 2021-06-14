package sec03.s08;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSendEx {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();	//DatagramSocker 생성
		
		System.out.println("[발신 시작]");
		
		for(int i=1; i<3 ; i++) {
			String data = "메시지" + i;
			byte[] bA = data.getBytes("UTF-8");
			DatagramPacket packet = new DatagramPacket(bA, bA.length, new InetSocketAddress("localhost",5001));	//DatagramPacket 생성
			
			ds.send(packet);
			System.out.println("[보낸 바이트 수]" + bA.length + "bytes");
		}
		
		System.out.println("[발신 종료]");
		
		ds.close();

	}

}
