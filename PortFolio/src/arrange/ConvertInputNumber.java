package arrange;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ConvertInputNumber {

	public static void main(String[] args) throws IOException {
		BufferedImage inputColor1 = null;
		BufferedImage inputColor2 = null;

		BufferedImage outputColor0 = null;
		BufferedImage outputColor1 = null;
		BufferedImage outputColor2 = null;
		BufferedImage outputColor3 = null;
		BufferedImage outputAvgColor1 = null;
		BufferedImage outputAvgColor2 = null;
		
		RgbToLab rtl = new RgbToLab();

		try {
			inputColor1 = ImageIO.read(new File("C:/te/컬러리스트/in11.png"));
			inputColor2 = ImageIO.read(new File("C:/te/컬러리스트/in22.png"));
			outputColor0 = ImageIO.read(new File("C:/te/컬러리스트/base/base.png"));
			outputColor1 = ImageIO.read(new File("C:/te/컬러리스트/base/base.png"));
			outputColor2 = ImageIO.read(new File("C:/te/컬러리스트/base/base.png"));
			outputColor3 = ImageIO.read(new File("C:/te/컬러리스트/base/base.png"));
			outputAvgColor1 = ImageIO.read(new File("C:/te/컬러리스트/base/base.png"));
			outputAvgColor2 = ImageIO.read(new File("C:/te/컬러리스트/base/base.png"));

			int x1 = inputColor1.getWidth(null);
			int y1 = inputColor1.getHeight(null);

			int x2 = inputColor2.getWidth(null);
			int y2 = inputColor2.getHeight(null);

			// AVG
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
					color1 = new Color(inputColor1.getRGB(width, height));
					avgRed1 += color1.getRed();
					avgGreen1 += color1.getGreen();
					avgBlue1 += color1.getBlue();

					color2 = new Color(inputColor2.getRGB(width, height));
					avgRed2 += color2.getRed();
					avgGreen2 += color2.getGreen();
					avgBlue2 += color2.getBlue();
				}

			}
			System.out.println("InputColor1 | avgRed1 : " + avgRed1 / (x1 * y1) + "| avgGreen1 :"
					+ avgGreen1 / (x1 * y1) + "| avgBlue1 :" + avgBlue1 / (x1 * y1));
			System.out.println("InputColor2 | avgRed2 : " + avgRed2 / (x1 * y1) + "| avgGreen2 :"
					+ avgGreen2 / (x1 * y1) + "| avgBlue2 :" + avgBlue2 / (x1 * y1));
			System.out.println();
			color1 = new Color(avgRed1 / (x1 * y1), avgGreen1 / (x1 * y1), avgBlue1 / (x1 * y1));
			color2 = new Color(avgRed2 / (x1 * y1), avgGreen2 / (x1 * y1), avgBlue2 / (x1 * y1));

			// RGB to LAB
			int red1 = color1.getRed();
			int blue1 = color1.getBlue();
			int green1 = color1.getGreen();
			int alpha1 = color1.getAlpha();

			int red2 = color2.getRed();
			int blue2 = color2.getBlue();
			int green2 = color2.getGreen();
			int alpha2 = color2.getAlpha();

			double c1Value[] = rtl.rgbToLab(red1, green1, blue1);
			double c2Value[] = rtl.rgbToLab(red2, green2, blue2);

			System.out.println("RGB InputColor1 | R : " + red1 + "| G : " + green1 + "| B : " + blue1);
			System.out.println("RGB InputColor2 | R : " + red2 + "| G : " + green2 + "| B : " + blue2);
			System.out.println();

			System.out.println("InputColor1 | L* : " + c1Value[0] + "| a* : " + c1Value[1] + "| b* : " + c1Value[2]);
			System.out.println("InputColor2 | L* : " + c2Value[0] + "| a* : " + c2Value[1] + "| b* : " + c2Value[2]);
			System.out.println();

			double gab[] = new double[3];
			double minColor[] = new double[3];
			double maxColor[] = new double[3];
			double newColor1[] = new double[3];
			double newColor2[] = new double[3];
			double newColorL[] = new double[3];
			double newColorR[] = new double[3];
			for (int i = 0; i < gab.length; i++) {
				gab[i] = c1Value[i] - c2Value[i];

				if (c1Value[i] > c2Value[i]) {
					minColor[i] = c2Value[i];
					maxColor[i] = c1Value[i];
				} else {
					minColor[i] = c1Value[i];
					maxColor[i] = c2Value[i];
				}
//				newColorL[i] = c1Value[i] + (gab[i] / 3);
//				newColor1[i] = c1Value[i] - (gab[i] / 3);
//				newColor2[i] = c2Value[i] + (gab[i] / 3);
//				newColorR[i] = c2Value[i] - (gab[i] / 3);

				if (newColorR[0] > 100) {
					newColorR[0] = 100;
				}
				if (newColorL[0] < -100) {
					newColorL[0] = -100;
				}

				System.out.println("gab [" + i + "] : " + gab[i] + "| gab [" + i + "] / 3 : " + gab[i] / 3);
//				System.out.println("[" + i + "] min : " + minColor[i] + " || max : " + maxColor[i]);
				System.out.println("[" + i + "] || L : " + newColorL[i] + "|| c1Value : " + c1Value[i] + "|| n1 : "
						+ newColor1[i] + " || n2 : " + newColor2[i] + "|| c2Value : " + c2Value[i] + " || R : "
						+ newColorR[i]);
				System.out.println();
			}
			// LAB to RGB
			double g1[] = {90.6,34.08,43.66};
			double g2[] = {85.07,47.21,0.86};
			double gL[] = {101.67,-64.3,31.78};
			double gR[] = {74.0,-5.98,-30.29};
			int newRGB1[] = rtl.LABtoRGB(g1);
			int newRGB2[] = rtl.LABtoRGB(g2);
			int newRGBL[] = rtl.LABtoRGB(gL);
			int newRGBR[] = rtl.LABtoRGB(gR);

			System.out.println("L : R : " + newRGBL[0] + " G : " + newRGBL[1] + " B : " + newRGBL[2]);
			System.out.println("I1: R : " + red1 + " G : " + green1 + " B : " + blue1);
			System.out.println("1 : R : " + newRGB1[0] + " G : " + newRGB1[1] + " B : " + newRGB1[2]);
			System.out.println("2 : R : " + newRGB2[0] + " G : " + newRGB2[1] + " B : " + newRGB2[2]);
			System.out.println("I2: R : " + red2 + " G : " + green2 + " B : " + blue2);
			System.out.println("R : R : " + newRGBR[0] + " G : " + newRGBR[1] + " B : " + newRGBR[2]);
			int newRGBValueL = new Color(newRGBL[0], newRGBL[1], newRGBL[2], 1).getRGB();
			int newRGBValue1 = new Color(newRGB1[0], newRGB1[1], newRGB1[2], 1).getRGB();
			int newRGBValue2 = new Color(newRGB2[0], newRGB2[1], newRGB2[2], 1).getRGB();
			int newRGBValueR = new Color(newRGBR[0], newRGBR[1], newRGBR[2], 1).getRGB();
			
			int newAvg1 = new Color(red1, green1, blue1, 1).getRGB();
			int newAvg2 = new Color(red2, green2, blue2, 1).getRGB();
			
			int width = inputColor1.getWidth();
			int height = inputColor1.getHeight();

			for (int w = 0; w < width; w++) {
				for (int h = 0; h < height; h++) {
					outputColor0.setRGB(w, h, newRGBValue1);
					outputColor1.setRGB(w, h, newRGBValue2);
					outputColor2.setRGB(w, h, newRGBValueL);
					outputColor3.setRGB(w, h, newRGBValueR);
					outputAvgColor1.setRGB(w, h, newAvg1 );
					outputAvgColor2.setRGB(w, h, newAvg2 );
				}
			}
			for (int w = 0; w < width; w++) {
				for (int h = 0; h < height; h++) {

				}
			}
			ImageIO.write(outputColor0, "png", new File("C:/te/컬러리스트/TeNum/GB1.png"));
			ImageIO.write(outputColor1, "png", new File("C:/te/컬러리스트/TeNum/GB2.png"));
			ImageIO.write(outputColor2, "png", new File("C:/te/컬러리스트/TeNum/GL.png"));
			ImageIO.write(outputColor3, "png", new File("C:/te/컬러리스트/TeNum/GR.png"));
			ImageIO.write(outputAvgColor1, "png", new File("C:/te/컬러리스트/TeNum/GAvg1.png"));
			ImageIO.write(outputAvgColor2, "png", new File("C:/te/컬러리스트/TeNum/GAvg2.png"));
			System.out.println("TeNum 으로 출력 완료");
			
			ImageMergeInputNumber.RunOriginMerge(); // 이미지 붙이기
			ImageMergeInputNumber.RunAvgMerge(); // 이미지 붙이기
//			try {
//				ImageIO.write(outputColor0, "png", new File("C:/te/컬러리스트/TeNum/B1.png"));
//				ImageIO.write(outputColor1, "png", new File("C:/te/컬러리스트/TeNum/B2.png"));
//				ImageIO.write(outputColor2, "png", new File("C:/te/컬러리스트/TeNum/L.png"));
//				ImageIO.write(outputColor3, "png", new File("C:/te/컬러리스트/TeNum/R.png"));
//				System.out.println("TeNum 완료");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
