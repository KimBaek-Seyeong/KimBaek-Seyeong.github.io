import java.util.Scanner;

public class Ex05_10_�輼�� {

	public static void main(String[] args) {
		
		//���� 2�� �Է� : ��ĳ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 2���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//���� a�� b��
		int result = exponent(a, b);
		
		//���
		System.out.println(a+"^"+b+"= "+result);
	}
	
	static int exponent(int x, int y) {
		if (y==0) return 1;
		else return x*exponent(x, --y);
	}
}
