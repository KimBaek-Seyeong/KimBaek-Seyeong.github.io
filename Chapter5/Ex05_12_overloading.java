
public class Ex05_12_overloading {

	public static void main(String[] args) {
		
//		Ex05_12_overloading p = new Ex05_12_overloading();
//		p.plus();
		plus(3, 5);
		plus(11, 20);
	}
	
	//�����ε� : ���� �޼��� �̸����� ���� ���� �޼��带 ����� ���. ���� Ÿ���� ���д�� �ƴ�
	//�������̵��� �򰥸��� �� ��
	static void plus(int x, int y) {
		System.out.println("�� ���� �� : "+(x+y));
	}
	static void plus(double x, double y) {
		System.out.println("�� ���� �� : "+(x+y));
	}
	static void plus(int x, int y, int z) {
		System.out.println("�� ���� �� : "+(x+y+z));
	}
	
}
