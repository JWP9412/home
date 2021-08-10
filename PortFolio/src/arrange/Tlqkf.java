package arrange;

/*
 * ������� �� ���
 * �ʱ� 2���� ���� ������ L(xL, yL) �������� R(xR,yR)�� ����Ѵ�
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
