package chap7_2;

public class Cellphone {
String model;
String color;

void powerOn() {System.out.println("on");}
void powerOff() {System.out.println("off");}
void bell() {System.out.println("belling");}
void sendVoice(String message) {System.out.println("자기 : "+message);}
void receiveVoice(String message) {System.out.println("상대방 : "+message);}
void hangUp() {System.out.println("끊다");}

}
