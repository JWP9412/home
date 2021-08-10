package arrange;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageMergeInputNumber {

	public static void RunOriginMerge(){
		try {
			BufferedImage img1 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/GL.png"));
			BufferedImage img2 = ImageIO.read(new File("C:/te/컬러리스트/in11.png"));
			BufferedImage img3 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/GB1.png"));
			BufferedImage img4 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/GB2.png"));
			BufferedImage img5 = ImageIO.read(new File("C:/te/컬러리스트/in22.png"));
			BufferedImage img6 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/GR.png"));
			
			
			int width = 
					img1.getWidth()+
					img2.getWidth()+
					img3.getWidth()+
					img4.getWidth()+
					img5.getWidth()+
					img6.getWidth();
			int height = img1.getHeight();
			BufferedImage mergedImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Graphics2D gp = (Graphics2D) mergedImg.getGraphics();
			
			gp.setBackground(Color.WHITE);
			gp.drawImage(img1, 0, 0,null);
			gp.drawImage(img2, 100, 0,null);
			gp.drawImage(img3, 200, 0,null);
			gp.drawImage(img4, 300, 0,null);
			gp.drawImage(img5, 400, 0,null);
			gp.drawImage(img6, 500, 0,null);
			
			ImageIO.write(mergedImg,"png",new File("C:/te/컬러리스트/TeNum/OriginMergedOrigin"+".png"));
			System.out.println("원본 사진과 이어 붙이기 완료");
		}catch (Exception e) {
			e.printStackTrace();
		}

	
		
		
	}
	
	public static void RunAvgMerge(){
		try {
			BufferedImage img1 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/GL.png"));
			BufferedImage img2 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/GAvg1.png"));
			BufferedImage img3 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/GB1.png"));
			BufferedImage img4 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/GB2.png"));
			BufferedImage img5 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/GAvg2.png"));
			BufferedImage img6 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/GR.png"));
			
			
			int width = 
					img1.getWidth()+
					img2.getWidth()+
					img3.getWidth()+
					img4.getWidth()+
					img5.getWidth()+
					img6.getWidth();
			int height = img1.getHeight();
			BufferedImage mergedImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Graphics2D gp = (Graphics2D) mergedImg.getGraphics();
			
			gp.setBackground(Color.WHITE);
			gp.drawImage(img1, 0, 0,null);
			gp.drawImage(img2, 100, 0,null);
			gp.drawImage(img3, 200, 0,null);
			gp.drawImage(img4, 300, 0,null);
			gp.drawImage(img5, 400, 0,null);
			gp.drawImage(img6, 500, 0,null);
			
			ImageIO.write(mergedImg,"png",new File("C:/te/컬러리스트/TeNum/AvgMergedAvg"+".png"));
			System.out.println("원본사진의 평균값 이미지로 이어 붙이기 완료");
		}catch (Exception e) {
			e.printStackTrace();
		}

	
		
		
	}
	public static void main(String[] args) {
		try {
			BufferedImage img1 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/L.png"));
//			BufferedImage img2 = ImageIO.read(new File("C:/te/컬러리스트/in1.png"));
			BufferedImage img2 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/Avg1.png"));
			BufferedImage img3 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/B1.png"));
			BufferedImage img4 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/B2.png"));
//			BufferedImage img5 = ImageIO.read(new File("C:/te/컬러리스트/in2.png"));
			BufferedImage img5 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/Avg2.png"));
			BufferedImage img6 = ImageIO.read(new File("C:/te/컬러리스트/TeNum/R.png"));
			
			
			int width = 
					img1.getWidth()+
					img2.getWidth()+
					img3.getWidth()+
					img4.getWidth()+
					img5.getWidth()+
					img6.getWidth();
			int height = img1.getHeight();
			BufferedImage mergedImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Graphics2D gp = (Graphics2D) mergedImg.getGraphics();
			
			gp.setBackground(Color.WHITE);
			gp.drawImage(img1, 0, 0,null);
			gp.drawImage(img2, 100, 0,null);
			gp.drawImage(img3, 200, 0,null);
			gp.drawImage(img4, 300, 0,null);
			gp.drawImage(img5, 400, 0,null);
			gp.drawImage(img6, 500, 0,null);
			
			ImageIO.write(mergedImg,"png",new File("C:/te/컬러리스트/TeNum/Merged1.png"));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
System.out.println("TeNum 폴더로 출력 완료");
	}

}
