//import java.lang.Math;
//import java.lang.Math.*; //Math Ŭ���� �̸� �����ϰ� �޼ҵ� �̸��� ���� �� �ִ�

public class Ex09_07_Math {
	public static void main(String[] args) {
		int a=10, b=20;
		int big=Math.max(a, b);
		System.out.println("ū �� : "+big);
		System.out.println();
		
		//3~9 ���� //9-3+1���ϰ� +������(���Ǽ�)
		int ran = (int)(Math.random()*7+3);
		System.out.println("ran : "+ran);
		System.out.println();
		
		//�ݿø�
		System.out.println(Math.round(3.8));
		System.out.println(Math.round(3.2));
		
		//�ø�
		System.out.println(Math.ceil(3.2));
		System.out.println(Math.ceil(3.8));
		
		//����
		System.out.println(Math.floor(3.2));
		System.out.println(Math.floor(3.8));
	}
}
