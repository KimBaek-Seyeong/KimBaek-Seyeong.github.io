import java.util.Scanner;

public class Ex04_07_�輼�� {

	public static void main(String[] args) {
		
		/*
		 2�� 3�� �迭 �����
		 70 80 37
		 21 19 20
		 0���� ��
		 1���� ��
		 0���� ��
		 1���� ��
		 2���� ��
		 ��ü�� ��
		 */
		
		int[][] arr = new int[2][3];
		int i, j, tot=0;
		int[] sum = new int[2];
		int[] sum2 = new int[3];
		// sum : ���� ��, sum2 : ���� ��, tot : ��ü ��
		
		//�Է�
		Scanner sc = new Scanner(System.in);
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.print(i+"��"+j+"�� : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		//�� ���
		System.out.println();
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				tot += arr[i][j];
				sum[i] += arr[i][j];
			}
		}
		
		for(j=0; j<arr[0].length; j++) {
			for(i=0;i<arr.length; i++) {
				sum2[j]+=arr[i][j];
			}
		}
		
		//���
		for(i=0;i<sum.length; i++) {
			System.out.println(i+"���� �� : "+sum[i]);
		}
		for(i=0;i<sum2.length; i++) {
			System.out.println(i+"���� �� : "+sum2[i]);
		}
		System.out.println("��ü�� �� : "+tot);
				
	}
}
