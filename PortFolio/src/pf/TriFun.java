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
		System.out.println();
		double lineOA = Math.sqrt(Math.pow(xColorA, 2) + Math.pow(yColorA, 2)); // pow ���� z==�밢��
		double lineOB = Math.sqrt(Math.pow(xColorB, 2) + Math.pow(yColorB, 2));
		// System.out.println("L���� " + psL + "��и鿡 ��ġ��");
		System.out.println("lineOA = " + lineOA + " || lineOB = " + lineOB + " || lineAB = " + lineAB);
		System.out.println();
		
		double gab = Math.abs(lineOA-lineOB);
		double gabDiv = gab / gabBox;
		System.out.println("�� ���� ���� �� = "+ gab + " || ���� �� / ���� �Ÿ� ĭ�� = " + gabDiv);
		System.out.println();
		
		double tan = Math.toDegrees(Math.atan((double) yColorA / Math.abs(xColorA)));
		double tanZ = Math.toDegrees(Math.atan((double) lineOA / Math.abs(lineOB)));
		
		System.out.println("tanZ : " + Math.round(tanZ));
		System.out.println("angleAO-x = " +Math.round(tan));
		System.out.println("angleAO+Y = "+Math.round(90 - tan));
		double cosAOB = ((Math.pow(lineAB, 2) - Math.pow(lineOA, 2) - Math.pow(lineOB, 2)) / (-2 * lineOA * lineOB));
		double angleAOB = Math.toDegrees(Math.acos(cosAOB));
		double angleGabdiv = angleAOB/ gabBox;
		System.out.println("���� AOB :" + angleAOB + "|| ����AOB / ���� �Ÿ� ĭ�� = " + angleAOB/ gabBox);
		System.out.println();
		
		double lineOnewP = lineOA + gab/gabBox;
		double lineOnewA = lineOA - gab/gabBox;
		double lineOnewB = lineOB + gab/gabBox;
		double lineOnewM = lineOB - gab/gabBox;
		System.out.println("�߰�ù°���� : "+lineOnewA);
		System.out.println("�߰���°���� : "+lineOnewB);
		System.out.println();
		
		
		
		
		
		double angleAOY = Math.round(Math.toDegrees(Math.acos((double) yColorA / Math.abs(lineOA)))) ; //���� AOY
		double angleYONewA = angleAOB/gabBox - angleAOY;
		double angleNewAOX = 90-angleYONewA;
		
		System.out.println("angleAOY : " + angleAOY);
		System.out.println("������(Y+)���� ���� newA ������ ����(angleYONewA) : "+angleYONewA);
		System.out.println("newA���� ���� ����(X+) ������ ����(angleNewAOX) : "+angleNewAOX);
		System.out.println();
		double WcosX = Math.cos(Math.toRadians(angleNewAOX)); //cos38
		double WcosY = Math.cos(Math.toRadians(angleYONewA)); //cos52
		System.out.println("xNewA : " +WcosX*lineOnewA + " || yNewA : " + WcosY*lineOnewA);
		System.out.println(34.1*Math.cos(Math.toRadians(51))-43.65*Math.sin(Math.toRadians(51))) ;
		System.out.println(34.1*Math.sin(Math.toRadians(51))+43.65*Math.cos(Math.toRadians(51))) ;
		double EcosX = Math.cos(Math.toRadians(angleNewAOX-angleGabdiv));
		double EcosY = Math.sin(Math.toRadians(angleNewAOX-angleGabdiv));
		System.out.println("xNewB : " +EcosX*lineOnewB + " || yNewB : " + EcosY*lineOnewB);
		
		double McosX = Math.cos(Math.toRadians(11));
		double McosY = Math.sin(Math.toRadians(-11));
		System.out.println("xM : " +McosX*lineOnewM + " || yM : " + McosY*lineOnewM);
		
		double PcosX = Math.cos(Math.toRadians(26));
		double PcosY = Math.sin(Math.toRadians(26));
		System.out.println("xP : " +PcosX*lineOnewP + " || yP : " + PcosY*lineOnewP);
		
		System.out.println("��");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("xP      : " +-(PcosX*lineOnewP) + "  || yP      : " + PcosY*lineOnewP);
		System.out.println("xColorA : "+xColorA+ "                 || yColorA : " + yColorA);
		System.out.println("xNewA	: " +WcosX*lineOnewA + "   || yNewA   : " + WcosY*lineOnewA);
		System.out.println("xNewB 	: " +EcosX*lineOnewB + "   || yNewB   : " + EcosY*lineOnewB);
		System.out.println("xColorB : "+xColorB+"                  || yColorB : " + yColorB);
		System.out.println("xM      : " +-(McosX*lineOnewM) + " || yM      : " + McosY*lineOnewM);
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(angleNewAOX-angleGabdiv);
	}

}