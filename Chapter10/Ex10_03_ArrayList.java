import java.util.ArrayList;
import java.util.Scanner;

public class Ex10_03_ArrayList { //중요!
	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<String>(); //동적배열 //컬렉션의 한 종류
		System.out.println(s.size());
		
		s.add("윤아");
		s.add("수영");
		s.add("효연");
		s.add("수영"); //중복 허용, 순서 있음
		
		System.out.println(s.size());
		System.out.println("s: "+s);
		System.out.println(s.get(1));
		
		s.add(2, "태연");
		System.out.println(s.get(2));
		System.out.println("s: "+s);
		
		ArrayList<String> revel = new ArrayList<String>();
		revel.add("웬디");
		revel.add("조이");
		System.out.println(revel);
		s.addAll(revel);
		System.out.println("s:"+s);
		System.out.println(s.size());
		
		s.remove(2);
		System.out.println("s:"+s);
//		s.remove("수영");
		ArrayList<String> remove = new ArrayList<String>();
		remove.add("수영");
		s.removeAll(remove);
		System.out.println("s:"+s);
		
		s.set(1, "써니");
		System.out.println("s:"+s);
		
		s.add(1, "수영");
		System.out.println("s:"+s);
		
		int pos = s.indexOf("수영");
		System.out.println(pos);
		
		int lastpos = s.lastIndexOf("수영");
		System.out.println(lastpos);
		
		boolean res = s.contains("수영");
		System.out.println(res);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		if (s.indexOf(name) != -1) {
			System.out.println("가입한 회원입니다.");
		}else {
			System.out.println("가입하지 않은 회원입니다.");
		}
		
		int count=0;
		for(int i=0; i<s.size(); i++) {
			if (s.get(i).equals(name)) count++;
		}
		if (count != 0) System.out.println("가입한 회원입니다.");
		else System.out.println("가입하지 않은 회원입니다.");
	}
}
