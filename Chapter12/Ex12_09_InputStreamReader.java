import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex12_09_InputStreamReader {
	public static void main(String[] args) {
		System.out.println("�Է� : ");
//		Scanner sc = new Scanner(System.in);
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		//Ű����� �ѱ۵� �Է��� �� �ֵ��� �ϰ� ������ ������ �޾� �������� ó���ϰڴ�
		
		System.out.println();
		try {
			String str = br.readLine();
			System.out.println("str:"+str);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

//InputStreamReader : 1����Ʈ �Է��� 2����Ʈ �Է����� �ٲٰ� ���� �� ����ϴ� Ŭ����