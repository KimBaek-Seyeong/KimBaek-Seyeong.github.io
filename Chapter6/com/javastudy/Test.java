package com.javastudy;

public class Test {

	public static void main(String[] args) {
		
		//같은 클래스에 없어도 한 패키지에 있으면 다른 파일 클래스의 객체 생성 가능
		Car c = new Car(60, 35);
		c.prnCar();
	}
}
