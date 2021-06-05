import java.util.Scanner;

public class Ex03_11_break_continue {

	public static void main(String[] args) {
		
		int i=0;
		for(;i<10;i++) {
			System.out.print(i+1+" ");
		}
		System.out.println();

		for(i=0;i<10;i++) {
			if(i+1==5) break;
			System.out.print(i+1+" ");
		}
		System.out.println();

		i=0;
		for(;i<10;i++) {
			if(i+1==5) continue;
			System.out.print(i+1+" ");
		}
		System.out.println();
		
		i=0;
		while(i<5) {
			System.out.print(i+1+" ");
			i++;
		}
		System.out.println();
		
		i=0;
		while(i<5) {
			System.out.print(i+1+" ");
			i++;
			if(i>5) break;
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		int num, sum=0;
		
		i=0;
		while(true) {
			System.out.print("수 입력 : ");
			num = sc.nextInt();
			if(num<0) break;
			else if (num!=0) sum+=num;
		}
		System.out.println("입력한 양수의 합계 : "+sum);
		System.out.println();
		
	}
}
