import java.util.Scanner;

public class Ex09_12_�輼�� {
	public static void main(String[] args) {
		//�ζ� ��ȣ ���߱�
		//6�� ���ڸ� ���� �� �ִ� �迭
		int[] lotto = new int[6];
		int[] input = new int[6];
		
		//���� �ζ� ��ȣ ����
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1); //1~45, 45-1+1
			
			//�ߺ� ��Ȳ ����
			for (int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random()*45+1);
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ζ� ��ȣ ���ߴ� ���α׷��Դϴ�.\n");
		System.out.println("���� 6���� �Է����ּ���.");
		//����� �Է�
		for (int i=0; i<input.length; i++) {
			System.out.printf("���� %d : ", (i+1));
			input[i] = sc.nextInt();
			
			if (input[i]<1 || input[i]>45) {
				System.out.println("1���� 45 ������ ���� �Է��ϼ���.");
				--i;
				continue;
			}
			
			for (int j=0; j<i; j++) {
				if(input[i] == input[j]) {
					System.out.println("�ߺ��� �����Դϴ�. �ٽ� �Է��ϼ���.");
					--i;
				}
			}
		}
		System.out.println();
		
		//�ζ� ��ȣ ���
		System.out.println("�̹� ȸ�� ��÷ ��ȣ�Դϴ�.");
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println("\n");
		
		//�迭 ���� ��
		int count=0;
		for (int i=0; i<lotto.length; i++) {
			for (int j=0; j<input.length; j++) {
				if (lotto[i] == input[i]) {
					count++;
				}
			}
		}
		
		//��� ���
		switch(count){
		case 6 : System.out.println("�����մϴ�. 1���Դϴ�.");
		case 5 : System.out.println("�����մϴ�. 2���Դϴ�.");
		case 4 : System.out.println("�����մϴ�. 3���Դϴ�.");
		case 3 : System.out.println("�����մϴ�. 4���Դϴ�.");
		default : System.out.println("���Դϴ�. ���� ��ȸ�� �����ϼ���.");
		}
	}
}
