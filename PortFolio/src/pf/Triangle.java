package pf;

public class Triangle {

	public static void main(String[] args) {
		int xL = -14; // �غ�
		int yL = 62; // ����

		int xR = 25;
		int yR = -30;

		int X = xL-xR;
		int Y = yL-yR;
		double Z = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
		System.out.println("xL-xR = "+ X + " || yL-yR = " + Y + " || �밢�� = "+ Z);
		
		int angle = 0;

		if (xL * xR * yL * yR > 0) {
			if (xL * xR > 0) {
				System.out.println("�� ���� ���� ��и鿡 ��ġ�Ѵ�");
			} else {
				angle += 90;
				System.out.println("�� ���� �ݴ� ��и鿡 ��ġ�Ѵ� | �λ��� ��и��� ���� angle += " +angle);	
			}
		} else {
			System.out.println("�� ���� ������ ��и鿡 ��ġ�Ѵ�");
		}


		double zL = Math.sqrt(Math.pow(xL, 2) + Math.pow(yL, 2)); // pow ���� z==�밢��
		double zR = Math.sqrt(Math.pow(xR, 2) + Math.pow(yR, 2));
		//System.out.println("L���� " + psL + "��и鿡 ��ġ��");
		System.out.println("���� �밢�� = " + zL +"|| ������ �밢�� = " +zR);
		
		double tan = Math.toDegrees(Math.atan((double) yL / Math.abs(xL)));
		double tanZ = Math.toDegrees(Math.atan((double) zL / Math.abs(zR)));
		double cosZ = Math.toDegrees(Math.atan((double) zL / Math.abs(zR)));
		System.out.println("tanZ : " + tanZ);
		System.out.println(tan);
		System.out.println(90 - tan);
	}

}
