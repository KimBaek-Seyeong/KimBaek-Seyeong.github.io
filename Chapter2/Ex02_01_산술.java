import java.util.Scanner;

public class Ex02_01_산술 {

	public static void main(String[] args) {
		
//		정수 2개 입력 받아 num1, num2 변수에 넣기
		Scanner sc = new Scanner(System.in);
		int result, num1, num2;
		double result2;
		String temp;
		
		System.out.println("\"숫자를 두 개 입력해주세요.\"");
		System.out.print("숫자 1 : ");
		num1 = sc.nextInt();
		System.out.print("숫자 2 : ");
		num2 = sc.nextInt();
		System.out.printf("\"입력한 숫자는 %d, %d입니다.\"\n", num1, num2);
		
		while(true){
			System.out.print("\"연산자를 입력해주세요.\" : ");
			String op = sc.next();
			
			if(op.equals("+")) {
				result = num1 + num2;
				System.out.printf("\"연산 결과, %s+%s=%d 입니다.\"\n", "num1", "num2", result);
			} else if(op.equals("-")){
				result = num1 - num2;
				System.out.printf("\"연산 결과, %s-%s=%d 입니다.\"\n", "num1", "num2", result);
			} else if(op.equals("*")){
				result = num1 * num2;
				System.out.printf("\"연산 결과, %s*%s=%d 입니다.\"\n", "num1", "num2", result);
			} else if(op.equals("/")) {
				result = num1/num2;
				result2 = (double)num1/num2;
				System.out.printf("\"연산 결과, %s/%s=%d 입니다.\"\n", "num1", "num2", result);
				System.out.printf("\"연산 결과, %s/%s=%.2f 입니다.\"\n", "num1", "num2", result2);
			} else if(op.equals("%")) {
				result = num1%num2;
				System.out.printf("\"연산 결과, %s%%%s=%d 입니다.\"\n", "num1", "num2", result);
			}
			
			System.out.print("\"계속 결과를 확인하시겠습니까? (y or n)\" : ");
			temp = sc.next();
			if (temp.equals("n")) {
				break;
			}
		}
	}
}
