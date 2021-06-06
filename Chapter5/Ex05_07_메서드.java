
public class Ex05_07_¸Þ¼­µå {
	
	static void sub(int[] x) {
		
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	static void sub2(int a, int b, int c) {
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		System.out.print(c+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30};
		
		sub(arr);
		sub2(arr[0], arr[1], arr[2]);
	}
}
