package chap7_7_3array;

public class Car {
	// �ʵ�

	Tire[] tires = { new Tire("[1]�տ���", 6), new Tire("[2]�տ�����", 2), new Tire("[3]�ڿ���", 3), new Tire("[4]�ڿ�����", 4)

	};
	
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�]");
		for(int i=0; i<tires.length;i++) {
			if(tires[i].roll()==false) {
				stop();
				return (i+1);
				
			}
		}
		return 0;
	}

	private void stop() {
		System.out.println("[�ڵ����� ����ϴ�]");
		
	}
}
