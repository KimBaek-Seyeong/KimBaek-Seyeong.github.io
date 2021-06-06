import java.util.Scanner;

class Calculator{
	static int sum(int x, int y) { //static method
		return x+y;
	}
	int sub(int x, int y) {//instance method
		return x-y;
	}
}

public class Ex05_04_메서드 { //실행클래스 안의 메서드는 static 필수

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 두 개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
//		Calculator.sum(10, 20);
		Calculator cal = new Calculator();
		int sumRes = cal.sum(num1, num2);
		int subRes = cal.sub(num1, num2);
		System.out.println("더하기 : "+sumRes);
		System.out.println("빼기 : "+subRes);
	}
}
