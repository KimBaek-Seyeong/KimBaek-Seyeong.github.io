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

public class Ex12_14_�輼�� {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String name, answer, str, line;
		int kor, eng, mat, sum = 0;
		BufferedWriter bw = null;
		BufferedReader br = null;

		System.out.println("���� ��/��� ���α׷��� �����մϴ�.");
		while (true) {
			System.out.print("�̸� �Է� : ");
			name = sc.next();
			System.out.print("���� �Է� : ");
			kor = sc.nextInt();
			System.out.print("���� �Է� : ");
			eng = sc.nextInt();
			System.out.print("���� �Է� : ");
			mat = sc.nextInt();

			Student s = new Student(name, kor, eng, mat);
			str = s.toString(); // �̰� a���� ����Ǿ�� ��
			bw = new BufferedWriter(new FileWriter("scoreRecord.txt", true));
			bw.write(str);
			bw.newLine();
			bw.close(); // ����

			// a���� ���� �����ؼ� b���� �����~!
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
				System.out.print("��� �Ͻðڽ��ϱ�?(y/n) ");
				answer = sc.next();

				if (!answer.equals("y") && !answer.equals("n")) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				} else
					break;
			}

			if (answer.equals("n")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
}
