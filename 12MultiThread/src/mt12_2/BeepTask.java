package mt12_2;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // ��Ŷ ��ü ���
		for(int i=0; i<5;i++) {
			toolkit.beep();	// ������ �߻�
			try {Thread.sleep(500);}catch(Exception e) {} // 0.5�ʰ� �Ͻ� ����
		}

	}

}