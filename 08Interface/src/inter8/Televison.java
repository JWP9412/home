package inter8;
//���� Ŭ����
public abstract class Televison implements RemoteControl {
//�ʵ�
	private int volume;
	
	//turnOn(); �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("TV�� ŵ�ϴ�");
	}
	//turnOff(); �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff(int volume) {
		
	}
	
	public void setVolume(int volume) {
		if(volume<RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� Tv ���� : "+ volume);
	}
}
