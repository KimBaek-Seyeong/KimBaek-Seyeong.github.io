import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex10_10_HashSet {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("수영");
		set.add("유리");
		set.add("티파니");
		set.add("수영");
		
		System.out.println(set.size());
		System.out.println(set.toString());
//		System.out.println(set.get(1));
		
		System.out.println(set.contains("유리"));
		System.out.println(set.contains("써니"));
		
		boolean b = set.remove("유리");
		System.out.println(set);
		System.out.println("b:"+b);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println("s:"+s);
		}
	}
}
/*
List=>ArrayList,Vector
순서가 있다.
중복 허용O

Set=>HashSet
순서가 없다.
중복 허용X
*/