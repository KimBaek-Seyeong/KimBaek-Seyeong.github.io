import java.util.Scanner;

class Student{
	String name;
	int kor, eng, mat;
	
	//합계 구하는 메서드 정의
	int sum() {
		return kor+eng+mat;
	}
	//평균 구하는 메서드 정의
	double avg() {
		return (double)kor+eng+mat/3.0;
	}
}


public class Ex05_05_김세영 {

	public static void main(String[] args) {
		
		// 입력 - 이름, 국어, 영어, 수학
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		System.out.print("성적을 입력하고자 하는 학생의 이름 : ");
		st.name = sc.next();
		System.out.print(st.name+"의 국어 성적 : ");
		st.kor = sc.nextInt();
		System.out.print(st.name+"의 영어 성적 : ");
		st.eng = sc.nextInt();
		System.out.print(st.name+"의 수학 성적 : ");
		st.mat = sc.nextInt();
		
		//합계 메서드 호출
		int sumRes = st.sum();
		//평균 메서드 호출
		double avgRes = st.avg();
		
		System.out.println("합계 : "+sumRes);
		System.out.printf("평균 : %.2f", avgRes);
	}
}
