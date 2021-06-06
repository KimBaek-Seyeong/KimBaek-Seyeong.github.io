class Fruit{
	String name;
	private int price;
	private double weight;
	
	Fruit(){
		name = "딸기";
		price = 2000;
		weight = 4;
	}
	
	void setName(String name) {
		this.name = name;
	}
	void setPrice(int x) {
		price = x;
	}
	void setWeight(double x) {
		weight = x;
	}
	String getName() {
		return name;
	}
	int getPrice() {
		return price;
	}
	double getWeight() {
		return weight;
	}
}

public class Ex05_02_클래스 {

	public static void main(String[] args) {
		
		Fruit f = new Fruit();
		
		System.out.println(f.getWeight()+"kg "+f.getName()+" 한 개의 가격은 "+f.getPrice()+"원 입니다.");
		
		f.setName("사과");
		f.setPrice(1000);
		f.setWeight(0.5);
		
		Fruit f2 = new Fruit();
		f2.setName("바나나");
		f2.setPrice(5000);
 		f2.setWeight(1.5);
		
		System.out.println(f.getWeight()+"kg "+f.getName()+" 한 개의 가격은 "+f.getPrice()+"원 입니다.");
		System.out.println(f2.getWeight()+"kg "+f2.getName()+" 한 송이의 가격은 "+f2.getPrice()+"원 입니다.");
	}
}
