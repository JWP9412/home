package matchColor;

import java.awt.Color;

import convertRef.RgbToLab;

public class ToMakeAvgColor {
	InputColor inputColor = new InputColor();
	
	private int width = inputColor.getTargetColor().getWidth();
	private int height = inputColor.getTargetColor().getHeight();
	
	RgbToLab rtl = new RgbToLab();
	
	public ToMakeAvgColor() {
		Color avgTarget = new Color(0,0,0);
		Color avgCompare = new Color(0,0,0);
		
		int avgRedT = 0;
		int avgGreenT = 0;
		int avgBlueT = 0;

		int avgRedC = 0;
		int avgGreenC = 0;
		int avgBlueC = 0;
		
		for(int w=0; w < width; w++) {
			for(int h=0; h< height; h++) {
				avgTarget = new Color(inputColor.getTargetColor().getRGB(w, h));
				avgRedT += avgTarget.getRed();
				avgGreenT += avgTarget.getGreen();
				avgBlueT += avgTarget.getBlue();
				
				avgCompare = new Color(inputColor.getCompareColor().getRGB(w, h));
				avgRedC += avgCompare.getRed();
				avgGreenC += avgCompare.getGreen();
				avgBlueC += avgCompare.getBlue();
			}
		}
		
		avgRedT = avgRedT / (width * height);
		avgGreenT = avgGreenT / (width * height);
		avgBlueT = avgBlueT / (width * height);

		
		avgRedC = avgRedC / (width * height);
		avgGreenC = avgGreenC / (width * height);
		avgBlueC = avgBlueC / (width * height);

		double TargetValue[] = rtl.rgbToLab(avgRedT, avgGreenT, avgBlueT);
		double CompareValue[] = rtl.rgbToLab(avgGreenT, avgGreenC, avgBlueC);
		double gab[] = {TargetValue[0]-CompareValue[0],TargetValue[1]-CompareValue[1],TargetValue[2]-CompareValue[2]};
		
		
		System.out.printf("목표색(Lab) \n" + "L* : %.1f \n" + "a* : %.1f \n" + "b* : %.1f \n", TargetValue[0], TargetValue[1], TargetValue[2]);
		System.out.printf("목표색(RGB) \n" + "R : %d \n" + "G : %d \n" + "B : %d \n", avgRedT ,
				avgGreenT , avgBlueT );

		System.out.printf("비교색(Lab) \n" + "L* : %.1f \n" + "a* : %.1f \n" + "b* : %.1f \n", CompareValue[0], CompareValue[1], CompareValue[2]);
		System.out.printf("비교색(RGB) \n" + "R : %d \n" + "G : %d \n" + "B : %d \n", avgRedC ,
				avgGreenC , avgBlueC );
		
		System.out.printf("두색의 차 \n L* : %.1f \n a* : %.1f \n b* : %.1f \n",gab[0],gab[1],gab[2]);
	}
		
}
