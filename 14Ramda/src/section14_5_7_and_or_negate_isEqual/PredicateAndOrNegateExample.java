package section14_5_7_and_or_negate_isEqual;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		// 2의 배수 검사
		IntPredicate pA = a -> a%2 ==0;
		
		// 3의 배수 검사
		IntPredicate pB = (a) -> a%3 ==0;
		
		IntPredicate pAB;
		boolean result;
		
		//and()
		pAB = pA.and(pB);
		result = pAB.test(9);
		System.out.println("9는 2와 3의 배수? : "+ result);
		
		//or()
		pAB = pA.or(pB);
		result = pAB.test(9);
		System.out.println("9는 2와 또는 3의 배수? : "+ result);
				
		//negate()
		pAB = pA.negate();
		result = pAB.test(9);
		System.out.println("9는 홀수? : "+ result);
				
	}

}
