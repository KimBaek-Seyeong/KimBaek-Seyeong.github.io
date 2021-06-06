
public class Ex04_03_최대최소 {

	public static void main(String[] args) {
		
		int[] score = {79, 88, 93, 32, 100, 68, 95};
		
		int sum=0;
		for (int i=0; i<score.length; i++) {
			System.out.print(score[i]+" ");
			sum += score[i];
		}
		System.out.println();
		System.out.println("score sum : "+sum);
		System.out.println("score avg : "+(sum/score.length));
		
		int max=score[0], min=score[0];
		for (int i=1; i<score.length; i++) {
			if(max < score[i]) max=score[i];
			if(min > score[i]) min=score[i];
		}
		System.out.println("score max : "+max);
		System.out.println("score min : "+min);
		System.out.println();
		
	}
}
