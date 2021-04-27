package inter8_4_1Abstract;

public class RemoteContoreExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		RemoteControl.changeBattery();
		
		rc= new Televison();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		rc= new Audio();
		rc.turnOn();
		rc.turnOff();
		
		rc.setMute(true);

	}

}
