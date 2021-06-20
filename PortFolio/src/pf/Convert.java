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

		String url1 = "C:/te/컬러리스트/rr.jpg";
		String url2 = "C:/te/컬러리스트/gg.jpg";

		try {
			inputColor1 = ImageIO.read(new File(url1));
			inputColor2 = ImageIO.read(new File(url2));
			outputColor0 = ImageIO.read(new File("C:/te/컬러리스트/출력/oc0.jpg"));
			outputColor1 = ImageIO.read(new File("C:/te/컬러리스트/출력/oc1.jpg"));
			outputColor2 = ImageIO.read(new File("C:/te/컬러리스트/출력/oc2.jpg"));
			outputColor3 = ImageIO.read(new File("C:/te/컬러리스트/출력/oc3.jpg"));

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

			System.out.println("InputColor1 | L* : " + c1Value[0] + "| a* : " + c1Value[1] + "| b* : " + c1Value[2]);
			System.out.println("InputColor2 | L* : " + c2Value[0] + "| a* : " + c2Value[1] + "| b* : " + c2Value[2]);

			double gab[] = new double[3];
			double minColor[] = new double[3];
			double maxColor[] = new double[3];
			double newColor1[] = new double[3];
			double newColor2[] = new double[3];
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
				newColor2[i] = c1Value[i] + (gab[i] / 3) * 2;

				System.out.println("gab [" + i + "] : " + gab[i]);
				System.out.println("[" + i + "] min : " + minColor[i] + " || max : " + maxColor[i]);
				System.out.println("[" + i + "] n1 : " + newColor1[i] + " || n2 : " + newColor2[i]);
			}
			System.out.println(newColor1[1]);;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
