import java.util.Scanner;

public class Ex04_07_김세영 {

	public static void main(String[] args) {
		
		/*
		 2행 3열 배열 만들기
		 70 80 37
		 21 19 20
		 0행의 합
		 1행의 합
		 0열의 합
		 1열의 합
		 2열의 합
		 전체의 합
		 */
		
		int[][] arr = new int[2][3];
		int i, j, tot=0;
		int[] sum = new int[2];
		int[] sum2 = new int[3];
		// sum : 행의 합, sum2 : 열의 합, tot : 전체 합
		
		//입력
		Scanner sc = new Scanner(System.in);
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.print(i+"행"+j+"열 : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		//합 계산
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
		
		//출력
		for(i=0;i<sum.length; i++) {
			System.out.println(i+"행의 합 : "+sum[i]);
		}
		for(i=0;i<sum2.length; i++) {
			System.out.println(i+"열의 합 : "+sum2[i]);
		}
		System.out.println("전체의 합 : "+tot);
				
	}
}
