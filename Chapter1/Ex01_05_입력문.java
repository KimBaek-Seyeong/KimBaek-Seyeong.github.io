import java.util.Scanner;

public class Ex01_05_입력문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\"이름을 적어주세요\" : ");
//		String name = "김연아";
		String name = sc.next();
		
		System.out.print("\"국어 점수를 작성해주세요\" : ");
		int kor = sc.nextInt();
		
		System.out.print("\"영어 점수를 작성해주세요\" : ");
		int eng = sc.nextInt();
		
		System.out.print("\"수학 점수를 작성해주세요\" : ");
		int mat = sc.nextInt();
		
		System.out.printf("\"안녕하세요, %s 님.\"\n", name);
		System.out.printf("\"%s 님의 국어 점수는 %d점, 영어 점수는 %d점, 수학 점수는 %d점 입니다.\"\n", name, kor, eng, mat);
		
		int tot = kor + eng + mat;
		float avg = (float)tot/3; //same with float average = total/3.0;
		
		System.out.printf("\"%s 님의 국어, 영어, 수학의 점수 합계는 %d점, 평균은 %.2f점 입니다.\"\n", name, tot, avg);
		
	}
}