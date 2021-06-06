import java.util.Scanner;

public class Ex04_06_2차원 {

	public static void main(String[] args) {
		
		int[] kor = {10, 20, 30};
		int[] eng = {10, 20, 30};
		int[] mat = {10, 20, 30};
		
		int i, j;
		Scanner sc = new Scanner(System.in);
		for (i=0; i<kor.length; i++) {
			System.out.print(kor[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		int[][] tmp = {kor, eng, mat}; //int[][] score = new score[4][] 가능
		
		for(i=0; i<tmp.length; i++) {
			for(j=0 ; j<tmp[i].length; j++) {
				System.out.print(tmp[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		int[][] score = {{80,72,68},{33,93,43},{21,90,44},{78,52,71}};
		
		for(i=0; i<score.length;i++) {
			for(j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		System.out.print("입력할 행의 수 : ");
		int num = sc.nextInt();
		System.out.print("입력할 열의 수 : ");
		int num2 = sc.nextInt();
		int[][] arr = new int[num][num2];
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.print(i+"행"+j+"열 : ");
				arr[i][j] = sc.nextInt();
			}
		}
		for(int[] y:arr) {
			for(int z:y) {
				System.out.print(z+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
	}
}
