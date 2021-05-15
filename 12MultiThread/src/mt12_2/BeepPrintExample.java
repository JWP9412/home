package mt12_2;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 툴킷 객체 얻기
		for(int i=0; i<5;i++) {
			toolkit.beep();	// 비프음 발생
			try {Thread.sleep(500);}catch(Exception e) {} // 0.5초간 일시 정지
			}
		
		for(int i=0;i<5;i++) {
			System.out.println("뿅");
			try {Thread.sleep(500);}catch (Exception e) {} // 0.5초간 일시 정지
		}

	}

}
