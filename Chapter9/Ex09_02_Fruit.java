class Fruit extends Object{
	private String name;
	private int price;
	
	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String toString(){  //출력식
		return name+","+price;
	}
	
	public boolean equals(Object obj) {//Object obj=f2
		Fruit f = (Fruit)obj;
		if(this.price==f.price)
			return true;
		else
			return false;
	}
}

public class Ex09_02_Fruit {
	public static void main(String[] args) {
		
		Fruit f1 = new Fruit("apple",300);
		Fruit f2 = new Fruit("grape",700);
		Fruit f3 = new Fruit("banana",300);
		
		System.out.println("f1:" + f1.toString()); // apple,300
		System.out.println("f2:" + f2);
		System.out.println("f3:" + f3);
		
		System.out.println(f1.equals(f2)); // 가격비교=>false
		System.out.println(f1.equals(f3)); // 가격비교=>true
	}
}
