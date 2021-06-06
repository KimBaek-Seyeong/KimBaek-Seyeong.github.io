import java.util.Scanner;

public class Ex05_10_김세영 {

	public static void main(String[] args) {
		
		//정수 2개 입력 : 스캐너
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//정수 a의 b승
		int result = exponent(a, b);
		
		//출력
		System.out.println(a+"^"+b+"= "+result);
	}
	
	static int exponent(int x, int y) {
		if (y==0) return 1;
		else return x*exponent(x, --y);
	}
}
