import java.util.Scanner;

public class Ex02_05_���� {

	public static void main(String[] args) {
		
		int a, b, result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� a�� b�� �����ּ���. : ");
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
