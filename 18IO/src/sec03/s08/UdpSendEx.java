package sec03.s08;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSendEx {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();	//DatagramSocker ����
		
		System.out.println("[�߽� ����]");
		
		for(int i=1; i<3 ; i++) {
			String data = "�޽���" + i;
			byte[] bA = data.getBytes("UTF-8");
			DatagramPacket packet = new DatagramPacket(bA, bA.length, new InetSocketAddress("localhost",5001));	//DatagramPacket ����
			
			ds.send(packet);
			System.out.println("[���� ����Ʈ ��]" + bA.length + "bytes");
		}
		
		System.out.println("[�߽� ����]");
		
		ds.close();

	}

}
