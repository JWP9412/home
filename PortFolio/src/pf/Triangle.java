package pf;

public class Triangle {

	public static void main(String[] args) {
		int xL = -14; // 밑변
		int yL = 62; // 높이

		int xR = 25;
		int yR = -30;

		int X = xL-xR;
		int Y = yL-yR;
		double Z = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
		System.out.println("xL-xR = "+ X + " || yL-yR = " + Y + " || 대각선 = "+ Z);
		
		int angle = 0;

		if (xL * xR * yL * yR > 0) {
			if (xL * xR > 0) {
				System.out.println("두 점은 같은 사분면에 위치한다");
			} else {
				angle += 90;
				System.out.println("두 점은 반대 사분면에 위치한다 | 두사이 사분면의 각도 angle += " +angle);	
			}
		} else {
			System.out.println("두 점은 인접한 사분면에 위치한다");
		}


		double zL = Math.sqrt(Math.pow(xL, 2) + Math.pow(yL, 2)); // pow 제곱 z==대각선
		double zR = Math.sqrt(Math.pow(xR, 2) + Math.pow(yR, 2));
		//System.out.println("L점은 " + psL + "사분면에 위치함");
		System.out.println("왼쪽 대각선 = " + zL +"|| 오른쪽 대각선 = " +zR);
		
		double tan = Math.toDegrees(Math.atan((double) yL / Math.abs(xL)));
		double tanZ = Math.toDegrees(Math.atan((double) zL / Math.abs(zR)));
		double cosZ = Math.toDegrees(Math.atan((double) zL / Math.abs(zR)));
		System.out.println("tanZ : " + tanZ);
		System.out.println(tan);
		System.out.println(90 - tan);
	}

}
