package sec03.s08;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveEx extends Thread {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("[���� ����]");
				try {
					while(true) {
						DatagramPacket packet = new DatagramPacket(new byte[100], 100);
						ds.receive(packet);
						
						String data = new String(packet.getData(),0,packet.getLength(),"UTF-8");
						System.out.println("[���� ���� :"+packet.getSocketAddress() + "]" + data);
					}
				} catch (Exception e) {
					System.out.println("[���� ����]");
				}
			}
		};
		thread.start();
		
		Thread.sleep(1000);
		ds.close();

	}

}
