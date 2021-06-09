import java.io.File;

public class Ex12_01_File {
	public static void main(String[] args) {

		String a = File.pathSeparator;
		char b = File.pathSeparatorChar;
		String c = File.separator;
		char d = File.separatorChar;
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		
//		c:\sun\abc.txt
		File f1 = new File("C:\\Users\\coms\\Desktop");
		
		File f2 = new File("C:\\Users\\coms", "Desktop");
		
		File dir = new File("c:\\Users");
		File f3 = new File(dir, "test1.txt");
		
		File f4 = new File("C:\\Users\\coms\\Desktop\\test1.txt");
		
		System.out.println(f1.length());
		System.out.println(f2.length());
		System.out.println(f3.length());
		System.out.println(f4.length());
		
	}
}




