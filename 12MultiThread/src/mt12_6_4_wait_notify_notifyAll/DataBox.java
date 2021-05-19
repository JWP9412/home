package mt12_6_4_wait_notify_notifyAll;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) { // data �ʵ尡 null �̸� �Һ��� �����带 �Ͻ� ���� ���·� ����
			try {
				wait();
			} catch (Exception e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread�� ���� ������ : " + returnValue);
		data = null;
		notify();
		return returnValue;
	}
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				
			} catch (Exception e) {}
		}
		this.data = data;
		System.out.println("ProducerThread�� ������ ������ : "+data);
		notify();
	}
	
}
