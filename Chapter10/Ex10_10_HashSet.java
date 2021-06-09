import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex10_10_HashSet {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("����");
		set.add("����");
		set.add("Ƽ�Ĵ�");
		set.add("����");
		
		System.out.println(set.size());
		System.out.println(set.toString());
//		System.out.println(set.get(1));
		
		System.out.println(set.contains("����"));
		System.out.println(set.contains("���"));
		
		boolean b = set.remove("����");
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
������ �ִ�.
�ߺ� ���O

Set=>HashSet
������ ����.
�ߺ� ���X
*/