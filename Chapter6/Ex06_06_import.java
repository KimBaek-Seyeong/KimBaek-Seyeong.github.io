//import ��Ű��
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

//���������� : private < X:default < protected < public
//protected : ���� ��Ű��, �ٸ� ��Ű�� ��ӵ� Ŭ����
//final ������ : ��/�޼��带 �ٲٰ� ���� ������/�������̵� ���ϰ� �� �� ���