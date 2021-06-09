import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

//문제 잘못 이해함 입력 받아서 확인하는 게 아니라
//전체 단어:단어 수 임
public class Ex12_13_김세영 {
	public static void main(String[] args) {
		System.out.println("입력 단어 빈도 수 확인 프로그램을 시작합니다.");

		FileReader fr = null;
		BufferedReader br = null;

		// 검색할 단어 입력 : 콘솔에서
		Scanner sc = new Scanner(System.in);
		String word, answer; // 검색할 단어, 계속할지 여부 넣을 변수
		String str = ""; // 파일 한 줄 읽기
		String[] token = null; // 단어 넣기
		int count = 0; // 입력한 단어 수 체크 변수

		try {
			// lyrics.txt 파일 읽기 //IOException try~catch
			fr = new FileReader("lyrics.txt");
			br = new BufferedReader(fr);

			while (true) {
				System.out.print("단어 입력 : ");
				word = sc.next();

				while ((str = br.readLine()) != null) {
					token = str.split(" ");
					for (int i = 0; i < token.length; i++) {
						if (token[i].equalsIgnoreCase(word)) {
							count++;
						}
					}
				}

				if (count != 0) {
					System.out.println(word + "는 " + count + "번 등장합니다.");
				} else {
					System.out.println("찾는 단어가 없습니다.");
				}

				while (true) {
					System.out.print("계속 하시겠습니까? ");
					answer = sc.next();
					System.out.println();

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

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// IOException try~catch
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
