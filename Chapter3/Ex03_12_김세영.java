
public class Ex03_12_�輼�� {

	public static void main(String[] args) {
		
		int i, j;
		
		for(i=2; i<10; i++) {
			if (i%2!=0) continue;
			System.out.println("****"+i+"��****");
			for(j=1;j<10;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//�߰� ^_^...(210514)
		for(i=2; i<10; i++) {
			if (i%2!=0) continue;
			System.out.println("****"+i+"��****");
			for(j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
	}
}
