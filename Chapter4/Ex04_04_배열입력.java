import java.util.Scanner;

public class Ex04_04_�迭�Է� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է��� ���� ���� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		System.out.print(num+"���� ���ڸ� �Է��ϼ��� : ");
		for (int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("�Է��� ���ڵ� : ");
		for(int i=0; i<num; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		
	}
}
