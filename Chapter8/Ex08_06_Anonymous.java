//미완성 메소드를 갖는 클래스 오류 잡기
//1. abstract
//2. interface로 변경

interface RemoteControl{
	//인터페이스 : 자동으로 final 변수로 설정됨
	void turnOn();
	void turnOff();
}
//private-x-protected-public

class Test3 implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다.");
	}
}
public class Ex08_06_Anonymous {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.turnOn();
		t3.turnOff();
		
		RemoteControl rc = new RemoteControl() {
			public void turnOn() {
				System.out.println("R TV를 켠다.");
			}
			public void turnOff() {
				System.out.println("R TV를 끈다.");
			}
		};
		
		rc.turnOn();
		rc.turnOn();
		rc.turnOn();
		rc.turnOff();
	}
}


