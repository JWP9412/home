package arrange;
/*
 * ������� �� ���
 * �ʱ� 2���� ���� ������ L(xL, yL) �������� R(xR,yR)�� ����Ѵ�
 * F J I E
 * 
 */
public class TriFunEdit {

	public static void main(String[] args) {
		int gabBox = 3;

		double xL = -14; // �غ� -14
		double yL = 62; // ���� 62
	
		double xR = 25; // 25
		double yR = -30; // -30


		double radianL = Math.atan2(yL, xL);
		double radianR = Math.atan2(yR, xR);
//		double degreeA = radianL * 180 / Math.PI;
		double angleLOX = Math.toDegrees(radianL);
		double angleXOR = Math.toDegrees(radianR);
		double angleLOYdouble = angleLOX - 90;
		double angleLORdouble = Math.abs(angleLOX) + Math.abs(angleXOR);
		double angleLORDiv = angleLORdouble / 3;
		
		
		
		
		//�ٲ�ߵ�
		double angleXOF = angleLOX + angleLORDiv;
		double angleXOJ = angleLOX - angleLORDiv;
		double angleXOI = angleLOX - angleLORDiv*2;
		double angleXOM = angleLOX - angleLORDiv*4;
		double angleYOM = angleXOM + 90;
		
		System.out.println("------------------------------����------------------------------");
		System.out.println("���� LOX : " + angleLOX);
		System.out.println("���� XOR : " + angleXOR);
		System.out.println();
		System.out.println("���� LOYdouble : " + angleLOYdouble);
		System.out.println("���� angleXOJ : "+angleXOJ);
		System.out.println("���� angleXOI : "+angleXOI);
		
		System.out.println("���� angleXOM : "+angleXOM);
		System.out.println("���� angleYOM : "+angleYOM);
		System.out.println("���� LORdouble : " + angleLORdouble + "  ||  angleLOR / ĭ�� : " + angleLORDiv);
		System.out.println("���� XOF : " + angleXOF);
		System.out.println("---------------------------------------------------------------");
		
		double heightLR = Math.abs(xL) + Math.abs(xR);
		double widthLR = Math.abs(yL) + Math.abs(yR);
		double lineLR = Math.sqrt(Math.pow(heightLR, 2) + Math.pow(widthLR, 2));
		
		System.out.println(
				"xL+xR = " + heightLR + " || yL+yR = " + widthLR + " || lineLR = " + lineLR);

//		int angle = 0;
//
//		if (xL * xR * yL * yR > 0) {
//			if (xL * xR > 0) {
//				System.out.println("�� ���� ���� ��и鿡 ��ġ�Ѵ�");
//			} else {
//				angle += 90;
//				System.out.println("�� ���� �ݴ� ��и鿡 ��ġ�Ѵ� | �λ��� ��и��� ���� angle += " + angle);
//			}
//		} else {
//			System.out.println("�� ���� ������ ��и鿡 ��ġ�Ѵ�");
//		}
		
		System.out.println();
		double lineOL = Math.sqrt(Math.pow(xL, 2) + Math.pow(yL, 2)); // pow ���� z==�밢��
		double lineOR = Math.sqrt(Math.pow(xR, 2) + Math.pow(yR, 2));
		
		// System.out.println("L���� " + psL + "��и鿡 ��ġ��");
		System.out.println("lineOL = " + lineOL + " || lineOR = " + lineOR + " || lineLR = " + lineLR);
		System.out.println();

		double gab = Math.abs(lineOL - lineOR);
		double gabDiv = gab / gabBox;
		
		System.out.println("�� ���� ���� �� = " + gab + " || ���� �� / ���� �Ÿ� ĭ�� = " + gabDiv);
		System.out.println();

		double tan = Math.toDegrees(Math.atan((double) yL / Math.abs(xL)));
		double tanZ = Math.toDegrees(Math.atan((double) lineOL / Math.abs(lineOR)));

		System.out.println("tanZ : " + Math.round(tanZ));
		System.out.println("angleAO-x = " + Math.round(tan));
		System.out.println("angleAO+Y = " + Math.round(90 - tan));
		
		double cosLOR = ((Math.pow(lineLR, 2) - Math.pow(lineOL, 2) - Math.pow(lineOR, 2)) / (-2 * lineOL * lineOR));
		double angleLOR = Math.toDegrees(Math.acos(cosLOR));
		double angleGabdiv = angleLOR / gabBox;
		
		System.out.println("���� LOR :" + angleLOR + "|| ����LOR / ���� �Ÿ� ĭ�� = " + angleLOR / gabBox);
		System.out.println();
		
		//�� ������ ���̸� ����
		double lineOF = lineOL + gab / gabBox;
		double lineOJ = lineOL - gab / gabBox;
		double lineOI = lineOR + gab / gabBox;
		double lineOE = lineOR - gab / gabBox;
		
		System.out.println("�߰�ù°���� : " + lineOJ);
		System.out.println("�߰���°���� : " + lineOI);
		System.out.println();

		double angleLOY = Math.round(Math.toDegrees(Math.acos((double) yL / Math.abs(lineOL)))); // ���� LOY
		double angleYOJ = angleLOR / gabBox - angleLOY;
		double angleNewLOX = 90 - angleYOJ;

		System.out.println("angleLOY : " + angleLOY);
		System.out.println("������(Y+)���� ���� J ������ ����(angleYOJ) : " + angleYOJ);
		System.out.println("J���� ���� ����(X+) ������ ����(angleNewLOX) : " + angleNewLOX);
		System.out.println();
		
		double WcosX = Math.cos(Math.toRadians(angleNewLOX)); // cos38
		double WcosY = Math.cos(Math.toRadians(angleYOJ)); // cos52
		
		System.out.println("xJ : " + WcosX * lineOJ + " || yJ : " + WcosY * lineOJ);
		System.out.println(34.1 * Math.cos(Math.toRadians(51)) - 43.65 * Math.sin(Math.toRadians(51)));
		System.out.println(34.1 * Math.sin(Math.toRadians(51)) + 43.65 * Math.cos(Math.toRadians(51)));
		
		double EcosX = Math.cos(Math.toRadians(angleNewLOX - angleGabdiv));
		double EcosY = Math.sin(Math.toRadians(angleNewLOX - angleGabdiv));
		
		System.out.println("xI : " + EcosX * lineOI + " || yI : " + EcosY * lineOI);

		
		double McosX = Math.cos(Math.toRadians(90-angleYOM)); //11
		double McosY = Math.sin(Math.toRadians(90-angleYOM)); //11
		
		System.out.println("xM : " + McosX * lineOE + " || yM : " + McosY * lineOE);

		double PcosX = Math.cos(Math.toRadians(180 - angleXOF)); //26
		double PcosY = Math.sin(Math.toRadians(180 - angleXOF)); //26
		
		System.out.println("xP : " + PcosX * lineOF + " || yP : " + PcosY * lineOF);

		
		System.out.println("��");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("xP      : " + -(PcosX * lineOF) + "  || yP      : " + PcosY * lineOF);
		System.out.println("xL : " + xL + "                 || yL : " + yL);
		System.out.println("xJ	: " + WcosX * lineOJ + "   || yJ   : " + WcosY * lineOJ);
		System.out.println("xI 	: " + EcosX * lineOI + "   || yI   : " + EcosY * lineOI);
		System.out.println("xR : " + xR + "                  || yR : " + yR);
		System.out.println("xM      : " +  (McosX * lineOE) + " || yM      : " + -(McosY * lineOE));
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(angleNewLOX - angleGabdiv);
	}

}