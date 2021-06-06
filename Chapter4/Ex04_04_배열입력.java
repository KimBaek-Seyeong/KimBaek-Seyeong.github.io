import java.util.Scanner;

public class Ex04_04_배열입력 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 숫자 개수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		System.out.print(num+"개의 숫자를 입력하세요 : ");
		for (int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("입력한 숫자들 : ");
		for(int i=0; i<num; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		
	}
}
