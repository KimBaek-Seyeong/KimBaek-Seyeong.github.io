import java.util.Scanner;

public class Ex03_03_switch_case {

	public static void main(String[] args) {
		
		int num=2;
		
		switch (num) {
			case 1: System.out.println("1입니다.");
			case 2: System.out.println("2입니다.");
			case 3: System.out.println("3입니다.");
		}
		
		System.out.println("\nswitch ~ case 공부중...\t(*^^*)\n");

		Scanner sc = new Scanner(System.in);
		System.out.print("직접 숫자 적어보기(정수) : ");
		int num2 = sc.nextInt();
		
		switch (num2) {
			case 1: System.out.println("1입니다."); break;
			case 2: System.out.println("2입니다."); break;
			case 3: System.out.println("3입니다."); break;
			default : System.out.println("1~3 사이의 숫자가 아닙니다.");
		}
		
		System.out.println("\nswitch ~ case 공부중...\t(*^^*)\n");
	}
}
