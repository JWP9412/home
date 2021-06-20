package pf;

import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;

public class Port2 {

	public static void main(String[] args) throws IOException {
		BufferedImage image1 = null;
		BufferedImage image2 = null;

		BufferedImage ma0 = null;
		BufferedImage ma1 = null;
		BufferedImage ma2 = null;
		BufferedImage ma3 = null;

		String url1 = "C:/te/컬러리스트/rr.jpg";
		String url2 = "C:/te/컬러리스트/gg.jpg";
		File targetFileName = new File("C:/te/newcolor.jpg");
		FileOutputStream fos = new FileOutputStream(targetFileName);
		FileInputStream fis = new FileInputStream(targetFileName);
		FileImageInputStream fiis = new FileImageInputStream(targetFileName);

		try {
			image1 = ImageIO.read(new File(url1));
			image2 = ImageIO.read(new File(url2));
			ma0 = ImageIO.read(new File("C:/te/컬러리스트/출력/ma0.jpg"));
			ma1 = ImageIO.read(new File("C:/te/컬러리스트/출력/ma1.jpg"));
			ma2 = ImageIO.read(new File("C:/te/컬러리스트/출력/ma2.jpg"));
			ma3 = ImageIO.read(new File("C:/te/컬러리스트/출력/ma3.jpg"));

			int x1 = image1.getWidth(null);
			int y1 = image1.getHeight(null);
			Color color1 = new Color(image1.getRGB(x1 / 2 + x1 / 3, y1 / 2 + y1 / 3));

			int x2 = image2.getWidth(null);
			int y2 = image2.getHeight(null);
			Color color2 = new Color(image2.getRGB(x2 / 2 + x2 / 3, y2 / 2 + y2 / 3));

			int red1 = color1.getRed();
			int blue1 = color1.getBlue();
			int green1 = color1.getGreen();
			int alpha1 = color1.getAlpha();

			System.out.println("image1 의 색상");
			System.out.println("R : " + red1);
			System.out.println("G : " + green1);
			System.out.println("B : " + blue1);
			System.out.println("A : " + alpha1);
			System.out.println();

			int red2 = color2.getRed();
			int blue2 = color2.getBlue();
			int green2 = color2.getGreen();
			int alpha2 = color2.getAlpha();

			System.out.println("image2 의 색상");
			System.out.println("R : " + red2);
			System.out.println("G : " + green2);
			System.out.println("B : " + blue2);
			System.out.println("A : " + alpha2);
			System.out.println();

			int newred0 = red1 - (red2 - red1) / 3;
			int newgreen0 = green1 - (green2 - green1) / 3;
			int newblue0 = blue1 - (blue2 - blue1) / 3;
			int newalpha0 = alpha1 - (alpha2 - alpha1) / 3;

			int newred1 = red1 + (red2 - red1) / 3;
			int newgreen1 = green1 + (green2 - green1) / 3;
			int newblue1 = blue1 + (blue2 - blue1) / 3;
			int newalpha1 = alpha1 + (alpha2 - alpha1) / 3;

			int newred2 = red1 + ((red2 - red1) / 3) * 2;
			int newgreen2 = green1 + ((green2 - green1) / 3) * 2;
			int newblue2 = blue1 + ((blue2 - blue1) / 3) * 2;
			int newalpha2 = alpha1 + ((alpha2 - alpha1) / 3) * 2;

			int newred3 = red1 + ((red2 - red1) / 3) * 4;
			int newgreen3 = green1 + ((green2 - green1) / 3) * 4;
			int newblue3 = blue1 + ((blue2 - blue1) / 3) * 4;
			int newalpha3 = alpha1 + ((alpha2 - alpha1) / 3) * 4;

			if (newred0 < 0) {
				newred0 = 0;
			}
			if (newgreen0 < 0) {
				newgreen0 = 0;
			}
			if (newblue0 < 0) {
				newblue0 = 0;
			}
			if (newalpha0 < 0) {
				newalpha0 = 0;
			}

			if (newred0 >= 255) {
				newred0 = 255;
			}
			if (newgreen0 >= 255) {
				newgreen0 = 255;
			}
			if (newblue0 >= 255) {
				newblue0 = 255;
			}
			if (newalpha0 >= 255) {
				newalpha0 = 255;
			}

			if (newred3 < 0) {
				newred3 = 0;
			}
			if (newgreen3 < 0) {
				newgreen3 = 0;
			}
			if (newblue3 < 0) {
				newblue3 = 0;
			}
			if (newalpha3 < 0) {
				newalpha3 = 0;
			}

			if (newred3 >= 255) {
				newred3 = 255;
			}
			if (newgreen3 >= 255) {
				newgreen3 = 255;
			}
			if (newblue3 >= 255) {
				newblue3 = 255;
			}
			if (newalpha3 >= 255) {
				newalpha3 = 255;
			}

			/*
			 * int newArr0[] = {newred0,newgreen0,newblue0,newalpha0} ; int newArr3[] =
			 * {newred3,newgreen3,newblue3,newalpha3} ; for(int x=0; x>newArr3.length;x++) {
			 * if(newArr3[x] >= 255) { newArr0[x] = 255; newArr3[x] = 255; newred3 =0;
			 * 
			 * }else if(newArr0[x] <=0) { newArr0[x] = 0; } }
			 */

//			System.out.println("|nr0 : "+newred0 +" |ng0 : " + newArr0[1] + " |nb0 : "+ newblue0 + " |na0 : " + newalpha0);
			System.out.println(
					"|nr0 : " + newred0 + " |ng0 : " + newgreen0 + " |nb0 : " + newblue0 + " |na0 : " + newalpha0);
			System.out.println(
					"|nr1 : " + newred1 + " |ng1 : " + newgreen1 + " |nb1 : " + newblue1 + " |na1 : " + newalpha1);
			System.out.println(
					"|nr2 : " + newred2 + " |ng2 : " + newgreen2 + " |nb2 : " + newblue2 + " |na2 : " + newalpha2);
			System.out.println(
					"|nr3 : " + newred3 + " |ng3 : " + newgreen3 + " |nb3 : " + newblue3 + " |na3 : " + newalpha3);
//			System.out.println("|nr3 : "+newred3 +" |ng3 : " + newArr3[1] + " |nb3 : "+ newblue3 + " |na3 : " + newalpha3);

			ColorSpace lab = new ColorSpace(newalpha3, newalpha3) {
				
				@Override
				public float[] toRGB(float[] colorvalue) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public float[] toCIEXYZ(float[] colorvalue) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public float[] fromRGB(float[] rgbvalue) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public float[] fromCIEXYZ(float[] colorvalue) {
					// TODO Auto-generated method stub
					return null;
				}
			};
			System.out.println();
			Color newcolor1 = new Color(newred1, newgreen1, newblue1, newalpha1);
			int nc0 = new Color(newred0, newgreen0, newblue0, newalpha0).getRGB();
//			int nc0 = new Color(newArr0[0], newArr0[1], newArr0[2], newArr0[3]).getRGB();
			int nc1 = new Color(newred1, newgreen1, newblue1, newalpha1).getRGB();
			int nc2 = new Color(newred2, newgreen2, newblue2, newalpha2).getRGB();
			int nc3 = new Color(newred3, newgreen3, newblue3, newalpha3).getRGB();
//			int nc3 = new Color(newArr3[0], newArr3[1], newArr3[2], newArr3[3]).getRGB();
			System.out.println("new Color");
			System.out.println("new R : " + newcolor1.getRed());
			System.out.println("new G : " + newcolor1.getGreen());
			System.out.println("new B : " + newcolor1.getBlue());
			System.out.println("new A : " + newcolor1.getAlpha());
			System.out.println(newcolor1.getRGB());
			int width = image1.getWidth();
			int height = image1.getHeight();

			for (int w = 0; w < width; w++) {
				for (int h = 0; h < height; h++) {
					ma0.setRGB(w, h, nc0);
					ma1.setRGB(w, h, nc1);
					ma2.setRGB(w, h, nc2);
					ma3.setRGB(w, h, nc3);
				}
			}
			try {
				ImageIO.write(ma0, "jpg", new File("C:/te/컬러리스트/출력/00.jpg"));
				ImageIO.write(ma1, "jpg", new File("C:/te/컬러리스트/출력/01.jpg"));
				ImageIO.write(ma2, "jpg", new File("C:/te/컬러리스트/출력/02.jpg"));
				ImageIO.write(ma3, "jpg", new File("C:/te/컬러리스트/출력/03.jpg"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			// image1.setRGB(10, 10, newalpha);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// GetImgPixel gip = null;
		// gip.GetImgPixel("C:/te/red.jpg","C:/te/green.jpg");

	}

}
