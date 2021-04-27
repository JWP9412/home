package chap7_2;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("»ï¼º", "Èò»ö", 10);

		System.out.println("model : "+dmbCellPhone.model);
		System.out.println("color : "+dmbCellPhone.color);
		
		System.out.println("channel : "+dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hi there");
		dmbCellPhone.receiveVoice("¾È³çÇÏ¼¼¿µ Àú´Â È«±æµ¿");
		dmbCellPhone.sendVoice("¾Æ hi");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
