package pf;

public class TriFun {

	public static void main(String[] args) {
		int gabBox = 3;
		
		int xColorA = -14; // �غ�
		int yColorA = 62; // ����

		int xColorB = 25;
		int yColorB = -30;

		int heightAB = Math.abs(xColorA) + Math.abs(xColorB);
		int widthAB = Math.abs(yColorA) + Math.abs(yColorB);
		double lineAB = Math.sqrt(Math.pow(heightAB, 2) + Math.pow(widthAB, 2));
		System.out.println("xColorA+xColorB = " + heightAB + " || yColorA+yColorB = " + widthAB + " || lineAB = " + lineAB);

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

		double lineOA = Math.sqrt(Math.pow(xColorA, 2) + Math.pow(yColorA, 2)); // pow ���� z==�밢��
		double lineOB = Math.sqrt(Math.pow(xColorB, 2) + Math.pow(yColorB, 2));
		// System.out.println("L���� " + psL + "��и鿡 ��ġ��");
		System.out.println("lineOA = " + lineOA + " || lineOB = " + lineOB + " || lineAB = " + lineAB);
		double gab = Math.abs(lineOA-lineOB);
		double gabDiv = gab / gabBox;
		System.out.println("�� ���� ���� �� = "+ gab + " || ���� �� / ���� �Ÿ� ĭ�� = " + gabDiv);

		double tan = Math.toDegrees(Math.atan((double) yColorA / Math.abs(xColorA)));
		double tanZ = Math.toDegrees(Math.atan((double) lineOA / Math.abs(lineOB)));
		double cosZ = Math.toDegrees(Math.atan((double) lineOA / Math.abs(lineOB)));
		System.out.println("tanZ : " + Math.round(tanZ));
		System.out.println("angleAO-x = " +Math.round(tan));
		System.out.println("angleAO+Y = "+Math.round(90 - tan));
		double cosAOB = (Math.pow(lineAB, 2) - Math.pow(lineOA, 2) - Math.pow(lineOB, 2)) / (-2 * lineOA * lineOB);
		double angleAOB = Math.round(Math.toDegrees(Math.acos(cosAOB)));
		System.out.println("���� AOB :" + angleAOB + "|| ����AOB / ���� �Ÿ� ĭ�� = " + angleAOB/3);
		
		double sTa1 = lineOA;
		double lineOnewP = lineOA + gab/3;
		double lineOnewA = lineOA - gab/3;
		double lineOnewB = lineOB + gab/3;
		double lineOnewM = lineOB - gab/3;
		System.out.println("�߰�ù° : "+lineOnewA);
		System.out.println("�߰���° : "+lineOnewB);
		System.out.println(Math.acos(52));
		double a1 = 55.3;
		double a1pow =  Math.pow(a1, 2);
		
		
		
		double angleAOY = Math.round(Math.toDegrees(Math.acos((double) 62 / Math.abs(63.56)))) ; //���� AOB
		double angleYONewA = angleAOB/3 - angleAOY;
		double angleNewAOX = 90-angleYONewA;
		
		System.out.println("angleAOY : " + angleAOY);
		System.out.println("������(Y+)���� ���� newA ������ ���� : "+angleYONewA);
		System.out.println("newA���� ���� ����(X+) ������ ���� : "+angleNewAOX);
		
		double WcosX = Math.cos(Math.toRadians(angleNewAOX)); //cos38
		double WcosY = Math.cos(Math.toRadians(angleYONewA)); //cos52
		System.out.println("xNewA : " +WcosX*lineOnewA + " || yNewA : " + WcosY*lineOnewA);
		System.out.println(34.1*Math.cos(Math.toRadians(51))-43.65*Math.sin(Math.toRadians(51))) ;
		System.out.println(34.1*Math.sin(Math.toRadians(51))+43.65*Math.cos(Math.toRadians(51))) ;
		double EcosX = Math.cos(Math.toRadians(1));
		double EcosY = Math.sin(Math.toRadians(1));
		System.out.println("xNewB : " +EcosX*lineOnewB + " || yNewB : " + EcosY*lineOnewB);
		
		double McosX = Math.cos(Math.toRadians(-11));
		double McosY = Math.sin(Math.toRadians(-11));
		System.out.println("xM : " +McosX*lineOnewM + " || yM : " + McosY*lineOnewM);
		
		double PcosX = Math.cos(Math.toRadians(13));
		double PcosY = Math.sin(Math.toRadians(13));
		System.out.println("xP : " +PcosX*lineOnewP + " || yP : " + PcosY*lineOnewP);
		
		System.out.println("��");
		System.out.println(Math.atan2(-14, 25));
	}

}