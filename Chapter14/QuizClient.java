import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class QuizClient {
	public static void main(String[] args) throws IOException {

		PrintWriter pw = null;
		BufferedReader br = null;
		BufferedReader cinput = null;

		try {
			Socket cs = new Socket("localhost", 9999);

			pw = new PrintWriter(cs.getOutputStream(), true);

			br = new BufferedReader(new InputStreamReader(cs.getInputStream()));

			cinput = new BufferedReader(new InputStreamReader(System.in));

		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.exit(1);

		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}

		String fromServer, fromClient;

		while ((fromServer = br.readLine()) != null) {
			System.out.println("서버:" + fromServer);
			// 서버:퀴즈시작y/n
			if (fromServer.equals("quit")) {
				break;
			}

			fromClient = cinput.readLine(); // y입력,java.util,y
			System.out.println("클라이언트:" + fromClient);
			pw.println(fromClient); // 서버로 전송
		}
		// 프로그램 종료

		cinput.close();
		br.close();
		pw.close();

	}
}
