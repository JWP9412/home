package inter8_3multiImplements;

import inter8.RemoteControl;

public class SmartTelevision implements	RemoteControl, Searchable {

	//�ʵ�
		private int volume;
		
		//turnOn(); �߻� �޼ҵ��� ��ü �޼ҵ�
		public void turnOn() {
			System.out.println("TV�� ŵ�ϴ�");
		}
		//turnOff(); �߻� �޼ҵ��� ��ü �޼ҵ�
		public void turnOff() {
			
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
		public void search(String url) {
			System.out.println(url + "�� �˻��մϴ�.");
		}
}
