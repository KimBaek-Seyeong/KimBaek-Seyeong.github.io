import java.io.File;

public class Ex12_02_File {
	public static void main(String[] args) {
		File f = new File("c:\\windows\\");
		System.out.println("f:"+f);
		
		boolean result = f.isDirectory();
		//���ǽ�?��:����
		String result1 = result ? "����" :"����";
		System.out.println("result1:"+result1);
		
		String result2 = f.isFile() ? "����" : "����";
		System.out.println("result2:"+result2);
		
		String[] lists = f.list();
		System.out.println(lists.length);
		
		for(int i=0;i<lists.length;i++) {
			File kind = new File(f,lists[i]);
			if(kind.isFile()) {
				System.out.println("����:"+lists[i]);
			}
			else {
				System.out.println("����:"+lists[i]);
			}
		}
	}
}





