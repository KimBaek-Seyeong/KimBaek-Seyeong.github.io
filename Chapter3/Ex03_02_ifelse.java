import java.util.Scanner;

public class Ex03_02_ifelse {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		
		if (num > 0 && num <= 10) {
			System.out.printf("%d�� 0 �ʰ� 10 �����Դϴ�.", num);
		}else if (num >10 && num <=20) {
			System.out.printf("%d�� 10 �ʰ� 20 �����Դϴ�.", num);
		}else{
			System.out.printf("%d�� 0 ���� 20 �ʰ��Դϴ�.", num);
		}
		
		System.out.println("\n\nif~else �����ϴ� ��\n\\(^__^)/\n");
		
		if(num%5==0) {
			System.out.printf("%d�� 5�� ����Դϴ�.\n", num);
		}
		if (num%10==0) {
			System.out.printf("%d�� 10�� ����Դϴ�.\n", num);
		}
		
		System.out.println("\nif~else �����ϴ� ��\n\\(^__^)/\n");
		
		int score;
		System.out.print("���� ���� : ");
		score = sc.nextInt();
		
		if(num >= 95) {
			System.err.println("����� ���� ���� 13,000�� �Դϴ�.");
		}else if (num >= 90) {
			System.out.println("����� ���� ���� 10,000�� �Դϴ�.");
		}else System.out.println("���� �� �й��ϼ���.");
		
	}
}
