class Test{
	int x=2;
	void display() {
		System.out.println("Test x: "+x);
	}
}
class Test2 extends Test{
	void display() {
		System.out.println("Test x: "+x*x);
	}
}

public class Ex08_05_Anonymous {
	public static void main(String[] args) {
		Test t = new Test();
		t.display();
		
		Test t2 = new Test2();
		t2.display();
		
		new Test() {
			void display() {
				System.out.println("Test x: "+x*x*x);
			}
		}.display();
		//�͸�Ŭ����
		//Ư�� Ŭ���� ��ӹ޾� Ư���޼ҵ带 �������̵� �� ��
		//�ش� ��ü�� �� �Ѱ��� ����� ����Ѵٸ�
		//���� ��ӹ޴� Ŭ������ ������ �ʰ� ���� ��ü�� �����ϴ� ���
	}
}
