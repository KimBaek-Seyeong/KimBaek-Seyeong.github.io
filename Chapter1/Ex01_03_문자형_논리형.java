
public class Ex01_03_문자형_논리형 {
	public static void main(String[] args) {
		
		System.out.println('A');
		System.out.println("A");
		
		char ch;
		ch = 'A';
		System.out.println("ch="+ch);
		
		char ch1;
		ch1 = 65; //ASCI CODE (A 65 a 97)
		System.out.println("ch1=" +ch1);
		
		int ch2;
		ch2 = 'A';
		System.out.println("ch2="+ch2);
		
		System.out.println(ch+1); //문자상조는 문자열의 이어짐으로 결과가 나오지 않음
		System.out.println((char)(ch+1));
		
		String s = "apple";
		System.out.println(s);
		
		///////////////
		
		boolean x;
		x = true;
		boolean y = false;
		System.out.println(x+","+y);
		
		y = 10 > 5;
		System.out.println(x+","+y);
	}	
}
