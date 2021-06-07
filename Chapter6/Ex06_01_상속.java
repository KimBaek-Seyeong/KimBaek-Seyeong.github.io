class Sports{
	String name;
	int person;
	void display() {
		System.out.println("이름 : "+name);
		System.out.println("인원 : "+this.person);
	}
}

class Baseball extends Sports{
	double ta;
	
	Baseball(){
		
	}
	Baseball(String name, int person, double ta){
		this.name = name;
		this.person = person;
		this.ta = ta;
	}
	
	void display() { //오버라이딩
		super.display();
		System.out.println("타율 : "+ta);
	}
}
class Football extends Sports{
	double goal;
	
	Football(){
		
	}
	Football(String name, int person, double goal){
		this.name = name;
		this.person = person;
		this.goal = goal;
	}
	
	void display() { //오버라이딩
		super.display();
		System.out.println("평균골 : "+goal);
	}
}


public class Ex06_01_상속{
	public static void main(String[] args) {
		Baseball b = new Baseball("야구", 9, 0.234);
		Football f = new Football("축구", 11, 2.5);
		
		b.display();
		System.out.println();
		f.display();
		
		System.out.println();
		
		Sports[] s = {new Baseball("야구", 9, 0.234), new Football("축구", 11, 2.5)};
		int i;
		for (i=0; i<s.length; i++) {
			s[i].display();
		}
	}
}
