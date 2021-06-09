import java.util.HashSet;

public class Ex10_11_HashSet {
	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		
		int[] arr = new int[6]; 
		int i;
		for(i=0;i<arr.length;i++) { // 1~10 정수 난수 발생
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
//		출력
		for(i=0;i<arr.length;i++) { 
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
//		for(i=0;i<6;i++) {
//			int r = (int)(Math.random() * 10 + 1);
//			System.out.println("r:"+r);
//			hs.add(r); // r=>new Integer(r)
//		}
		
		while(true) {
			int r = (int)(Math.random() * 10 + 1);
			System.out.println("r:"+r);
			hs.add(r);
			if(hs.size() == 6)
				break;
		}
		
		// 출력
		System.out.println("hs:"+hs);
	}

}