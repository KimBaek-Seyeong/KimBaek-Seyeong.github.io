
public class Ex05_03_�޼��� {

	public static void main(String[] args) {
		
		System.out.println("main");
		prn(); //ȣ�� : ���ǵ� ������ �Ѿ��
		int result = add(10,20); //argument
		double result2 = sub(30.2, 1.3, 7);
		System.out.println("add : "+result);
		System.out.println("sub : "+result2);
		System.out.println("main ��");
		
		Ex05_03_�޼��� ex = new Ex05_03_�޼���();
		ex.mul();
		
	}
	
	static void prn() { //prn �޼��� ����
		System.out.println("prn �޼��� ����");
		System.out.println("HAHAHA");
	} //ȣ���� ������ ���ư���
	
	static int add(int a, int b) { //�Ű����� : ȣ��� �޼��忡�� �̾���� �� �ִ� ����
		int result;
		result = a+b;
		System.out.println("result : "+result);
		return result;
	}
	
	static double sub(double a, double b, double c) {
		double result;
		result = a-b-c;
		System.out.println("result : "+result);
		return result;
	}
	
	void mul() {
		System.out.println("mul");
	}
} //class

//�޼��� : Ư�� �۾��� �����ϵ��� ���������� �ۼ��� ���α׷�, ó�� �� ���, �ڵ� ���Ұ� ����
//����Ÿ�� �޼����̸�([Ÿ�� ������1, Ÿ�� ������2]){ }