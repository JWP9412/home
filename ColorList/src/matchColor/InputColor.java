package matchColor;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class InputColor {
	private BufferedImage TargetColor = null;
	private BufferedImage CompareColor = null;
	
	public BufferedImage getTargetColor() {
		return TargetColor;
	}
	public void setTargetColor(String TargetColorPath) throws IOException {
		TargetColor = ImageIO.read(new File(TargetColorPath));
	}
	public BufferedImage getCompareColor() {
		return CompareColor;
	}
	public void setCompareColor(String CompareColorPath) throws IOException {
		CompareColor = ImageIO.read(new File(CompareColorPath));
	}
	
}
