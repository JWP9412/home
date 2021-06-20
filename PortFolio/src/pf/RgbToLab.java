package pf;

public class RgbToLab {
	public double[] D50 = { 96.4212, 100.0, 82.5188 };
	public double[] D55 = { 95.6797, 100.0, 92.1481 };
	public double[] D65 = { 95.0429, 100.0, 108.8900 };
	public double[] D75 = { 94.9722, 100.0, 122.6394 };
	public double[] whitePoint = D65;

	public double[][] Mi = { { 3.2406, -1.5372, -0.4986 }, { -0.9689, 1.8758, 0.0415 }, { 0.0557, -0.2040, 1.0570 } };

	public double[] rgbToLab(int R, int G, int B) {

		double r, g, b, X, Y, Z, xr, yr, zr;

		// D65/2¡Æ
		double Xr = 95.047;
		double Yr = 100.0;
		double Zr = 108.883;

		// --------- RGB to XYZ ---------//

		r = R / 255.0;
		g = G / 255.0;
		b = B / 255.0;

		if (r > 0.04045)
			r = Math.pow((r + 0.055) / 1.055, 2.4);
		else
			r = r / 12.92;

		if (g > 0.04045)
			g = Math.pow((g + 0.055) / 1.055, 2.4);
		else
			g = g / 12.92;

		if (b > 0.04045)
			b = Math.pow((b + 0.055) / 1.055, 2.4);
		else
			b = b / 12.92;

		r *= 100;
		g *= 100;
		b *= 100;

		X = 0.4124 * r + 0.3576 * g + 0.1805 * b;
		Y = 0.2126 * r + 0.7152 * g + 0.0722 * b;
		Z = 0.0193 * r + 0.1192 * g + 0.9505 * b;

		// --------- XYZ to Lab --------- //

		xr = X / Xr;
		yr = Y / Yr;
		zr = Z / Zr;

		if (xr > 0.008856)
			xr = (float) Math.pow(xr, 1 / 3.);
		else
			xr = (float) ((7.787 * xr) + 16 / 116.0);

		if (yr > 0.008856)
			yr = (float) Math.pow(yr, 1 / 3.);
		else
			yr = (float) ((7.787 * yr) + 16 / 116.0);

		if (zr > 0.008856)
			zr = (float) Math.pow(zr, 1 / 3.);
		else
			zr = (float) ((7.787 * zr) + 16 / 116.0);

		double[] lab = new double[3];

		lab[0] = (116 * yr) - 16;
		lab[1] = 500 * (xr - yr);
		lab[2] = 200 * (yr - zr);

		return lab;

	}

	public double[] LABtoXYZ(double L, double a, double b) {
		double[] result = new double[3];

		double y = (L + 16.0) / 116.0;
		double y3 = Math.pow(y, 3.0);
		double x = (a / 500.0) + y;
		double x3 = Math.pow(x, 3.0);
		double z = y - (b / 200.0);
		double z3 = Math.pow(z, 3.0);

		if (y3 > 0.008856) {
			y = y3;
		} else {
			y = (y - (16.0 / 116.0)) / 7.787;
		}
		if (x3 > 0.008856) {
			x = x3;
		} else {
			x = (x - (16.0 / 116.0)) / 7.787;
		}
		if (z3 > 0.008856) {
			z = z3;
		} else {
			z = (z - (16.0 / 116.0)) / 7.787;
		}

		result[0] = x * whitePoint[0];
		result[1] = y * whitePoint[1];
		result[2] = z * whitePoint[2];

		return result;
	}

	public int[] XYZtoRGB(double X, double Y, double Z) {
		int[] result = new int[3];

		double x = X / 100.0;
		double y = Y / 100.0;
		double z = Z / 100.0;

		// [r g b] = [X Y Z][Mi]
		double r = (x * Mi[0][0]) + (y * Mi[0][1]) + (z * Mi[0][2]);
		double g = (x * Mi[1][0]) + (y * Mi[1][1]) + (z * Mi[1][2]);
		double b = (x * Mi[2][0]) + (y * Mi[2][1]) + (z * Mi[2][2]);

		// assume sRGB
		if (r > 0.0031308) {
			r = ((1.055 * Math.pow(r, 1.0 / 2.4)) - 0.055);
		} else {
			r = (r * 12.92);
		}
		if (g > 0.0031308) {
			g = ((1.055 * Math.pow(g, 1.0 / 2.4)) - 0.055);
		} else {
			g = (g * 12.92);
		}
		if (b > 0.0031308) {
			b = ((1.055 * Math.pow(b, 1.0 / 2.4)) - 0.055);
		} else {
			b = (b * 12.92);
		}

		r = (r < 0) ? 0 : r;
		g = (g < 0) ? 0 : g;
		b = (b < 0) ? 0 : b;

		// convert 0..1 into 0..255
		result[0] = (int) Math.round(r * 255);
		result[1] = (int) Math.round(g * 255);
		result[2] = (int) Math.round(b * 255);

		return result;
	}

	public int[] XYZtoRGB(double[] XYZ) {
		return XYZtoRGB(XYZ[0], XYZ[1], XYZ[2]);
	}

	public int[] LABtoRGB(double[] Lab) {
		return XYZtoRGB(LABtoXYZ(Lab));
	}

	public double[] LABtoXYZ(double[] Lab) {
		return LABtoXYZ(Lab[0], Lab[1], Lab[2]);
	}

	public static void main(String[] args) {
		RgbToLab rtl = new RgbToLab();
		double[] result = new double[3];
		int[] rgbresult = new int[3];
		result = rtl.rgbToLab(123, 255, 255);
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);

		rgbresult = rtl.LABtoRGB(result);
		System.out.println("R" + rgbresult[0]);
		System.out.println("G" + rgbresult[1]);
		System.out.println("B" + rgbresult[2]);

		result = rtl.rgbToLab(127, 127, 127);
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);

		rgbresult = rtl.LABtoRGB(result);
		System.out.println("R" + rgbresult[0]);
		System.out.println("G" + rgbresult[1]);
		System.out.println("B" + rgbresult[2]);

		result = rtl.rgbToLab(0, 0, 0);
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);

		rgbresult = rtl.LABtoRGB(result);
		System.out.println("R" + rgbresult[0]);
		System.out.println("G" + rgbresult[1]);
		System.out.println("B" + rgbresult[2]);
		// System.out.println(RgbToLab.rgbToLab(100, 100, 100));

	}

}
