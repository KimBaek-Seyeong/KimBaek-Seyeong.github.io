import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex10_12_HashMap {
	public static void main(String[] args) {

		HashMap<String,Integer> hm = new HashMap<String,Integer>(); // key,value
		System.out.println(hm.size());
		
		hm.put("진",89);
		hm.put("지민",35);
		hm.put("정국",78);
		hm.put("지민",92);
		hm.put("슈가",89);
		
		System.out.println(hm.size());
		System.out.println("hm:"+hm);
		
		System.out.println(hm.get("정국"));
		Integer jumsu = hm.get("정국"); // get(key)
		System.out.println(jumsu);
		
		System.out.println(hm.get("RM"));//null
		System.out.println(hm.get(78));//null
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력:");
		String name = sc.next();
		if(hm.get(name) != null) {
			System.out.println(name+"의 점수는 "+hm.get(name)+"점 입니다.");
		}
		else {
			System.out.println("등록되지 않은 이름입니다.");
		}
		
		System.out.println(hm.containsKey("슈가"));
		System.out.println(hm.containsKey("제이홉"));
		
		System.out.println(hm.containsValue("슈가"));
		System.out.println(hm.containsValue(92));
		
		Set<String> key = hm.keySet();
		System.out.println("key:"+key);
		
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.println(k+":"+hm.get(k));
		}
		
		hm.remove("슈가");
		System.out.println("hm: "+hm);
	}
}
/*
Map
key,value 쌍으로 구성
순서X
key:중복 허용X
value:중복 허용O
*/





