import java.util.Scanner;

public class Ex03_07_for {

	public static void main(String[] args) {
		
		int i;
		
		for(i=1;i<=5;i++) {
			System.out.println("java"+i);
		}
		
		System.out.println("for문 밖의 i값 : "+i);
		System.out.println();
		
		for(i=10;i>=6;i--) {
			System.out.println(i+"apple");
			System.out.println(i+"banana");
		}
		
		System.out.println("for문 밖의 i값 : "+i);
		System.out.println();
		
		int sum = 0;
		for (i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("sum : "+sum);
		
		sum=0;
		for(i=1; i<=100; i+=2) {
			sum += i;
		}
		System.out.println("홀수의 합 : "+sum);
		
		sum=0;
		for(i=0; i<=100; i+=2) {
			sum += i;
		}
		System.out.println("짝수의 합 : "+sum);
		
		sum=0;
		for(i=1; i<=100; i++) {
			if(i%5==0) {
				sum += i;
			}
		}
		System.out.println("5의 배수의 합 : "+sum);
		System.out.println();
		
		for(i=1; i<=9; i++) {
			System.out.println("7*"+i+"="+(7*i));
		}
		
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.print("출력하고 싶은 구구단 단의 수를 적으세요 : ");
		int num = sc.nextInt();
		for(i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
		
		System.out.println();
		
		if(num%2==0) {
			for(i=1; i<=9; i++) {
				System.out.println(num+"*"+i+"="+(num*i));
			}	
		}else {
			System.out.println("짝수단이 아니므로, 출력되지 않습니다.");
		}
		
		System.out.println();
		
			
		
	}
}
