import java.util.Scanner;

public class Ex02_01_��� {

	public static void main(String[] args) {
		
//		���� 2�� �Է� �޾� num1, num2 ������ �ֱ�
		Scanner sc = new Scanner(System.in);
		int result, num1, num2;
		double result2;
		String temp;
		
		System.out.println("\"���ڸ� �� �� �Է����ּ���.\"");
		System.out.print("���� 1 : ");
		num1 = sc.nextInt();
		System.out.print("���� 2 : ");
		num2 = sc.nextInt();
		System.out.printf("\"�Է��� ���ڴ� %d, %d�Դϴ�.\"\n", num1, num2);
		
		while(true){
			System.out.print("\"�����ڸ� �Է����ּ���.\" : ");
			String op = sc.next();
			
			if(op.equals("+")) {
				result = num1 + num2;
				System.out.printf("\"���� ���, %s+%s=%d �Դϴ�.\"\n", "num1", "num2", result);
			} else if(op.equals("-")){
				result = num1 - num2;
				System.out.printf("\"���� ���, %s-%s=%d �Դϴ�.\"\n", "num1", "num2", result);
			} else if(op.equals("*")){
				result = num1 * num2;
				System.out.printf("\"���� ���, %s*%s=%d �Դϴ�.\"\n", "num1", "num2", result);
			} else if(op.equals("/")) {
				result = num1/num2;
				result2 = (double)num1/num2;
				System.out.printf("\"���� ���, %s/%s=%d �Դϴ�.\"\n", "num1", "num2", result);
				System.out.printf("\"���� ���, %s/%s=%.2f �Դϴ�.\"\n", "num1", "num2", result2);
			} else if(op.equals("%")) {
				result = num1%num2;
				System.out.printf("\"���� ���, %s%%%s=%d �Դϴ�.\"\n", "num1", "num2", result);
			}
			
			System.out.print("\"��� ����� Ȯ���Ͻðڽ��ϱ�? (y or n)\" : ");
			temp = sc.next();
			if (temp.equals("n")) {
				break;
			}
		}
	}
}
