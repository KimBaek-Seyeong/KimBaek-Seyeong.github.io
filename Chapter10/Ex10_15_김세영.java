import java.util.HashMap;
import java.util.Scanner;

class Student {
	private String addr;
	private double height;
	private int kor;

	public Student() {

	}

	public Student(String addr, double height, int kor) {
		super();
		this.addr = addr;
		this.height = height;
		this.kor = kor;
	}

	@Override
	public String toString() {
		return "(주소)" + addr + " (키)" + height + " (점수)" + kor;
	}
}

public class Ex10_15_김세영 {
	public static void main(String[] args) {

		// map으로 생성, key는 이름, value는 (주소 키 국어)
		HashMap<String, Student> m = new HashMap<String, Student>();

		Scanner sc = new Scanner(System.in);
		String name, addr, answer;
		double height;
		int kor;

		// 이름 주소 키 국어 입력
		System.out.println("프로그램을 시작합니다.\n=====값 입력====\n");
		while (true) {
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("주소 : ");
			addr = sc.next();
			System.out.print("키(숫자만 작성) : ");
			height = sc.nextDouble();
			System.out.print("국어 점수(정수로 작성) : ");
			kor = sc.nextInt();

			Student s = new Student(addr, height, kor);
			m.put(name, s);

			while (true) {
				System.out.print("계속 하시겠습니까? ");
				answer = sc.next();
				System.out.println();

				if (!answer.equals("y") && !answer.equals("n")) {
					System.out.println("잘못 입력하셨습니다.");
				} else break;
			}

			if (answer.equals("n")) {
				for(String i : m.keySet()){
				    System.out.println(i+"="+m.get(i));
				}
				System.out.println("입력을 중단합니다.");
				break;
			}
		}

		//검색
		System.out.println("\n\n=====검색=====\n");
		while (true) {
			while (true) {
				System.out.print("찾고 싶은 학생이 있으십니까? ");
				answer = sc.next();
				System.out.println();

				if (!answer.equals("y") && !answer.equals("n")) {
					System.out.println("잘못 입력하셨습니다.");
				} else break;
			}
			if (answer.equals("n")) {
				System.out.println("검색을 중단합니다.");
				break;
			}
						
			System.out.println("찾고 싶은 학생의 이름을 입력하세요.");
			System.out.print("이름 : ");
			name = sc.next();

			System.out.println();
			if(m.get(name) != null) {
				System.out.println("검색 결과입니다.");
				System.out.println(name+"="+m.get(name));
				System.out.println();
			} else System.out.println("찾는 이름이 없습니다.");
			
			System.out.print("계속 하시겠습니까? ");
			answer = sc.next();
			System.out.println();
			if (answer.equals("n")) {
				System.out.println("검색을 중단합니다.");
				break;
			}
		}
		
		System.out.println("\n\n=====삭제=====\n");
		while (true) {
			while (true) {
				System.out.print("삭제할 내역이 있으십니까? ");
				answer = sc.next();
				System.out.println();
				
				if (!answer.equals("y") && !answer.equals("n")) {
					System.out.println("잘못 입력하셨습니다.");
				} else break;
			}
			if (answer.equals("n")) {
				System.out.println("삭제를 중단합니다.");
				break;
			}
			
			System.out.println("내역에서 제외할 학생의 이름을 입력하세요.");
			System.out.print("이름 : ");
			name = sc.next();
			
			System.out.println();
			if(m.get(name) != null) {
				m.remove(name);
				System.out.println("삭제 되었습니다. 남은 내역은 아래와 같습니다.");
				for(String i : m.keySet()){
				    System.out.println(i+"="+m.get(i));
				}
			} else System.out.println("해당 학생의 내역이 없습니다.");
			
			System.out.print("계속 하시겠습니까? ");
			answer = sc.next();
			System.out.println();
			if (answer.equals("n")) {
				System.out.println("삭제를 중단합니다.");
				break;
			}
		}
		
		System.out.println("\n프로그램을 종료합니다.");
	}
}
