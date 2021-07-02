package pf;

public class Acos2 {

	public static void main(String[] args) {
		double ax = -14;
		double ay = 62;
		
		double bx = 25;
		double by = -30;
		
//		double ox = 0;
//		double oy = 0;

		double xA = ax - 0;
		double yA = ay - 0;
		
		double xB = bx - 0;
		double yB = by - 0;
		
		double radianA = Math.atan2(yA, xA);
		double radianB = Math.atan2(yB, xB);
//		double degreeA = radianA * 180 / Math.PI;
		double degreeA = Math.toDegrees(radianA);
		double degreeB = Math.toDegrees(radianB);

		System.out.println("각도 AOX : "+ degreeA);
		System.out.println("각도 XOB : "+degreeB);
		double angleAOB = Math.abs(degreeA) + Math.abs(degreeB);
		double angleAOBDiv = angleAOB/3;
		System.out.println("angleAOB : "+angleAOB + "  ||  angleAOB / 칸수 : "+angleAOBDiv);
		System.out.println(degreeA - angleAOBDiv);
		System.out.println(degreeB + angleAOBDiv);
		
	}

}
