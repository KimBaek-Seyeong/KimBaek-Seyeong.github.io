package com.javastudy; //중요!

public class Car {

	private int speed;
	private int direction;
	
	public Car(){
		
	}
	
	public Car(int speed, int direction){
		this.speed = speed;
		this.direction = direction;
	}
	
	public void prnCar() {
		System.out.println("속도 : "+speed);
		System.out.println("방향 : "+direction);
	}
}
