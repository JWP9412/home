package mt12_6_4_wait_notify_notifyAll;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) { // data 필드가 null 이면 소비자 스레드를 일시 정지 상태로 만듬
			try {
				wait();
			} catch (Exception e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터 : " + returnValue);
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
		System.out.println("ProducerThread가 생성한 데이터 : "+data);
		notify();
	}
	
}
