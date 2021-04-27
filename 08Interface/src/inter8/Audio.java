package inter8;

public abstract class Audio implements RemoteControl {
	//필드
	private int volume;
	
	//turnOn() 추상 메소드의 실체 메소드
	public void turenOn() {
		System.out.println("오디오를 킵니다");
	}
	//turnOff() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME	) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨 : "+volume);
	}
}
