
public class Ex05_09_Àç±ÍÈ£Ãâ {

	public static void main(String[] args) {
		
		int num = 4;
		int result = 1;
		
		for(num = 4; num >= 1; num--) {
			result *= num;
		}
		System.out.println(result);
		
		System.out.println("4! = "+factorial(4));
	}
	
	static int factorial(int x) {
		
		if (x==1) return 1;
		else return x*factorial(x-1);
	}
}
