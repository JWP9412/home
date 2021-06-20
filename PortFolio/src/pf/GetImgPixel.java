package pf;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.ImageInputStream;

public class GetImgPixel {

	public static void setNewColor(BufferedImage image) {
		Port pf;
		pf.
	}
	public static void GetImgPixel(String url1,String url2) throws IOException {
		BufferedImage image1 = null;
		BufferedImage image2 = null;
		File targetFileName = new File("C:/te/newcolor.jpg");
		FileOutputStream fos = new FileOutputStream(targetFileName);
		FileInputStream fis = new FileInputStream(targetFileName);
		FileImageInputStream fiis = new FileImageInputStream(targetFileName);
		
		try {
			image1 = ImageIO.read(new File(url1));
			image2 = ImageIO.read(new File(url2));
			int x1 = image1.getWidth(null);
			int y1 = image1.getHeight(null);
			Color color1 = new Color(image1.getRGB(x1/2 + x1/3, y1/2+y1/3));
			
			int x2 = image2.getWidth(null);
			int y2 = image2.getHeight(null);
			Color color2 = new Color(image2.getRGB(x2/2 + x2/3, y2/2+y2/3));

			int red1 = color1.getRed();
			int blue1 = color1.getBlue();
			int green1 = color1.getGreen();
			int alpha1 = color1.getAlpha();
			
			System.out.println("image1 의 색상");
			System.out.println("R : "+red1);
			System.out.println("G : "+green1);
			System.out.println("B : "+blue1);
			System.out.println("A : "+alpha1);
			System.out.println();
			
			int red2 = color2.getRed();
			int blue2 = color2.getBlue();
			int green2 = color2.getGreen();
			int alpha2 = color2.getAlpha();
			
			System.out.println("image2 의 색상");
			System.out.println("R : "+red2);
			System.out.println("G : "+green2);
			System.out.println("B : "+blue2);
			System.out.println("A : "+alpha2);
			System.out.println();
			
			int newred = (red1 + red2)/2;
			int newgreen = (green1 + green2)/2;
			int newblue = (blue1 + blue2)/2;
			int newalpha = (alpha1 + alpha2)/2;
			
			System.out.println("newgreen : "+newgreen);
			System.out.println();
			Color newcolor = new Color(newred, newgreen, newblue, newalpha);
			System.out.println("new Color");
			System.out.println("new R : " + newcolor.getRed());
			System.out.println("new G : " + newcolor.getGreen());
			System.out.println("new B : " + newcolor.getBlue());
			System.out.println("new A : " + newcolor.getAlpha());
			System.out.println(newcolor.getRGB());
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
