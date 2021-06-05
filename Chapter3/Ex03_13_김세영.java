
public class Ex03_13_김세영 {

	public static void main(String[] args) {
		
		int i;
		
		for (i=1; i<=100; i++) {
			if (i%10==0) System.out.print(i+" ");
		}
		System.out.println("\n");
		
		int sum=0; //1~100까지 10단위로 합
		for (i=1; i<=100; i++) {
			sum += i;
			if (i%10==0) System.out.println("1~"+i+"="+sum);
		}
		System.out.println();
		
		sum=0;
		int tmp=0;
		for (i=1; i<=100; i++) {
			sum += i;
			if (i%10==0) {
				System.out.println((i-9)+"~"+i+"="+(sum-tmp));
				tmp = sum;
			}
		}
		System.out.println();
		
		sum=0;
		for (i=1; i<=100; i++) {
			sum += i;
			if (i%10==0) {
				System.out.println((i-9)+"~"+i+"="+sum);
				sum=0;
			}
		}

	}
}
