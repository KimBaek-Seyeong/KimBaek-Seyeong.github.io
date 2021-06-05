import java.util.Scanner;

public class Ex03_04_switch_case {

	public static void main(String[] args) {
		
		String fruit;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신이 좋아하는 과일을 입력하세요 : ");
		fruit = sc.next();
		System.out.println(fruit+", 좋아하시나요?");
		
		switch (fruit) {
		case "apple":
			System.out.println("당신에게 사과 파이를 추천합니다.");
			break;
		case "banana":
			System.out.println("당신에게 바나나 깡을 추천합니다.");
			break;
		default:
			System.out.println("당신에게 "+fruit+" 주스를 추천합니다.");
			break;
		}
	}
}
