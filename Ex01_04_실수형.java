
public class Ex01_04_실수형 {
	public static void main(String[] args) {
		
		float f1;
		f1 = 1.234f; //4바이트임을 알려줘야 함
				
		double d1;
		d1 = 3.14156294; //same with d1 = 3.14156294d;

		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 0.12000f;
		System.out.println(f2);
		
		float f3 = 1.123456789f;
		System.out.println(f3);
		
		double d2 = .889E5;
		System.out.println(d2);
		
		double d3 = .889E-5;
		System.out.println(d3);
		
		float f4 = 3.567F;
		int i = (int)f4;
		System.out.println(f4);
		System.out.println(i);
		
		int i2 = 34;
		f4 = i2;
		System.out.println(f4);
		
		f4 = (float)d3;
		System.out.println(f4);
	}
}
