package pf;

public class TriFun {

	public static void main(String[] args) {
		int xColorA = -14; // �غ�
		int yColorA = 62; // ����

		int xColorB = 25;
		int yColorB = -30;

		int lineA = Math.abs(xColorA) + Math.abs(xColorB);
		int lineB = Math.abs(yColorA) + Math.abs(yColorB);
		double lineC = Math.sqrt(Math.pow(lineA, 2) + Math.pow(lineB, 2));
		System.out.println("xColorA+xColorB = " + lineA + " || yColorA+yColorB = " + lineB + " || �밢�� = " + lineC);

		int angle = 0;

		if (xColorA * xColorB * yColorA * yColorB > 0) {
			if (xColorA * xColorB > 0) {
				System.out.println("�� ���� ���� ��и鿡 ��ġ�Ѵ�");
			} else {
				angle += 90;
				System.out.println("�� ���� �ݴ� ��и鿡 ��ġ�Ѵ� | �λ��� ��и��� ���� angle += " + angle);
			}
		} else {
			System.out.println("�� ���� ������ ��и鿡 ��ġ�Ѵ�");
		}

		double zL = Math.sqrt(Math.pow(xColorA, 2) + Math.pow(yColorA, 2)); // pow ���� z==�밢��
		double zR = Math.sqrt(Math.pow(xColorB, 2) + Math.pow(yColorB, 2));
		// System.out.println("L���� " + psL + "��и鿡 ��ġ��");
		System.out.println("���� �밢�� = " + zL + "|| ������ �밢�� = " + zR + " || ���� ������ �Ÿ� = " + lineC);
		double gab = Math.abs(zL-zR);
		System.out.println("�� ���� ���� �� = "+ gab + " || ���� �� / ���� �Ÿ� ĭ�� = " + gab/3);

		double tan = Math.toDegrees(Math.atan((double) yColorA / Math.abs(xColorA)));
		double tanZ = Math.toDegrees(Math.atan((double) zL / Math.abs(zR)));
		double cosZ = Math.toDegrees(Math.atan((double) zL / Math.abs(zR)));
		System.out.println("tanZ : " + Math.round(tanZ));
		System.out.println(Math.round(tan));
		System.out.println(Math.round(90 - tan));
		double cosA = (Math.pow(lineC, 2) - Math.pow(zL, 2) - Math.pow(zR, 2)) / (-2 * zL * zR);
		double angleA = Math.round(Math.toDegrees(Math.acos(cosA)));
		System.out.println("�� ���� ���� :" + angleA + "|| ���� / ���� �Ÿ� ĭ�� = " + angleA/3);
		
		double sTa1 = zL;
		double sTa2 = zL - gab/3;
		double sTa3 = zR + gab/3;
		System.out.println("�߰�ù° : "+sTa2);
		System.out.println("�߰���° : "+sTa3);
		System.out.println(Math.acos(52));
		double a1 = 55.3;
		double a1pow =  Math.pow(a1, 2);
		
		
		
		double cosQ = Math.round(Math.toDegrees(Math.acos((double) 62 / Math.abs(63.56)))) ;
		double angleXto1 = angleA/3 - cosQ;
		
		System.out.println("cosQ : " + cosQ);
		System.out.println("������(+)���� ����1������ ���� : "+angleXto1);
		
		double WcosX = Math.cos(Math.toRadians(52));
		double WcosY = Math.cos(Math.toRadians(90-52));
		System.out.println("Wx : " +WcosX*sTa2 + " || Wy : " + WcosY*sTa2);
		System.out.println(34.1*Math.cos(Math.toRadians(51))-43.65*Math.sin(Math.toRadians(51))) ;
		System.out.println(34.1*Math.sin(Math.toRadians(51))+43.65*Math.cos(Math.toRadians(51))) ;
		double EcosX = Math.cos(Math.toRadians(1));
		double EcosY = Math.sin(Math.toRadians(1));
		System.out.println("Ex : " +EcosX*sTa3 + " || Ey : " + EcosY*sTa3);
		
		System.out.println("��");
	}

}