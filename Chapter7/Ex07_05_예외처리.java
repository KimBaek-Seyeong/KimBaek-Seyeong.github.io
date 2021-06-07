import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex07_05_����ó�� {
	public static void main(String[] args) {
		System.out.println(Math.max(3, 4));
		// Math Ŭ������ ��ü�� ������ �ʿ䰡 ����
		// ��� �޼��尡 static�̱� ����(Ŭ���� �޼���)

		double d = Math.random(); // 1���� ���� double �� return
		System.out.println(d);
		System.out.println(d * 100 + 1);
		System.out.println((int) (d * 100 + 1)); // ���� ����
		System.out.println((int) (d * 6 + 3)); // 3~8 ���� ����(8-3+1)
		System.out.println((int) (Math.random() * 46 + 17)); // 17~62 ���� ����(62-17+1)

		int answer, input = 0, count = 0;
		answer = (int) (Math.random() * 100 + 1);
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("���� �ϳ� �Է� : ");
				input = sc.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}
			if (answer == input) {
				System.out.println("������ϴ�.");
				System.out.println("�õ��� Ƚ���� " + count + "�� �Դϴ�.");
				break;
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			} else if (answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���");
			}
		} while (true);
	}
}
