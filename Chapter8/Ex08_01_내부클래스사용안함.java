class CarName{
	String model;
	int year;
	
	CarName(){
		
	}
	CarName(String model, int year){
		this.model = model;
		this.year = year;
	}
	void display() {
		System.out.println(model + "," + year);
	}
}
class Car{
	CarName name;
	String color;
	
	Car(){
		
	}
	Car(String model, int year, String color){
		name.model = model;
		name.year = year;
		this.color = color;
	}
	void display() {
		System.out.println(name.model + ","+ name.year +","+color);
	}
}

public class Ex08_01_����Ŭ���������� {
	public static void main(String[] args) {
		CarName sonata = new CarName("�ҳ�Ÿ", 2021);
		Car pride = new Car("�����̵�", 2019, "�Ķ�");
		
		sonata.display();
		pride.display();
	}
}
