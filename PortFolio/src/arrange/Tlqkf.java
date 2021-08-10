package arrange;

/*
 * □■□□■□ 일 경우
 * 초기 2색의 값은 왼쪽은 L(xL, yL) 오른쪽은 R(xR,yR)로 명명한다
 * F J I E
 * 
 */

public class Tlqkf {

	public static void main(String[] args) {
		int gabBox = 3;
		
		ValueXY L = new ValueXY(-14, 62);
		ValueXY R = new ValueXY(25, -30);
		
		double radianL = Math.atan2(L.y, L.x);
		double radianR = Math.atan2(R.y, R.x);
		
		double angleLOX = Math.toDegrees(radianL);
		double angleXOR = Math.toDegrees(radianR);
		
		System.out.printf("angleLOX %f | angleXOR %f",angleLOX,angleXOR);
		
	}

}
