import java.util.HashMap;
import java.util.Scanner;

public class Ex10_14_HashMap {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("pencil", "����");
		dic.put("sky", "�ϴ�");
		dic.put("desk", "å��");
		dic.put("face", "��");
		
		Scanner sc = new Scanner(System.in);
		String key;
		while(true) {
			System.out.print("ã�� �ܾ��? (q�Է½� ����) : ");
			key = sc.next();
			
			if(key.equals("q")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			if(dic.get(key) == null) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} else {
				System.out.println("�� : "+dic.get(key)+"\n");
			}
		}
	}
}
