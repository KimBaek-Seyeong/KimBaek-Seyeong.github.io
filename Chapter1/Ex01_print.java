public class Ex01_print {
	public static void main(String[] args) {
		
		System.out.print(10);
		System.out.print(20);
		System.out.print(10+20);
		System.out.print("\n");
		
		System.out.println(10);
		System.out.println(20);
		System.out.println(10+20);
		
		System.out.println('a');
		System.out.println("a");
//		System.out.println('abc');
		System.out.println("abc");
		
//		System.out.println('20');
		System.out.println("20");
		System.out.println("10+20");
		
//		System.out.println('');
		System.out.println(' ');
		System.out.println("");
		
//		System.out.println("ab" "xy");
		System.out.println("ab"+"xy");
		System.out.println("10"+"20");
		System.out.println("10+20="+10+20); //���ڿ� ���� +�� ��� ������ �ǹ�
		System.out.println("10+20="+(10+20)); //() �켱 ����
		
		int a = 100;
		char b = 'A';
		float c = 12.987f;
		System.out.println("a="+a);
		System.out.printf("a=%d ", a);
		System.out.printf("b=%c", b);
		System.out.printf("b=%d\n", (int)b);
		System.out.printf("b=%5d\n", (int)b);
		System.out.printf("c=%f\n", c);
		System.out.printf("c=%.2f\n", c);
		
		System.out.println("\t�ȳ��ϼ���\n\t\"'�輼��'\"�Դϴ�.");
	}
}

