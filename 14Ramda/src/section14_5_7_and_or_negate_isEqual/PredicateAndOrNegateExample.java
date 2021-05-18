package section14_5_7_and_or_negate_isEqual;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		// 2�� ��� �˻�
		IntPredicate pA = a -> a%2 ==0;
		
		// 3�� ��� �˻�
		IntPredicate pB = (a) -> a%3 ==0;
		
		IntPredicate pAB;
		boolean result;
		
		//and()
		pAB = pA.and(pB);
		result = pAB.test(9);
		System.out.println("9�� 2�� 3�� ���? : "+ result);
		
		//or()
		pAB = pA.or(pB);
		result = pAB.test(9);
		System.out.println("9�� 2�� �Ǵ� 3�� ���? : "+ result);
				
		//negate()
		pAB = pA.negate();
		result = pAB.test(9);
		System.out.println("9�� Ȧ��? : "+ result);
				
	}

}
