import java.util.Scanner;

public class Ex07_02_����ó�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean result = divide(a, b);
		if(result==true) {
			System.out.println("���� ����");
		}else System.out.println("���� ����");
	}
	static boolean divide(int a, int b) {
		try{
			int res = a/b;
			System.out.println("������ ���:"+res);
			return true;
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println(ae.toString());;
			return false;
		}finally { //�����ͺ��̽����� ���� ���� ������ �ʼ�
			System.out.println("finally ����");
		}
	}
}
