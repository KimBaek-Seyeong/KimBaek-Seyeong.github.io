class Parent{
	int x = 10; //�ν��Ͻ� ����
	void method() {
		System.out.println("P_x: "+x);
	}
}

class Child extends Parent{
	int x = 20; //�ν��Ͻ� ���� : 0���� �ڵ� �ʱ�ȭ
	void method() {
		int x = 30; //���� ���� : �ڵ� �ʱ�ȭ���� ����
		System.out.println("x: "+x);
		System.out.println("this.x: "+this.x);
		System.out.println("super.x: "+super.x);
	}
}


public class Ex06_02_super {

	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.method();
	}
}
