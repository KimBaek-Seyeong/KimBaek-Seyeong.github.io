
public class Ex01_02_정수형 {
	public static void main(String[] args) {
		
		System.out.println(10);
		
		int a; //a변수 int 선언
		a = 10; //초기화
//		int a = 10; 선언과 동시 초기화		
		
		System.out.println("a");
		System.out.println(a);
		
		byte b1, b2;
		b1 = 127;
		b2 = -128;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int b3;
		b3 = b1 + b2;
/*
 		* byte b3 에러 발생 이유 : int가 가장 효율적으로 처리할 수 있는 타입이기 때문 a와 b는 int형보다 작은 byte형이기 때문에
		* 연산자'+'는 이 두 개의 피연산자들의 자료형을 int형으로 변환한 다음 덧셈을 수행합니다. 그래서 'a+b'의 연산결과는 byte형이
		* 아닌 int형이기 때문에 7번째 줄에 형변환을 꼭 붙여야 합니다.
*/
		System.out.println(b3);
		
		int c = 1000000;
		int d = 2000000;
		
		long e;
		e=c*d;
		
		System.out.println("result = " +e);
		
		long f;
		f = (long)c*d; //same f=(long)c*(long)d;
		
		System.out.println("result = " + f);
	}
}
