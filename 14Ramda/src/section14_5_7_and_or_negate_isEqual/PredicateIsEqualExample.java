package section14_5_7_and_or_negate_isEqual;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
	public static void main(String[] args) {
		Predicate<String> pdc;
		
		pdc =Predicate.isEqual(null);
		System.out.println("null , null : " + pdc.test(null));
		
		pdc =Predicate.isEqual("A");
		System.out.println("null , A : " + pdc.test(null));
		
		pdc =Predicate.isEqual(null);
		System.out.println("A , null : " + pdc.test("A"));
		
		pdc =Predicate.isEqual("A");
		System.out.println("A , A : " + pdc.test("A"));
		
		pdc =Predicate.isEqual("A");
		System.out.println("A , B : " + pdc.test("B"));
	}
}
