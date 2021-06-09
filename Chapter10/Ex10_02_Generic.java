class Top2<T>{
	private T str;
	
	void setStr(T str) {
		this.str = str;
	}
	T getStr() {
		return str;
	}
}

public class Ex10_02_Generic {
	public static void main(String[] args) {
		String str = "Hello";
		
		Top2<String> t = new Top2<String>();
		t.setStr(str);
		String result = t.getStr();
		System.out.println(result);
		
		Integer it = new Integer(123);
		Top2<Integer> t2 = new Top2<Integer>(); 
		t2.setStr(it);
	}
}
