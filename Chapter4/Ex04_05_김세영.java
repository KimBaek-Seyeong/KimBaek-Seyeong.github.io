import java.util.Scanner;

public class Ex04_05_김세영 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0, max = num[0], min = num[0];

		while (true) {
			System.out.println("1:숫자 입력, 2:총합과 평균, 3:max와 min, 4:프로그램 종료");
			int tmp = sc.nextInt();

			if (tmp == 1) {
				System.out.print("숫자 5개 입력 : ");
				for (int i = 0; i < 5; i++) {
					num[i] = sc.nextInt();
				}
			} else if (tmp == 2) {
				for (int i = 0; i < num.length; i++) {
					sum += num[i];
				}
				double avg = (double) sum / num.length;

				System.out.println("총합 : " + sum);
				System.out.printf("평균 : %.2f\n", avg);
			} else if (tmp == 3) {
				for (int i = 0; i < num.length; i++) {
					sum += num[i];
					if (max < num[i])
						max = num[i];
					if (min > num[i])
						min = num[i];
				}
				System.out.println("가장 큰 값 : " + max);
				System.out.println("가장 작은 값 : " + min);
			} else if (tmp == 4) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("1~4의 숫자만 입력 가능");
			}
		}

	}
}
