import java.util.Scanner;

public class Ex02_05_삼항 {

	public static void main(String[] args) {
		
		int a, b, result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a와 b를 적어주세요. : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		result = a>b ? a:b;
		System.out.println("result(a>b?) : "+(result==a?"true":"false"));
		
		String result2 = a%2==0? "yes":"no";
		String result3 = a%2!=0? "yes":"no";
		System.out.println("result2(Is 'a' an even number?) : "+result2);
		System.out.println("result3(Is 'a' an odd number?) : "+result3);
	}
}
