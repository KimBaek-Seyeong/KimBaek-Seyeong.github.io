
public class Ex01_02_������ {
	public static void main(String[] args) {
		
		System.out.println(10);
		
		int a; //a���� int ����
		a = 10; //�ʱ�ȭ
//		int a = 10; ����� ���� �ʱ�ȭ		
		
		System.out.println("a");
		System.out.println(a);
		
		byte b1, b2;
		b1 = 127;
		b2 = -128;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int b3;
		b3 = b1 + b2;
/*
 		* byte b3 ���� �߻� ���� : int�� ���� ȿ�������� ó���� �� �ִ� Ÿ���̱� ���� a�� b�� int������ ���� byte���̱� ������
		* ������'+'�� �� �� ���� �ǿ����ڵ��� �ڷ����� int������ ��ȯ�� ���� ������ �����մϴ�. �׷��� 'a+b'�� �������� byte����
		* �ƴ� int���̱� ������ 7��° �ٿ� ����ȯ�� �� �ٿ��� �մϴ�.
*/
		System.out.println(b3);
		
		int c = 1000000;
		int d = 2000000;
		
		long e;
		e=c*d;
		
		System.out.println("result = " +e);
		
		long f;
		f = (long)c*d; //same f=(long)c*(long)d;
		
		System.out.println("result = " + f);
	}
}
