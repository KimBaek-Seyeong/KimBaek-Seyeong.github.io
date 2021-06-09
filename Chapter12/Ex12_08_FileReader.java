import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex12_08_FileReader {
	public static void main(String[] args) {
		FileWriter fw = null;
		FileReader fr = null;
		
		try {
			fw = new FileWriter("write.txt"); //BufferedWriter
			fw.write("즐거우ㄴ 하루...");
			fw.close();
		
			fr = new FileReader("write.txt"); //BufferedReader
			int i;
			while((i=fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

//Stream : 1바이트 읽어오기
//Reader : 2바이트 읽어오기
