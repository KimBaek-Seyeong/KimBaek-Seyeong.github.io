import java.io.File;
import java.io.IOException;

public class Ex12_03_File {
	public static void main(String[] args) {

		File f1 = new File("A"); // C:\\Java_ysy\\12_화일입출력\\A
		File f2 = new File("B");
		File f3 = new File("C");
		File f4 = new File(f1,"aa.txt"); // A\\aa.txt

		boolean b = f1.exists();
		System.out.println("b:"+b);

		if(f1.exists()) {
			f1.renameTo(f2);
		}
		else {
			f1.mkdir();
			System.out.println("폴더생성함");
			try {
				f4.createNewFile();
				System.out.println("화일 생성함");
				
			}catch(IOException e) {

			}
		}//
		
		if(f3.exists()) {
			boolean b2 = f3.delete();
			System.out.println("b2"+b2);
			System.out.println("삭제 완료");
		}
		
	}//main
}