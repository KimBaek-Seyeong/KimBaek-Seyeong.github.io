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

	void drive() { // 오버라이딩
		System.out.println("FEdrive!");
	}

	void water() {
		System.out.println("Watering");
	}
}

public class Ex06_08_다형성 {
	public static void main(String[] args) {
		
		Car car = new Car();
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		
		car = (Car)fe; //업캐스팅
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
		
		if(car instanceof FireEngine) { //변수 instanceof 클래스명 : 해당 변수를 클래스 타입으로 바꿀 수 있냐?
			System.out.println("변환 가능"); //업캐스팅 이력이 있어야 다운캐스팅 가능하다고 나옴
			fe2 = (FireEngine)car; //다운캐스팅
		}else {
			System.out.println("변환 불가능");
		}
		
		fe2.drive();
		fe2.stop();
			
	}
}
