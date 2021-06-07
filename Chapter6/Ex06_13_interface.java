interface Camera{
	void takePhoto();
}
interface MP3{
	void playMP3();
}
interface DMB{
	void viewTv();
}
class Shape2{
	private int size;
	private String color;
	Shape2(){
		
	}
	Shape2(int size, String color){
		this.size = size;
		this.color = color;
	}
	int getSize() {
		return size;
	}
	String getColor() {
		return color;
	}
}
class Phone extends Shape2 implements Camera, MP3, DMB{
	Phone(){
		
	}
	Phone(int size, String color){
		super(size, color);
	}
	@Override
	public void viewTv() {
		// TODO Auto-generated method stub
		System.out.println("TV시청");
	}

	@Override
	public void playMP3() {
		// TODO Auto-generated method stub
		System.out.println("음악감상");
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("사진촬영");
	}
	
}

public class Ex06_13_interface {
	public static void main(String[] args) {
		Phone p = new Phone(7, "blue");
		System.out.println(p.getSize());
		System.out.println(p.getColor());
		
		p.viewTv();
		p.playMP3();
		p.takePhoto();
	}
}

//final 클래스 : 상속 받을 수는 있지만 상속해 줄 수는 없음

//접근 제어자
//private : 자기 클래스에서만 접근 가능(정보 은닉)
//default : 동일 패키지 내에서만 객체 생성 가능
//protected : 상속 받은 클래스에서 접근 가능
//public : 다른 패키지에서 객체 생성 가능

//추상메서드 : 상속받은 클래스에 기능 구현을 강제하기 위해 사용되는 미완성 메소드, abstract

//추상클래스, 인터페이스
//공통점 : 추상메서드가 있을 수 있다
//차이점 : 추상클래스는 완성된 메서드 있어도 되는데, 인터페이스는 있으면 안된다
//특징 : 다중 상속 불가능, 다중 상속 가능
/*
1. 공통점 
abstract class(추상 클래스)와 interface 는 선언만 있고 구현 내용이 없는 클래스이다.
그래서 자기 자신이 new를 해서 객체를 생성할 수 없으며, 추상클래스를 extends 받거나, interface를 implements 한 자식만이 객체를 생성할 수 있다.
상속받은 자식이 구현을 반드시 하도록 해야할 때 사용한다. JAVA에서는 type이 지정되있기 때문에 선언된 type과 자식의 type이 같아야만 한다.

2. 차이점
추상클래스는 말그대로 클래스이고, interface는 구현하기 전에 메소드에 대해 명세된 것이랄까?
그래서 상속을 받음에도 불구하고 클래스에선 상속이라고 쓰지만 interface는 implemets(구현) 이라고 쓴다.
추상클래스의 정의는 abstract 메소드가 하나라도 존재하는 클래스를 일컫는다. 때문에 일부는 구현된 메소드도 있고, abstract라고 붙어있는 메소드는 구현이 안되어있다.
추상클래스를 상속받는 클래스는 반드시 추상메소드를 구현해야한다. 그래서 필수적으로 구현해야할 메소드가 있을 때 추상클래스를 쓰게된다.
인터페이스는 구현체 없이, 메소드에 대한 명세만 되어있다. 인터페이스를 상속받는 클래스에서는 반드시 인터페이스에 있는 메소드를 다 구현해야한다.
자바는 단일상속을 지원하기 때문에 추상클래스는 단일상속이지만, interface를 사용하게 되면, implements를 구현하는 부분에서 extends 또한 사용할 수 있다. 즉, 다중상속이 가능해진다.
'이러이러한 메소드를 쓸 것이다.' 인터페이스에 선언을 해놓고, 가져다가 반드시 선언된 그대로 모두 구현하면 되는게 인터페이스이고, 이러이러한 메소드가 있지만 가져다 쓰거나 오버라이드 하거나, abstract가 붙은 메소드는 반드시 구현하면 되는게 abstract class이다.

3. 용도
인터페이스를 설명하려면 다형성(Polymorphism)에 대한 개념이 등장한다.
인터페이스는 다형성이라 생각하면되고, 상속은 부모 - 자식 관계..
부모가 갖고있는 기능을 유전 받으면서, 기능을 더 추가한다거나, 부모의 유전된 기능을 약간 수정할 때 쓴다.
*/