package section14_4_2_Local;

public class UsingLocalVariable {
	void method(int arg) {//arg�� final Ư���� ����
		int localVar = 40; //localVar �� final Ư���� ����
		
		//arg=31;
		//localVar=41;
		
		//���ٽ�
		MyFunctionalInterface fi = () ->{
			//���� ���� �б�
			System.out.println("arg : "+arg);
			System.out.println("localVar : "+localVar + "\n");
		};
		fi.method();
	}
}
