
public class Ex02_02_복합대입 {

	public static void main(String[] args) {
		
		int a=10, b=20, c=30, d=40, e=50;
		char ch = 'a';
		String fruit = "apple";
		
		System.out.println("a="+a);
		a+=3;
		System.out.println("new! a="+a);
		
		System.out.println("b="+b);
		b-=3;
		System.out.println("new! b="+b);

		System.out.println("c="+c);
		c*=3;
		System.out.println("new! c="+c);
		
		System.out.println("d="+d);
		d/=3;
		System.out.println("new! d="+d);
		
		System.out.println("e="+e);
		e%=3;
		System.out.println("new! e="+e);
		
		ch+=3; //same with ch = (char)(ch+3);
		System.out.println(ch);
		ch-=3; //same with ch = (char)(ch-3);
		System.out.println(ch);
		ch*=3; //same with ch = (char)(ch*3);
		System.out.println(ch);
		ch/=3; //same with ch = (char)(ch/3);
		System.out.println(ch);
		ch%=3; //same with ch = (char)(ch%3);
		System.out.println(ch);
		
		System.out.println("fruit : "+fruit);
		fruit+=" mango";
		System.out.println("fruit : "+fruit);
		
	}
}
