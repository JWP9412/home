package pf;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GraphicExample {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null); // 자동으로 화면 중앙에 배치
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
		        // 선을 그어준다.
		        
		        //g.drawString("하하하",0,50);
		        // 문자를 그려준다. ( 문자, x좌표, y좌표 )
		        
		       // g.drawRect( 10, 70, 100, 40);
		        // 사각형을 그린다. ( x좌표, y좌표, 가로길이, 세로길이 )
		        
		        //g.drawOval( 10, 120, 100, 40);
		        // 타원을 그린다.
		        
		        g.setColor( new Color(255,0,0) ); //색상을 설정한다.     
		        //g.fillRect( 10, 170, 100, 40); // 색상으로 채운 사각형을 그린다.
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
