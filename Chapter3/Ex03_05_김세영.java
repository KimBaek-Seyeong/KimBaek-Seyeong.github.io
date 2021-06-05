import java.util.Scanner;

public class Ex03_05_김세영 {

	public static void main(String[] args) {
		
		//char ch='z';
		//ch값이 m 또는 M이면 : morning이라고 출력
		//a : afternoon
		//e : evening
		//그외 : 잘못 입력하셨습니다.
		
		char ch = 'a';
		System.out.println("연습용 알파벳은 "+ch+"입니다.");
		
		//switch~case
		switch (ch) {
		case 'm':
			System.out.println("연습 결과 : Good morning");
			break;
		case 'a':
			System.out.println("연습 결과 : Good afternoon");
			break;
		case 'e':
			System.out.println("연습 결과 : Good evening");
			break;
		default:
			System.out.println("연습 결과 : 잘못 입력하셨습니다.");
			break;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력하세요(한글자) : ");
		char ch2 = sc.next().charAt(0);
				
		//if~else
		if(ch2=='m') {
			System.out.println("Good morning");
		}else if(ch2=='a') {
			System.out.println("Good afternoon");
		}else if(ch2=='e') {
			System.out.println("Good evening");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
