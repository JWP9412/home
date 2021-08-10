package arrange;
/*
 * □■□□■□ 일 경우
 * 초기 2색의 값은 왼쪽은 L(xL, yL) 오른쪽은 R(xR,yR)로 명명한다
 * F J I E
 * 
 */
public class TriFunEdit {

	public static void main(String[] args) {
		int gabBox = 3;

		double xL = -14; // 밑변 -14
		double yL = 62; // 높이 62
	
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
		
		
		
		
		//바꿔야됨
		double angleXOF = angleLOX + angleLORDiv;
		double angleXOJ = angleLOX - angleLORDiv;
		double angleXOI = angleLOX - angleLORDiv*2;
		double angleXOM = angleLOX - angleLORDiv*4;
		double angleYOM = angleXOM + 90;
		
		System.out.println("------------------------------각도------------------------------");
		System.out.println("각도 LOX : " + angleLOX);
		System.out.println("각도 XOR : " + angleXOR);
		System.out.println();
		System.out.println("각도 LOYdouble : " + angleLOYdouble);
		System.out.println("각도 angleXOJ : "+angleXOJ);
		System.out.println("각도 angleXOI : "+angleXOI);
		
		System.out.println("각도 angleXOM : "+angleXOM);
		System.out.println("각도 angleYOM : "+angleYOM);
		System.out.println("각도 LORdouble : " + angleLORdouble + "  ||  angleLOR / 칸수 : " + angleLORDiv);
		System.out.println("각도 XOF : " + angleXOF);
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
//				System.out.println("두 점은 같은 사분면에 위치한다");
//			} else {
//				angle += 90;
//				System.out.println("두 점은 반대 사분면에 위치한다 | 두사이 사분면의 각도 angle += " + angle);
//			}
//		} else {
//			System.out.println("두 점은 인접한 사분면에 위치한다");
//		}
		
		System.out.println();
		double lineOL = Math.sqrt(Math.pow(xL, 2) + Math.pow(yL, 2)); // pow 제곱 z==대각선
		double lineOR = Math.sqrt(Math.pow(xR, 2) + Math.pow(yR, 2));
		
		// System.out.println("L점은 " + psL + "사분면에 위치함");
		System.out.println("lineOL = " + lineOL + " || lineOR = " + lineOR + " || lineLR = " + lineLR);
		System.out.println();

		double gab = Math.abs(lineOL - lineOR);
		double gabDiv = gab / gabBox;
		
		System.out.println("두 변의 길이 차 = " + gab + " || 길이 차 / 색상 거리 칸수 = " + gabDiv);
		System.out.println();

		double tan = Math.toDegrees(Math.atan((double) yL / Math.abs(xL)));
		double tanZ = Math.toDegrees(Math.atan((double) lineOL / Math.abs(lineOR)));

		System.out.println("tanZ : " + Math.round(tanZ));
		System.out.println("angleAO-x = " + Math.round(tan));
		System.out.println("angleAO+Y = " + Math.round(90 - tan));
		
		double cosLOR = ((Math.pow(lineLR, 2) - Math.pow(lineOL, 2) - Math.pow(lineOR, 2)) / (-2 * lineOL * lineOR));
		double angleLOR = Math.toDegrees(Math.acos(cosLOR));
		double angleGabdiv = angleLOR / gabBox;
		
		System.out.println("각도 LOR :" + angleLOR + "|| 각도LOR / 색상 거리 칸수 = " + angleLOR / gabBox);
		System.out.println();
		
		//각 선분의 길이를 구함
		double lineOF = lineOL + gab / gabBox;
		double lineOJ = lineOL - gab / gabBox;
		double lineOI = lineOR + gab / gabBox;
		double lineOE = lineOR - gab / gabBox;
		
		System.out.println("중간첫째길이 : " + lineOJ);
		System.out.println("중간둘째길이 : " + lineOI);
		System.out.println();

		double angleLOY = Math.round(Math.toDegrees(Math.acos((double) yL / Math.abs(lineOL)))); // 각도 LOY
		double angleYOJ = angleLOR / gabBox - angleLOY;
		double angleNewLOX = 90 - angleYOJ;

		System.out.println("angleLOY : " + angleLOY);
		System.out.println("수직선(Y+)에서 선분 J 까지의 각도(angleYOJ) : " + angleYOJ);
		System.out.println("J에서 선분 수평선(X+) 까지의 각도(angleNewLOX) : " + angleNewLOX);
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

		
		System.out.println("끝");
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