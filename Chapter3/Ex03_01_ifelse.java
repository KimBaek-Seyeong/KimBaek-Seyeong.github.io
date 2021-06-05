import java.util.Scanner;

public class Ex03_01_ifelse {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 입력하세요.");
		System.out.print("num1 : ");
		num1 = sc.nextInt();
		System.out.print("num2 : ");
		num2 = sc.nextInt();
		
		System.out.println();
		
		System.out.println("num1은 num2보다 클 수도 작을 수도 같을 수도 있다.");
		System.out.println("ㅠ__ㅠ");
				
		if(num1>num2) {
			System.out.println("num1이 더 크다.");
			System.out.println("^__^");
		}else {
			System.out.println("num2가 더 크다.");
			System.out.println("혹은 num1과 num2가 같다.");
			System.out.println("ㅠ__ㅠ");
		}
		
		System.out.println();
		
		if(num1>num2) {
			System.out.println("num1이 num2보다 큽니다.");
			System.out.println("^__^");
		}else if(num1 == num2) {
			System.out.println("num1과 num2는 같은 값입니다.");
			System.out.println("^__^");
		}else {
			System.out.println("num1이 num2보다 작습니다.");
			System.out.println("^__^");
		}
		
		System.out.println();
		System.out.println("if~else 공부하는 중...");
		System.out.println("0__<");
	}
}
