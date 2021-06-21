package pf;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Convert {

	public static void main(String[] args) throws IOException {
		BufferedImage inputColor1 = null;
		BufferedImage inputColor2 = null;

		BufferedImage outputColor0 = null;
		BufferedImage outputColor1 = null;
		BufferedImage outputColor2 = null;
		BufferedImage outputColor3 = null;

		RgbToLab rtl = new RgbToLab();

		String url1 = "C:/te/컬러리스트/or1.png";
		String url2 = "C:/te/컬러리스트/or2.png";

		try {
			inputColor1 = ImageIO.read(new File(url1));
			inputColor2 = ImageIO.read(new File(url2));
			outputColor0 = ImageIO.read(new File("C:/te/컬러리스트/출력/oc0.png"));
			outputColor1 = ImageIO.read(new File("C:/te/컬러리스트/출력/oc1.png"));
			outputColor2 = ImageIO.read(new File("C:/te/컬러리스트/출력/oc2.png"));
			outputColor3 = ImageIO.read(new File("C:/te/컬러리스트/출력/oc3.png"));

			int x1 = inputColor1.getWidth(null);
			int y1 = inputColor1.getHeight(null);
			Color color1 = new Color(inputColor1.getRGB(x1 / 2 + x1 / 3, y1 / 2 + y1 / 3));

			int x2 = inputColor2.getWidth(null);
			int y2 = inputColor2.getHeight(null);
			Color color2 = new Color(inputColor2.getRGB(x2 / 2 + x2 / 3, y2 / 2 + y2 / 3));

			int red1 = color1.getRed();
			int blue1 = color1.getBlue();
			int green1 = color1.getGreen();
			int alpha1 = color1.getAlpha();

			int red2 = color2.getRed();
			int blue2 = color2.getBlue();
			int green2 = color2.getGreen();
			int alpha2 = color2.getAlpha();

			double c1Value[] = new double[3];
			double c2Value[] = new double[3];
			c1Value = rtl.rgbToLab(red1, green1, blue1);
			c2Value = rtl.rgbToLab(red2, green2, blue2);

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
				gab[i] = Math.abs(c1Value[i] - c2Value[i]);

				if (c1Value[i] > c2Value[i]) {
					minColor[i] = c2Value[i];
					maxColor[i] = c1Value[i];
				} else {
					minColor[i] = c1Value[i];
					maxColor[i] = c2Value[i];
				}
				newColor1[i] = c1Value[i] + gab[i] / 3;
//				newColor2[i] = c1Value[i] + (gab[i] / 3) * 2;
				newColor2[i] = c2Value[i] - (gab[i] / 3);
				
				newColorR[i] = c2Value[i] + gab[i]/3;
				newColorL[i] = c1Value[i] - gab[i]/3;
				
				if(newColorR[0] >100) {
					newColorR[0] = 100;
				}
				if(newColorL[0]< -100) {
					newColorL[0] = -100;
				}
				
				System.out.println("gab [" + i + "] : " + gab[i]);
				System.out.println("[" + i + "] min : " + minColor[i] + " || max : " + maxColor[i]);
				System.out.println("[" + i + "] n1 : " + newColor1[i] + " || n2 : " + newColor2[i] + " || L : " + newColorL[i] + " || R : " + newColorR[i]);
				System.out.println();
			}
			System.out.println();
			System.out.println(newColor1[1]);;
			int newRGB1[] = rtl.LABtoRGB(newColor1);
			int newRGB2[] = rtl.LABtoRGB(newColor2);
			int newRGBL[] = rtl.LABtoRGB(newColorL);
			int newRGBR[] = rtl.LABtoRGB(newColorR);
			
			System.out.println("1 : R : " + newRGB1[0] +" G : "+newRGB1[1]+" B : "+newRGB1[2]);
			System.out.println("2 : R : " + newRGB2[0] +" G : "+newRGB2[1]+" B : "+newRGB2[2]);
			System.out.println("L : R : " + newRGBL[0] +" G : "+newRGBL[1]+" B : "+newRGBL[2]);
			System.out.println("R : R : " + newRGBR[0] +" G : "+newRGBR[1]+" B : "+newRGBR[2]);
			int newRGBValue1 = new Color(newRGB1[0], newRGB1[1], newRGB1[2], 255).getRGB();
			int newRGBValue2 = new Color(newRGB2[0], newRGB2[1], newRGB2[2], 255).getRGB();
			int newRGBValueL = new Color(newRGBL[0], newRGBL[1], newRGBL[2], 255).getRGB();
			int newRGBValueR = new Color(newRGBR[0], newRGBR[1], newRGBR[2], 255).getRGB();
			int width = inputColor1.getWidth();
			int height = inputColor1.getHeight();
			
			for (int w = 0; w < width; w++) {
				for (int h = 0; h < height; h++) {
					outputColor0.setRGB(w, h, newRGBValue1);
					outputColor1.setRGB(w, h, newRGBValue2);
					outputColor2.setRGB(w, h, newRGBValueL);
					outputColor3.setRGB(w, h, newRGBValueR);
				}
			}
			try {
				ImageIO.write(outputColor0, "jpg", new File("C:/te/컬러리스트/출력/B1.jpg"));
				ImageIO.write(outputColor1, "jpg", new File("C:/te/컬러리스트/출력/B2.jpg"));
				ImageIO.write(outputColor2, "jpg", new File("C:/te/컬러리스트/출력/L.jpg"));
				ImageIO.write(outputColor3, "jpg", new File("C:/te/컬러리스트/출력/R.jpg"));
				System.out.println("출력 완료");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
