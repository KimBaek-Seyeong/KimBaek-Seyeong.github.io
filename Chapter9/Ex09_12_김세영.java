import java.util.Scanner;

public class Ex09_12_김세영 {
	public static void main(String[] args) {
		//로또 번호 맞추기
		//6개 숫자를 넣을 수 있는 배열
		int[] lotto = new int[6];
		int[] input = new int[6];
		
		//랜덤 로또 번호 생성
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1); //1~45, 45-1+1
			
			//중복 상황 방지
			for (int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					lotto[i] = (int)(Math.random()*45+1);
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("로또 번호 맞추는 프로그램입니다.\n");
		System.out.println("숫자 6개를 입력해주세요.");
		//사용자 입력
		for (int i=0; i<input.length; i++) {
			System.out.printf("숫자 %d : ", (i+1));
			input[i] = sc.nextInt();
			
			if (input[i]<1 || input[i]>45) {
				System.out.println("1부터 45 사이의 수를 입력하세요.");
				--i;
				continue;
			}
			
			for (int j=0; j<i; j++) {
				if(input[i] == input[j]) {
					System.out.println("중복된 숫자입니다. 다시 입력하세요.");
					--i;
				}
			}
		}
		System.out.println();
		
		//로또 번호 출력
		System.out.println("이번 회차 당첨 번호입니다.");
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println("\n");
		
		//배열 내용 비교
		int count=0;
		for (int i=0; i<lotto.length; i++) {
			for (int j=0; j<input.length; j++) {
				if (lotto[i] == input[i]) {
					count++;
				}
			}
		}
		
		//결과 출력
		switch(count){
		case 6 : System.out.println("축하합니다. 1등입니다.");
		case 5 : System.out.println("축하합니다. 2등입니다.");
		case 4 : System.out.println("축하합니다. 3등입니다.");
		case 3 : System.out.println("축하합니다. 4등입니다.");
		default : System.out.println("꽝입니다. 다음 기회에 도전하세요.");
		}
	}
}
