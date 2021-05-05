package exam11;
//11. obj1 == obj2 결과는 true  obj3 == obj4 결과는 false 인 이유? 
public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 =100;
		Integer obj2 =100;
		Integer obj3 =300;
		Integer obj4 =300;
		
		System.out.println(obj1==obj2);
		System.out.println(obj3==obj4);
		//Integer의 범위가 -128~127 이기 때문
	}

}
