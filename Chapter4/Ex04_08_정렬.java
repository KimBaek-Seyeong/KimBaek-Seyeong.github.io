
public class Ex04_08_정렬 {

	public static void main(String[] args) {
		
		int x=10, y=20, tmp, i, j;
		System.out.println(x+", "+y);
		tmp = y;
		y = x;
		x = tmp;
		System.out.println(x+", "+y);
		
		System.out.println();
		
		int[] arr = {8,3,5,2,9};
		
		for(i=0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(i=0; i<arr.length-1;i++) { //기준
			for(j=i+1; j<arr.length; j++) { //비교대상
				if(arr[i]>arr[j]) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
			for(int k=0;k<arr.length; k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("정렬 후 결과");
		for(i=0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		
	}
}
