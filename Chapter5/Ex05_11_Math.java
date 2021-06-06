
public class Ex05_11_Math {

	public static void main(String[] args) {
		
		int a=300, b=40, c;
		c = max(a,b);
		c = Math.max(a, b);
		System.out.println("c: "+c);
		
		System.out.println(Math.PI);
		
		System.out.println(Math.min(1, 2));
		
		System.out.println(Math.abs(-100));
	}
	
	static int max(int x, int y) {
		if(x > y) return x;
		if(x < y) return y;
		return 0;
	}
}

//java11 documentation : https://docs.oracle.com/en/java/javase/11/docs/api/