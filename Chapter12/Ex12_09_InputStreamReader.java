import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex12_09_InputStreamReader {
	public static void main(String[] args) {
		System.out.println("입력 : ");
//		Scanner sc = new Scanner(System.in);
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		//키보드로 한글도 입력할 수 있도록 하고 버퍼의 도움을 받아 빨리빨리 처리하겠다
		
		System.out.println();
		try {
			String str = br.readLine();
			System.out.println("str:"+str);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

//InputStreamReader : 1바이트 입력을 2바이트 입력으로 바꾸고 싶을 때 사용하는 클래스