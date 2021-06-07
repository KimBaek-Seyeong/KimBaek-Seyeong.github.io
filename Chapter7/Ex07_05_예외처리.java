import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex07_05_예외처리 {
	public static void main(String[] args) {
		System.out.println(Math.max(3, 4));
		// Math 클래스는 객체를 생성할 필요가 없다
		// 모든 메서드가 static이기 때문(클래스 메서드)

		double d = Math.random(); // 1보다 작은 double 값 return
		System.out.println(d);
		System.out.println(d * 100 + 1);
		System.out.println((int) (d * 100 + 1)); // 정수 난수
		System.out.println((int) (d * 6 + 3)); // 3~8 정수 난수(8-3+1)
		System.out.println((int) (Math.random() * 46 + 17)); // 17~62 정수 난수(62-17+1)

		int answer, input = 0, count = 0;
		answer = (int) (Math.random() * 100 + 1);
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("정수 하나 입력 : ");
				input = sc.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				continue;
			}
			if (answer == input) {
				System.out.println("맞췄습니다.");
				System.out.println("시도한 횟수는 " + count + "번 입니다.");
				break;
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요");
			} else if (answer > input) {
				System.out.println("더 큰 수를 입력하세요");
			}
		} while (true);
	}
}
