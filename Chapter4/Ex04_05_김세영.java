import java.util.Scanner;

public class Ex04_05_�輼�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0, max = num[0], min = num[0];

		while (true) {
			System.out.println("1:���� �Է�, 2:���հ� ���, 3:max�� min, 4:���α׷� ����");
			int tmp = sc.nextInt();

			if (tmp == 1) {
				System.out.print("���� 5�� �Է� : ");
				for (int i = 0; i < 5; i++) {
					num[i] = sc.nextInt();
				}
			} else if (tmp == 2) {
				for (int i = 0; i < num.length; i++) {
					sum += num[i];
				}
				double avg = (double) sum / num.length;

				System.out.println("���� : " + sum);
				System.out.printf("��� : %.2f\n", avg);
			} else if (tmp == 3) {
				for (int i = 0; i < num.length; i++) {
					sum += num[i];
					if (max < num[i])
						max = num[i];
					if (min > num[i])
						min = num[i];
				}
				System.out.println("���� ū �� : " + max);
				System.out.println("���� ���� �� : " + min);
			} else if (tmp == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			} else {
				System.out.println("1~4�� ���ڸ� �Է� ����");
			}
		}

	}
}
