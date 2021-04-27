package chap7_2;

public class DmbCellPhone extends Cellphone{
int channel;

DmbCellPhone(String model,String color,int channel){
	this.model = model;
	this.color = color;
	this.channel = channel;
}
void turnOnDmb() {
	System.out.println("채널 :"+channel+"번 DMB 방송 수신 시작");
}
void changeChannelDmb(int channel) {
	this.channel=channel;
	System.out.println("채널 :"+channel+"번으로 바꿈");
}
void turnOffDmb() {
	System.out.println("수신 종료");
}
}
