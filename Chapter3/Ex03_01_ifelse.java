import java.util.Scanner;

public class Ex03_01_ifelse {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� ���� �Է��ϼ���.");
		System.out.print("num1 : ");
		num1 = sc.nextInt();
		System.out.print("num2 : ");
		num2 = sc.nextInt();
		
		System.out.println();
		
		System.out.println("num1�� num2���� Ŭ ���� ���� ���� ���� ���� �ִ�.");
		System.out.println("��__��");
				
		if(num1>num2) {
			System.out.println("num1�� �� ũ��.");
			System.out.println("^__^");
		}else {
			System.out.println("num2�� �� ũ��.");
			System.out.println("Ȥ�� num1�� num2�� ����.");
			System.out.println("��__��");
		}
		
		System.out.println();
		
		if(num1>num2) {
			System.out.println("num1�� num2���� Ů�ϴ�.");
			System.out.println("^__^");
		}else if(num1 == num2) {
			System.out.println("num1�� num2�� ���� ���Դϴ�.");
			System.out.println("^__^");
		}else {
			System.out.println("num1�� num2���� �۽��ϴ�.");
			System.out.println("^__^");
		}
		
		System.out.println();
		System.out.println("if~else �����ϴ� ��...");
		System.out.println("0__<");
	}
}
