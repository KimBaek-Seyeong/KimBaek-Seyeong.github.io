class Count{
	static int a;//����ƽ
	int b; //�ν��Ͻ�
	void increment() {
		int c=0; //��������
		a++; b++; c++;
		System.out.println("Static ���� a : "+a);
		System.out.println("Instance ���� b : "+b);
		System.out.println("���� ���� c : "+c);
		System.out.println();
	}
}

public class Ex05_06_���� {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.increment();
		c1.increment();

		Count c2 = new Count();
		c2.increment();
		c2.increment();
		
		Count c3 = new Count();
		c3.increment();
		c3.increment();
	}
}

//�Ű����� : �޼ҵ� ȣ�� �� ����, �޼ҵ� ���� �� �Ҹ�
//�������� : �޼ҵ� �ȿ����� ��ȿ
//�ν��Ͻ� ���� : ��ü ������ ���� ��ü ���� ��ü ���� �� �Ҹ�
//static(Ŭ����) ���� : Ŭ���� ȣ�� �� �����Ͽ� ���α׷� ���� �� �Ҹ�
//�������� : ��ü, �ּҰ� ����
