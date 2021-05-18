package section14_5_4_Operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };

	public static int maxOrMin(IntBinaryOperator op) {
		int result = scores[0];
		for (int score : scores) {
			result = op.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin((a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("MAX : " + max);
		
		// 최소값 얻기
				int min = maxOrMin((a, b) -> {
					if (a <= b)
						return a;
					else
						return b;
				});
				System.out.println("MIN : " + min);
	}

}
