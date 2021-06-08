//�̿ϼ� �޼ҵ带 ���� Ŭ���� ���� ���
//1. abstract
//2. interface�� ����

interface RemoteControl{
	//�������̽� : �ڵ����� final ������ ������
	void turnOn();
	void turnOff();
}
//private-x-protected-public

class Test3 implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV�� �Ҵ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ����.");
	}
}
public class Ex08_06_Anonymous {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.turnOn();
		t3.turnOff();
		
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("R TV�� �Ҵ�.");
			}
			public void turnOff() {
				System.out.println("R TV�� ����.");
			}
		};
		
		rc.turnOn();
		rc.turnOn();
		rc.turnOn();
		rc.turnOff();
	}
}


