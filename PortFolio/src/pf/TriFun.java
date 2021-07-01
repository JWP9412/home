package pf;

public class TriFun {

	public static void main(String[] args) {
		int gabBox = 3;
		
		int xColorA = -14; // 밑변
		int yColorA = 62; // 높이

		int xColorB = 25;
		int yColorB = -30;

		int heightAB = Math.abs(xColorA) + Math.abs(xColorB);
		int widthAB = Math.abs(yColorA) + Math.abs(yColorB);
		double lineAB = Math.sqrt(Math.pow(heightAB, 2) + Math.pow(widthAB, 2));
		System.out.println("xColorA+xColorB = " + heightAB + " || yColorA+yColorB = " + widthAB + " || lineAB = " + lineAB);

		int angle = 0;

		if (xColorA * xColorB * yColorA * yColorB > 0) {
			if (xColorA * xColorB > 0) {
				System.out.println("두 점은 같은 사분면에 위치한다");
			} else {
				angle += 90;
				System.out.println("두 점은 반대 사분면에 위치한다 | 두사이 사분면의 각도 angle += " + angle);
			}
		} else {
			System.out.println("두 점은 인접한 사분면에 위치한다");
		}
		System.out.println();
		double lineOA = Math.sqrt(Math.pow(xColorA, 2) + Math.pow(yColorA, 2)); // pow 제곱 z==대각선
		double lineOB = Math.sqrt(Math.pow(xColorB, 2) + Math.pow(yColorB, 2));
		// System.out.println("L점은 " + psL + "사분면에 위치함");
		System.out.println("lineOA = " + lineOA + " || lineOB = " + lineOB + " || lineAB = " + lineAB);
		System.out.println();
		
		double gab = Math.abs(lineOA-lineOB);
		double gabDiv = gab / gabBox;
		System.out.println("두 변의 길이 차 = "+ gab + " || 길이 차 / 색상 거리 칸수 = " + gabDiv);
		System.out.println();
		
		double tan = Math.toDegrees(Math.atan((double) yColorA / Math.abs(xColorA)));
		double tanZ = Math.toDegrees(Math.atan((double) lineOA / Math.abs(lineOB)));
		
		System.out.println("tanZ : " + Math.round(tanZ));
		System.out.println("angleAO-x = " +Math.round(tan));
		System.out.println("angleAO+Y = "+Math.round(90 - tan));
		double cosAOB = ((Math.pow(lineAB, 2) - Math.pow(lineOA, 2) - Math.pow(lineOB, 2)) / (-2 * lineOA * lineOB));
		double angleAOB = Math.toDegrees(Math.acos(cosAOB));
		double angleGabdiv = angleAOB/ gabBox;
		System.out.println("각도 AOB :" + angleAOB + "|| 각도AOB / 색상 거리 칸수 = " + angleAOB/ gabBox);
		System.out.println();
		
		double lineOnewP = lineOA + gab/gabBox;
		double lineOnewA = lineOA - gab/gabBox;
		double lineOnewB = lineOB + gab/gabBox;
		double lineOnewM = lineOB - gab/gabBox;
		System.out.println("중간첫째길이 : "+lineOnewA);
		System.out.println("중간둘째길이 : "+lineOnewB);
		System.out.println();
		
		
		
		
		
		double angleAOY = Math.round(Math.toDegrees(Math.acos((double) yColorA / Math.abs(lineOA)))) ; //각도 AOY
		double angleYONewA = angleAOB/gabBox - angleAOY;
		double angleNewAOX = 90-angleYONewA;
		
		System.out.println("angleAOY : " + angleAOY);
		System.out.println("수직선(Y+)에서 선분 newA 까지의 각도(angleYONewA) : "+angleYONewA);
		System.out.println("newA에서 선분 수평선(X+) 까지의 각도(angleNewAOX) : "+angleNewAOX);
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
		
		System.out.println("끝");
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