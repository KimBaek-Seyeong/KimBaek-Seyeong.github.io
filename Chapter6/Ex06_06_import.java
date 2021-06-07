//import 패키지
import java.util.Date;

import com.javastudy.Car;

//default package
public class Ex06_06_import {
	public static void main(String[] args) {
		Car c = new Car(60, 35);
		c.prnCar();
		
		Date d = new Date(); //java.util.Date d = new java.util.Date();
		System.out.println("d : "+d);
	}
}

//접근제어자 : private < X:default < protected < public
//protected : 같은 패키지, 다른 패키지 상속된 클래스
//final 제어자 : 값/메서드를 바꾸고 싶지 않을때/오버라이딩 못하게 할 때 사용