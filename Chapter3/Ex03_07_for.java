import java.util.Scanner;

public class Ex03_07_for {

	public static void main(String[] args) {
		
		int i;
		
		for(i=1;i<=5;i++) {
			System.out.println("java"+i);
		}
		
		System.out.println("for�� ���� i�� : "+i);
		System.out.println();
		
		for(i=10;i>=6;i--) {
			System.out.println(i+"apple");
			System.out.println(i+"banana");
		}
		
		System.out.println("for�� ���� i�� : "+i);
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
		System.out.println("Ȧ���� �� : "+sum);
		
		sum=0;
		for(i=0; i<=100; i+=2) {
			sum += i;
		}
		System.out.println("¦���� �� : "+sum);
		
		sum=0;
		for(i=1; i<=100; i++) {
			if(i%5==0) {
				sum += i;
			}
		}
		System.out.println("5�� ����� �� : "+sum);
		System.out.println();
		
		for(i=1; i<=9; i++) {
			System.out.println("7*"+i+"="+(7*i));
		}
		
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.print("����ϰ� ���� ������ ���� ���� �������� : ");
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
			System.out.println("¦������ �ƴϹǷ�, ��µ��� �ʽ��ϴ�.");
		}
		
		System.out.println();
		
			
		
	}
}
