class Fruit{
	String name;
	private int price;
	private double weight;
	
	Fruit(){
		name = "����";
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

public class Ex05_02_Ŭ���� {

	public static void main(String[] args) {
		
		Fruit f = new Fruit();
		
		System.out.println(f.getWeight()+"kg "+f.getName()+" �� ���� ������ "+f.getPrice()+"�� �Դϴ�.");
		
		f.setName("���");
		f.setPrice(1000);
		f.setWeight(0.5);
		
		Fruit f2 = new Fruit();
		f2.setName("�ٳ���");
		f2.setPrice(5000);
 		f2.setWeight(1.5);
		
		System.out.println(f.getWeight()+"kg "+f.getName()+" �� ���� ������ "+f.getPrice()+"�� �Դϴ�.");
		System.out.println(f2.getWeight()+"kg "+f2.getName()+" �� ������ ������ "+f2.getPrice()+"�� �Դϴ�.");
	}
}
