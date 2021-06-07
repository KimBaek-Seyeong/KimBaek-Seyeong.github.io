import java.util.Scanner;

public class Ex07_02_예외처리 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean result = divide(a, b);
		if(result==true) {
			System.out.println("연산 성공");
		}else System.out.println("연산 실패");
	}
	static boolean divide(int a, int b) {
		try{
			int res = a/b;
			System.out.println("나눗셈 결과:"+res);
			return true;
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println(ae.toString());;
			return false;
		}finally { //데이터베이스에서 연결 끊기 용으로 필수
			System.out.println("finally 영역");
		}
	}
}
