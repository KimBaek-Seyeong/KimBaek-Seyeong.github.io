
public class Ex02_04_관계논리 {

	public static void main(String[] args) {
		
		int a=10, b=20;
		boolean c=a<=b;
		
		System.out.println("a<=b : "+c);
		System.out.println("a>b : "+(a>b));
		System.out.println("a!=b : "+(a!=b));
		System.out.println("a==b : "+(a==b));
		
		boolean d = a>5 || b>5; //or
		boolean e = a<5 && b>5; //and
		System.out.println("a>5 || b>5 : "+d);
		System.out.println("!(a>5 || b>5) : "+!d);
		System.out.println("a<5 && b>5 : "+e);
		System.out.println("!(a<5 && b>5) : "+!e);
		
	}
}
