
public class Ex03_10_while {

	public static void main(String[] args) {
		
		int i=1;
		
		while(i<=5) {
			System.out.println("Hello, No."+i);
			i +=1;
		}
		System.out.println("My name is No."+i);
		System.out.println();
		
		i=6;
		do {
			System.out.println("Welcome, No."+i);
			i +=1;
		}while(i<=5);
		System.out.println("Just call me, "+i);
		
	}
}
