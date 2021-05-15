package mt12_2;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 툴킷 객체 얻기
		for(int i=0; i<5;i++) {
			toolkit.beep();	// 비프음 발생
			try {Thread.sleep(500);}catch(Exception e) {} // 0.5초간 일시 정지
		}

	}

}
