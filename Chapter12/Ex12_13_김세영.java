import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

//���� �߸� ������ �Է� �޾Ƽ� Ȯ���ϴ� �� �ƴ϶�
//��ü �ܾ�:�ܾ� �� ��
public class Ex12_13_�輼�� {
	public static void main(String[] args) {
		System.out.println("�Է� �ܾ� �� �� Ȯ�� ���α׷��� �����մϴ�.");

		FileReader fr = null;
		BufferedReader br = null;

		// �˻��� �ܾ� �Է� : �ֿܼ���
		Scanner sc = new Scanner(System.in);
		String word, answer; // �˻��� �ܾ�, ������� ���� ���� ����
		String str = ""; // ���� �� �� �б�
		String[] token = null; // �ܾ� �ֱ�
		int count = 0; // �Է��� �ܾ� �� üũ ����

		try {
			// lyrics.txt ���� �б� //IOException try~catch
			fr = new FileReader("lyrics.txt");
			br = new BufferedReader(fr);

			while (true) {
				System.out.print("�ܾ� �Է� : ");
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
					System.out.println(word + "�� " + count + "�� �����մϴ�.");
				} else {
					System.out.println("ã�� �ܾ �����ϴ�.");
				}

				while (true) {
					System.out.print("��� �Ͻðڽ��ϱ�? ");
					answer = sc.next();
					System.out.println();

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
