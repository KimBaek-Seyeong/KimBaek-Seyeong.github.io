import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student {
	String name;
	int kor;
	int eng;
	int mat;

	public Student(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + mat;
	}
}

public class Ex12_14_김세영 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String name, answer, str, line;
		int kor, eng, mat, sum = 0;
		BufferedWriter bw = null;
		BufferedReader br = null;

		System.out.println("성적 입/출력 프로그램을 시작합니다.");
		while (true) {
			System.out.print("이름 입력 : ");
			name = sc.next();
			System.out.print("국어 입력 : ");
			kor = sc.nextInt();
			System.out.print("영어 입력 : ");
			eng = sc.nextInt();
			System.out.print("수학 입력 : ");
			mat = sc.nextInt();

			Student s = new Student(name, kor, eng, mat);
			str = s.toString(); // 이게 a파일 저장되어야 함
			bw = new BufferedWriter(new FileWriter("scoreRecord.txt", true));
			bw.write(str);
			bw.newLine();
			bw.close(); // 저장

			// a파일 내용 복사해서 b파일 만들기~!
			br = new BufferedReader(new FileReader("scoreRecord.txt"));
			bw = new BufferedWriter(new FileWriter("totalScoreRecord.txt"));
			while ((line = br.readLine()) != null) {
				String[] token = line.split("\t");
				str = "";

				for (int i = 0; i < token.length; i++) {
					if (i % 4 == 0) {
						str = "";
						sum = 0;
						str = str + token[i] + "\t";
					} else if (i % 4 == 3) {
						str = str + token[i] + "\t";
						sum += Integer.parseInt(token[i]);
						bw.write(str + "\t" + sum);
						bw.newLine();
					} else {
						str = str + token[i] + "\t";
						sum += Integer.parseInt(token[i]);
					}
				}
			}
			br.close();
			bw.close();

			while (true) {
				System.out.println();
				System.out.print("계속 하시겠습니까?(y/n) ");
				answer = sc.next();

				if (!answer.equals("y") && !answer.equals("n")) {
					System.out.println("잘못 입력하셨습니다.");
				} else
					break;
			}

			if (answer.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
