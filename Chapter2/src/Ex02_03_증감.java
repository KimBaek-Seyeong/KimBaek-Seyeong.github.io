
public class Ex02_03_Αυ°¨ {

	public static void main(String[] args) {
		
		int a=5, b=5, aa, bb;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
//		a++;
//		System.out.println("a="+a);
//		++a;
//		System.out.println("a="+a);
//		a--;
//		System.out.println("a="+a);
//		--a;
//		System.out.println("a="+a);
		
		System.out.println();
		
		aa=a++;
		System.out.println("a="+a);
		System.out.println("aa="+aa);
		bb=++b;
		System.out.println("b="+b);
		System.out.println("bb="+bb);
		aa=a--;
		System.out.println("a="+a);
		System.out.println("aa="+aa);
		bb=--b;
		System.out.println("b="+b);
		System.out.println("bb="+bb);
		
		System.out.println();
		
		int i=10;
		System.out.println(i++); //10
		System.out.println(++i); //12
		System.out.println(++i); //13
		System.out.println(i++); //13
		System.out.println(i);  //14
		
		System.out.println();
		
		i=10;
		System.out.println(i--); //10
		System.out.println(--i); //8
		System.out.println(--i); //7
		System.out.println(i--); //7
		System.out.println(i);  //6
		
	}
}
