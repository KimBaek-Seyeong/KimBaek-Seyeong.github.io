class Animal{
	public void bark() {
		System.out.println("bark bark");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("멍멍");
	}
}

public class Ex06_07_다형성 {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.bark();
		
		Dog d = new Dog();
		d.bark();
		
		//업캐스팅 : 자식 -> 부모타입. 자동으로 이루어져 (Animal) 생략 가능
		//자식을 부모타입의 참조변수에 넣는 것
		Animal a2 = new Dog(); //Animal a2 = (Animal)new Dog();
		a2.bark();
		
		//다운캐스팅 : 부모타입 -> 자식타입.
		Dog d2 = (Dog) new Animal(); //Dog 생략 불가 -> Animal이 부모 클래스이기 때문에 더 큰 개념
		d2.bark();
	}
}

/*
 다형성 : 같은 자료형에 여러 객체를 대입해 다양한 결과를 얻어내는 성질
 클래스의 상속이나 인터페이스를 구현하는 자식 클래스에서 메서드를 재정의(오버라이딩) 하고 자식 클래스를 부모 타입으로 업캐스팅한다.
 그리고 부모 타입의 객체에서 자식 멤버를 참조하여 다형성을 구현한다.
 하나의 참조 변수로 여러 값을 얻는 성질
 */
