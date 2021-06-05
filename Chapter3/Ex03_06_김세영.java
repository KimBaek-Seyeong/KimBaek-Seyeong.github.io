import java.util.Scanner;

public class Ex03_06_김세영 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은? ");
		String name = sc.next();
		System.out.print("국어 점수는? ");
		int kor = sc.nextInt();
		System.out.print("영어 점수는? ");
		int eng = sc.nextInt();
		System.out.print("수학 점수는? ");
		int mat = sc.nextInt();
		
		System.out.println("------------------------------");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat);
		
		int tot = kor+eng+mat;
		float avg = (float)tot/3;
		
		System.out.println("------------------------------");
		System.out.println("총점 : "+tot);
		System.out.printf("평균 : %.2f\n", avg);
		
		System.out.println("------------------------------");
		
		char grade;
		
		if(avg>=90) {
			grade = 'A';
		}else if(avg>=80) {
			grade = 'B';
		}else if(avg>=70) {
			grade = 'C';
		}else if(avg>=60) {
			grade = 'D';
		}else grade = 'F';
		
		System.out.println("학점 = "+grade);
		
		switch(grade) {
			case 'A':
				System.out.println("학점4 : "+grade);
				break;
			case 'B':
				System.out.println("학점3 : "+grade);
				break;
			case 'C':
				System.out.println("학점2 : "+grade);
				break;
			case 'D':
				System.out.println("학점1 : "+grade);
				break;
			default:
				System.out.println("학점0 : "+grade);
			
		}
		
	}
}
