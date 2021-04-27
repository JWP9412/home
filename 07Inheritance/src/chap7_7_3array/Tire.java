package chap7_7_3array;

public class Tire {
	//�ʵ�
	public int maxRotation; // �ִ� ȸ����(����)
	public int accumulatedRotation; //���� ȸ����
	public String location; //Ÿ�̾��� ��ġ
	//������
	public Tire(String location, int maxRotation) {
		this.location = location;//�ʱ�ȭ
		this.maxRotation = maxRotation; //�ʱ�ȭ
	}
	
	public boolean roll() {
		++accumulatedRotation;//���� ȸ���� 1����
		if(accumulatedRotation<maxRotation) {//���� ȸ�� (����<�ִ�)�� ��� ����
			System.out.println(location + "Tire ���� : "+ (maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
		System.out.println("***"+location+"Tire��ũ***");//��ũ(����=�ִ�)�� ��� ����
		return false;
		}
	}
}
