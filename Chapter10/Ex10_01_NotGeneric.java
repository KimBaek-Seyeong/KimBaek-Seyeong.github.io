class Top{
	private String str;
	
	Top(){
		
	}
	Top(String str){
		this.str = str;
	}
	
	void setStr(Object str) {
		this.str = (String)str;
	}
	Object getStr() {
		return str;
	}
}

public class Ex10_01_NotGeneric {
	public static void main(String[] args) {
//		String str = "Hello";
		Integer str = new Integer(123);
		Top t = new Top();
		t.setStr(str);
		String result = (String)t.getStr();
		System.out.println(result);
		
	}
}
