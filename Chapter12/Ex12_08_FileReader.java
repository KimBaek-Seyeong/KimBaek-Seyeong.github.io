import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex12_08_FileReader {
	public static void main(String[] args) {
		FileWriter fw = null;
		FileReader fr = null;
		
		try {
			fw = new FileWriter("write.txt"); //BufferedWriter
			fw.write("��ſ줤 �Ϸ�...");
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

//Stream : 1����Ʈ �о����
//Reader : 2����Ʈ �о����
