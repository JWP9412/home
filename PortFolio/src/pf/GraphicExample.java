package pf;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GraphicExample {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null); // �ڵ����� ȭ�� �߾ӿ� ��ġ
		f.setSize(256, 256);
		f.setVisible(true);

		MyGraphic g = new MyGraphic();
		f.add(g);
	}
}
	class MyGraphic extends JButton {

		public void paintComponent(Graphics g) {
			 g.drawLine(0, 128, 256, 128);
			 g.drawLine(128, 0, 128, 256);
			 //g.drawLine(FRAMEBITS, ERROR, ALLBITS, ABORT);
		        // ���� �׾��ش�.
		        
		        //g.drawString("������",0,50);
		        // ���ڸ� �׷��ش�. ( ����, x��ǥ, y��ǥ )
		        
		       // g.drawRect( 10, 70, 100, 40);
		        // �簢���� �׸���. ( x��ǥ, y��ǥ, ���α���, ���α��� )
		        
		        //g.drawOval( 10, 120, 100, 40);
		        // Ÿ���� �׸���.
		        
		        g.setColor( new Color(255,0,0) ); //������ �����Ѵ�.     
		        //g.fillRect( 10, 170, 100, 40); // �������� ä�� �簢���� �׸���.
		        g.fillOval(128-3, 128-3, 6,6);
		        
		        g.fillOval(128-3+(-64), 128-3-(+32), 6,6);
		        g.fillOval(128-3+(-14), 128-3-(+62), 6,6);
		        g.fillOval(128-3+25, 128-3-(-30), 6,6);
		        g.fillOval(128-3+34, 128-3-(+44), 6,6);
		        g.fillOval(128-3+47, 128-3-(+1), 6,6);
		        g.fillOval(128-3+(-5), 128-3-(-30), 6,6);
		        
			
			System.out.println(1);
		}
	}
//	xP      : -64.30428043639479  || yP      : 31.784947946938697
//	xColorA : -14                 || yColorA : 62
//	xNewA	: 34.08152592218151   || yNewA   : 43.66487404004446
//	xNewB 	: 47.21317181989431   || yNewB   : 0.8687390224244561
//	xColorB : 25                  || yColorB : -30
//	xM      : -30.296615295254878 || yM      : -5.980955894902584
