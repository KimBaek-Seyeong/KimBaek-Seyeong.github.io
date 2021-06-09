import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex12_12_김세영 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false; //단어 있나요? 변수
		String str, line; //str : 단어/뜻 입력, line : 파일 줄 단위 읽기
		String[] token = null; //line으로 읽은 문자열 단어 단위로 나눠 저장(0은 영어 단어, 1은 한글 뜻)
		int menu; //무슨 메뉴 선택?

		System.out.println("영한 단어장 프로그램을 시작합니다.");
		while (true) {
			System.out.print("1.단어입력  2.단어검색  3.종료  : ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.print("단어/뜻 형식으로 입력하세요 : ");
				br = new BufferedReader(new InputStreamReader(System.in)); //scanner와 다르게 공백 입력 가능
				str = br.readLine();

				bw = new BufferedWriter(new FileWriter("dictionary.txt", true));
				bw.write(str);
				bw.newLine();
				bw.close(); // 저장
				break;

			case 2:
				System.out.print("검색할 단어를 입력하세요 : ");
				br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();
				br = new BufferedReader(new FileReader("dictionary.txt"));

				while ((line = br.readLine()) != null) {
					flag = false;
					token = line.split("/");

					if (token[0].equalsIgnoreCase(str)) {
						System.out.println("입력한 단어의 뜻은 " + token[1] + "입니다.");
						flag = true;
						break;
					}
				}

				if (!flag) {
					System.out.println("찾는 단어 없음");
				}
				System.out.println();
				break;

			case 3:
				System.out.println("프로그램 종료합니다.");
				br.close(); //종료 //br은 case1에서 끝남
				System.exit(0);
			}
		}
	}
}
