package exam05;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	private static int[] scores = {10, 50,3 ,99 ,-1};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin(
				(a,b) ->{
					if(a>=b)return a;
					else return b;
				});
		System.out.println("MAX : "+max);
		
		//최소값 얻기
				int min = maxOrMin(
						//(a,b) -> {return ((a<=b)?a:b);}
						(a,b) ->(a<=b)?a:b
						/*(a,b) ->{
							if(a<=b)return a;
							else return b;
						}*/
						);
				System.out.println("MIN : "+min);
	}
}
