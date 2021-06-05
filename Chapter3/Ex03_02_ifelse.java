import java.util.Scanner;

public class Ex03_02_ifelse {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		if (num > 0 && num <= 10) {
			System.out.printf("%d는 0 초과 10 이하입니다.", num);
		}else if (num >10 && num <=20) {
			System.out.printf("%d는 10 초과 20 이하입니다.", num);
		}else{
			System.out.printf("%d는 0 이하 20 초과입니다.", num);
		}
		
		System.out.println("\n\nif~else 공부하는 중\n\\(^__^)/\n");
		
		if(num%5==0) {
			System.out.printf("%d는 5의 배수입니다.\n", num);
		}
		if (num%10==0) {
			System.out.printf("%d는 10의 배수입니다.\n", num);
		}
		
		System.out.println("\nif~else 공부하는 중\n\\(^__^)/\n");
		
		int score;
		System.out.print("시험 점수 : ");
		score = sc.nextInt();
		
		if(num >= 95) {
			System.err.println("당신이 받을 돈은 13,000원 입니다.");
		}else if (num >= 90) {
			System.out.println("당신이 받을 돈은 10,000원 입니다.");
		}else System.out.println("조금 더 분발하세요.");
		
	}
}
