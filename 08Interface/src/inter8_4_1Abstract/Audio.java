package inter8_4_1Abstract;

public class Audio implements RemoteControl {
	//필드
	private int volume;
	private boolean mute;
	
	//turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("오디오를 킵니다");
	}
	//turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("오디오를 끕니다");
	}
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
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("오디오 무음 처리합니다");
		}else {
			System.out.println("오디오 무음 해제합니다");
		}
	}
}
