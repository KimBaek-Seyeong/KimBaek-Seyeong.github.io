class Car {
	String color = "white";
	int door = 4;

	void drive() {
		System.out.println("drive!");
	}

	void stop() {
		System.out.println("stop...");
	}
}

class FireEngine extends Car {
	int door = 6;
	int wheel = 10;

	void drive() { // �������̵�
		System.out.println("FEdrive!");
	}

	void water() {
		System.out.println("Watering");
	}
}

public class Ex06_08_������ {
	public static void main(String[] args) {
		
		Car car = new Car();
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		
		car = (Car)fe; //��ĳ����
		/*
		System.out.println(car.door);
//		System.out.println(car.wheel);
		System.out.println(car.color);
		
		System.out.println(fe.door);
		System.out.println(fe.wheel);
		System.out.println(fe.color);
		
		System.out.println();
		
		car.drive();
		car.stop();
		*/
		System.out.println();
		
		if(car instanceof FireEngine) { //���� instanceof Ŭ������ : �ش� ������ Ŭ���� Ÿ������ �ٲ� �� �ֳ�?
			System.out.println("��ȯ ����"); //��ĳ���� �̷��� �־�� �ٿ�ĳ���� �����ϴٰ� ����
			fe2 = (FireEngine)car; //�ٿ�ĳ����
		}else {
			System.out.println("��ȯ �Ұ���");
		}
		
		fe2.drive();
		fe2.stop();
			
	}
}
