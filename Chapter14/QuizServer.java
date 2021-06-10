import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuizServer {
	public static void main(String[] args) throws IOException {

		ServerSocket ss = null;
		Socket cs = null;
		PrintWriter pw = null;
		BufferedReader br = null;

		try {
			ss = new ServerSocket(9999);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}

		System.out.println("Server ready..");
		try {
			cs = ss.accept();
			System.out.println("ø¨∞·µ ");

		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}

		try {
			pw = new PrintWriter(cs.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(cs.getInputStream()));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String coutput, fromClient, pbm;
		QuizBank bank = new QuizBank();
		coutput = bank.process(null); // ƒ˚¡ÓΩ√¿€y/n
		pw.println(coutput); // ƒ˚¡ÓΩ√¿€y/n

		while ((fromClient = br.readLine()) != null) {
			// fromClient:y,java.util
			pbm = bank.process(fromClient);
			pw.println(pbm);
			if (pbm.equals("quit"))
				break;
		}

		br.close();
		pw.close();

	}// main
}
