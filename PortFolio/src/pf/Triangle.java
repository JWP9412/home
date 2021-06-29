package pf;

public class Triangle {

	public static void main(String[] args) {
		int xL = -14; // 밑변
		int yL = 62; // 높이

		int xR = 25;
		int yR = -30;

		int X = Math.abs(xL) + Math.abs(xR);
		int Y = Math.abs(yL) + Math.abs(yR);
		double Z = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
		System.out.println("xL+xR = " + X + " || yL+yR = " + Y + " || 대각선 = " + Z);

		int angle = 0;

		if (xL * xR * yL * yR > 0) {
			if (xL * xR > 0) {
				System.out.println("두 점은 같은 사분면에 위치한다");
			} else {
				angle += 90;
				System.out.println("두 점은 반대 사분면에 위치한다 | 두사이 사분면의 각도 angle += " + angle);
			}
		} else {
			System.out.println("두 점은 인접한 사분면에 위치한다");
		}

		double zL = Math.sqrt(Math.pow(xL, 2) + Math.pow(yL, 2)); // pow 제곱 z==대각선
		double zR = Math.sqrt(Math.pow(xR, 2) + Math.pow(yR, 2));
		// System.out.println("L점은 " + psL + "사분면에 위치함");
		System.out.println("왼쪽 대각선 = " + zL + "|| 오른쪽 대각선 = " + zR + " || 두점 사이의 거리 = " + Z);
		double gab = Math.abs(zL-zR);
		System.out.println("두 변의 길이 차 = "+ gab + " || 길이 차 / 색상 거리 칸수 = " + gab/3);

		double tan = Math.toDegrees(Math.atan((double) yL / Math.abs(xL)));
		double tanZ = Math.toDegrees(Math.atan((double) zL / Math.abs(zR)));
		double cosZ = Math.toDegrees(Math.atan((double) zL / Math.abs(zR)));
		System.out.println("tanZ : " + Math.round(tanZ));
		System.out.println(Math.round(tan));
		System.out.println(Math.round(90 - tan));
		double cosA = (Math.pow(Z, 2) - Math.pow(zL, 2) - Math.pow(zR, 2)) / (-2 * zL * zR);
		double angleA = Math.round(Math.toDegrees(Math.acos(cosA)));
		System.out.println("두 변의 각도 :" + angleA + "|| 각도/색상 거리 칸수 = " + angleA/3);
		
		double sTa1 = zL;
		double sTa2 = zL - gab/3;
		System.out.println("중간첫째 : "+sTa2);
		System.out.println(Math.acos(52));
		double a1 = 55.3;
		double a1pow =  Math.pow(a1, 2);
		
		for(double x=0; x<128; x += 0.01) {
			//System.out.println(x);
			for(double y=0; y<128; y += 0.01) {
				
				if(a1pow == (x*x+y*y)) {
					System.out.println(x + "z "+y);
					break;
				}
			}
		}System.out.println("끝");
	}

}
