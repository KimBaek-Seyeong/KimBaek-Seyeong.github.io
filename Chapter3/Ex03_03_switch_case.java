import java.util.Scanner;

public class Ex03_03_switch_case {

	public static void main(String[] args) {
		
		int num=2;
		
		switch (num) {
			case 1: System.out.println("1�Դϴ�.");
			case 2: System.out.println("2�Դϴ�.");
			case 3: System.out.println("3�Դϴ�.");
		}
		
		System.out.println("\nswitch ~ case ������...\t(*^^*)\n");

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �����(����) : ");
		int num2 = sc.nextInt();
		
		switch (num2) {
			case 1: System.out.println("1�Դϴ�."); break;
			case 2: System.out.println("2�Դϴ�."); break;
			case 3: System.out.println("3�Դϴ�."); break;
			default : System.out.println("1~3 ������ ���ڰ� �ƴմϴ�.");
		}
		
		System.out.println("\nswitch ~ case ������...\t(*^^*)\n");
	}
}
