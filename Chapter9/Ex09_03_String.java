public class Ex09_03_String {
	public static void main(String[] args) {

		String s1 = "nice day";
		String s2 = "nice dAy";
		
		String s3 = new String("nice day");
		String s4 = new String("nice day");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
		int len = s1.length();
		System.out.println("len:" + len);
		
		boolean bool = s1.equals(s2);
		System.out.println("bool:" + bool);
		bool = s3.equals(s4);
		System.out.println("bool:" + bool);
		
		bool = s1.equalsIgnoreCase(s2);
		System.out.println("bool:" + bool);
		
		System.out.println();
		int result = s1.compareTo(s2);
		System.out.println("result:" + result);
//		== : 0
//		> : 양수
//		< : 음수
		
		result = s1.compareToIgnoreCase(s2);
		System.out.println("result2:" + result);
		System.out.println();
		
//		char c = s1.charAt(3);
		System.out.println(s1.charAt(3));//nice day
//		System.out.println(s1.charAt(13)); // error
		
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.indexOf("day"));
		System.out.println(s1.indexOf("hahaha")); // -1
		
		System.out.println();
		//String sss = s1.substring(2,6);
		
		System.out.println(s1.substring(2,6));
		System.out.println(s1.substring(2));
		System.out.println();
		
		System.out.println(s1.replace('c', 'k'));
		System.out.println(s1);
		System.out.println(s1.toString());
		
		System.out.println();
		
		//boolean b = s1.contains("ce");
		System.out.println(s1.contains("ce"));
		System.out.println(s1.contains("xe"));
		System.out.println();
		
		String s5 = "  abc DE  Fg h ";
		System.out.println("s5:"+s5);
		System.out.println(s5.length());
		
		String s6 = s5.trim();
		System.out.println("s6:"+s6);
		System.out.println(s6.length());
		
		System.out.println();
		System.out.println(s5.toLowerCase());
		System.out.println(s5.toUpperCase());
		
		
		String fullName = "Hello.java" ; // a.txt
		
		String fileName;//Hello, a
		String ext; // java, txt
		
		int pos = fullName.indexOf(".");
		System.out.println("pos:"+pos);
		
		fileName = fullName.substring(0, pos);
		ext = fullName.substring(pos+1);
		
		System.out.println("fileName:" + fileName);//Hello, a
		System.out.println("ext:" + ext);//java, txt
		
//		.의위치:5, 1
//		일부:
		
		
		
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}








