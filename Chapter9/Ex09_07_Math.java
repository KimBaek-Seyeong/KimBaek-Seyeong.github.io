//import java.lang.Math;
//import java.lang.Math.*; //Math 클래스 이름 생략하고 메소드 이름만 적을 수 있다

public class Ex09_07_Math {
	public static void main(String[] args) {
		int a=10, b=20;
		int big=Math.max(a, b);
		System.out.println("큰 수 : "+big);
		System.out.println();
		
		//3~9 난수 //9-3+1곱하고 +작은수(앞의수)
		int ran = (int)(Math.random()*7+3);
		System.out.println("ran : "+ran);
		System.out.println();
		
		//반올림
		System.out.println(Math.round(3.8));
		System.out.println(Math.round(3.2));
		
		//올림
		System.out.println(Math.ceil(3.2));
		System.out.println(Math.ceil(3.8));
		
		//내림
		System.out.println(Math.floor(3.2));
		System.out.println(Math.floor(3.8));
	}
}
