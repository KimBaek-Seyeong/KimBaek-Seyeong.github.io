class Person2{
	private String name;
	private int age;
	double height;
	
	//setter 메서드
	void setName(String n) {
		name=n;
	}
	void setAge(int a) {
		if(a>0)	age=a;
	}
	//getter 메서드
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
}
/*
 접근 제어자(접근 지정자)
 private
 X:default
 protected
 public
 */
public class Ex05_13_setter_getter {

	public static void main(String[] args) {
		
		Person2 per = new Person2();
		//per.name = "바나나";
		per.setName("바나나");
		//per.age = 25;
		per.setAge(25);
		per.height = 165;
		//System.out.println(per.name);
		System.out.println(per.getName());
		//System.out.println(per.age);
		System.out.println(per.getAge());
		System.out.println(per.height);
		System.out.println();
		
		Person2 per2 = new Person2();
		//per2.name = "구아바";
		per2.setName("바나나");
		//per2.age = 30;
		per2.setAge(25);
		per2.height = 170;
		//System.out.println(per2.name);
		System.out.println(per2.getName());
		//System.out.println(per2.age);
		System.out.println(per2.getAge());
		System.out.println(per2.height);
		System.out.println();
		
	}
}
