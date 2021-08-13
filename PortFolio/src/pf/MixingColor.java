package pf;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class MixingColor {

	public static void main(String[] args) {
		BufferedImage TargetColor = null;
		BufferedImage CompareColor = null;
		
		RgbToLab rtl = new RgbToLab();

		try {
			TargetColor = ImageIO.read(new File("C:/colorlist/mcolor/black.png"));
			CompareColor = ImageIO.read(new File("C:/colorlist/mcolor/white.png"));

			int x1 = TargetColor.getWidth(null);
			int y1 = TargetColor.getHeight(null);

			Color color1 = new Color(0, 0, 0);
			Color color2 = new Color(0, 0, 0);
			int avgRed1 = 0;
			int avgGreen1 = 0;
			int avgBlue1 = 0;

			int avgRed2 = 0;
			int avgGreen2 = 0;
			int avgBlue2 = 0;

			for (int width = 0; width < x1; width++) {
				for (int height = 0; height < y1; height++) {
					color1 = new Color(TargetColor.getRGB(width, height));
					avgRed1 += color1.getRed();
					avgGreen1 += color1.getGreen();
					avgBlue1 += color1.getBlue();

					color2 = new Color(CompareColor.getRGB(width, height));
					avgRed2 += color2.getRed();
					avgGreen2 += color2.getGreen();
					avgBlue2 += color2.getBlue();
				}

			}
			avgRed1 = avgRed1 /(x1 * y1);
			avgGreen1 = avgGreen1 /(x1 * y1);
			avgBlue1 = avgBlue1 /(x1 * y1);
			
			avgRed2 = avgRed2 /(x1 * y1);
			avgGreen2 = avgGreen2 /(x1 * y1);
			avgBlue2 = avgBlue2 /(x1 * y1);
			
			double TcValue[] = rtl.rgbToLab(avgRed1, avgGreen1, avgBlue1);
			double CcValue[] = rtl.rgbToLab(avgRed2, avgGreen2, avgBlue2);
			double gab[] = {TcValue[0]-CcValue[0],TcValue[1]-CcValue[1],TcValue[2]-CcValue[2]};
			
			
			System.out.printf("목표색(Lab) \n" + "L* : %.1f \n" + "a* : %.1f \n" + "b* : %.1f \n", TcValue[0], TcValue[1], TcValue[2]);
			System.out.printf("목표색(RGB) \n" + "R : %d \n" + "G : %d \n" + "B : %d \n", avgRed1 ,
					avgGreen1 , avgBlue1 );

			System.out.printf("비교색(Lab) \n" + "L* : %.1f \n" + "a* : %.1f \n" + "b* : %.1f \n", CcValue[0], CcValue[1], CcValue[2]);
			System.out.printf("비교색(RGB) \n" + "R : %d \n" + "G : %d \n" + "B : %d \n", avgRed2 ,
					avgGreen2 , avgBlue2 );
			
			System.out.printf("두색의 차 \n L* : %.1f \n a* : %.1f \n b* : %.1f \n",gab[0],gab[1],gab[2]);
			if(gab[0] < 0) { // L 값
				System.out.printf("검은색을 %.1f 만큼 추가한다. \n",Math.abs(gab[0]));
			}else {
				System.out.printf("흰색을 %.1f 만큼 추가한다. \n",gab[0]);
			}
			
			if(gab[1] < 0) { //a 값
				System.out.printf("초록색을 %.1f 만큼 추가한다. \n",Math.abs(gab[1]));
			}else {
				System.out.printf("빨간색을 %.1f 만큼 추가한다. \n",gab[1]);
			}
			
			if(gab[2] < 0) { //b 값
				System.out.printf("파랑색을 %.1f 만큼 추가한다. \n",Math.abs(gab[2]));
			}else {
				System.out.printf("노랑색을 %.1f 만큼 추가한다. \n",gab[2]);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일이 없습니다.");
		}

	}

}
