[2]클래스의 구성 멤버가 아닌 것은?
답:4
해설:로컬변수(지역변수)는 생성자나 메소드 안에서 선언된 변수

1.필드(field)
2.생성자(constructor)
3.메소드(method)
4.로컬 변수(local variable)

class Abc{
	int z = 0; 		//필드
	Abc()	{ 		//생성자
		int x = 10; //로컬변수
	}
	
	void print(){	//메소드
		int y = 10; //로컬변수
	}
