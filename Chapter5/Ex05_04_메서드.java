import java.util.Scanner;

class Calculator{
	static int sum(int x, int y) { //static method
		return x+y;
	}
	int sub(int x, int y) {//instance method
		return x-y;
	}
}

public class Ex05_04_�޼��� { //����Ŭ���� ���� �޼���� static �ʼ�

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �� �Է� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
//		Calculator.sum(10, 20);
		Calculator cal = new Calculator();
		int sumRes = cal.sum(num1, num2);
		int subRes = cal.sub(num1, num2);
		System.out.println("���ϱ� : "+sumRes);
		System.out.println("���� : "+subRes);
	}
}
