import java.util.Scanner;

public class Ex03_09_¿Ã¡ﬂforπÆ_±Ëººøµ {

	public static void main(String[] args) {
		
		int i, j;
		for(i=0; i<5; i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=0; i<5; i++) {
			for(j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(i=0; i<5; i++) {
			for(j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=0; i<5; i++) {
			for(j=0; j<i+2; j++) {
				System.out.print(" ");
			}
			for(j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(i=0; i<5; i++) {
			for(j=0; j<4-i; j++) {
				System.out.print(" ");
			}			
			for(j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=0; i<5; i++) {
			for(j=0;j<i;j++) {
				System.out.print(" ");
			}			
			for(j=0; j<=8-2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n\n\n\n\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("»¶ºˆ ¿‘∑¬ : ");
		int num = sc.nextInt();
		num += 2;
		
		for (i=0; i<num;i++) {
			for (j=0; j<num; j++) {
				if (i<=num/2) {
					if(i+j<=num/2-1) {
						System.out.print(" ");
					}else if(j-i>=num/2+1) {
						System.out.print(" ");
					}else System.out.print("*");
				}
				if (i>num/2) {
					if(i-j>=num/2+1) {
						System.out.print(" ");
					}else if(i+j>=num/2*3+1) {
						System.out.print(" ");
					}else System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
