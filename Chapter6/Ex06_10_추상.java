//abstract CLASSNAME{} : 추상클래스
abstract class Shape{
	Shape(){
		System.out.println("Shape 생성자");
	}
	abstract void draw(); //미완성 메소드, 추상 메소드
	abstract void delete(); //클래스 안에 반드시 작성해야 하는 메소드가 있다면 활용
}
class Circle extends Shape{
	Circle(){
		System.out.println("Circle 생성자");
	}
//	void draw() {
//		System.out.println("원을 그리다");
//	}
//	void delete() {
//		System.out.println("원을 지우다");
//	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그리다");
	}
	@Override
	void delete() {
		// TODO Auto-generated method stub
		System.out.println("원을 지우다");
	}
}
class Rectangle extends Shape{
	Rectangle(){
		System.out.println("Rectangle 생성자");
	}
	void draw() {
		System.out.println("사각형을 그리다");
	}
	void delete() {
		System.out.println("사각형을 지우다");
	}
}

public class Ex06_10_추상 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		c.delete();
		
		System.out.println();
		
		Rectangle r = new Rectangle();
		r.draw();
		r.delete();
		
		System.out.println();
		
		Shape[] s = {new Circle(), new Rectangle()};
		int i;
		for(i=0; i<s.length; i++) {
			s[i].draw();
			s[i].delete();
		}
	}
}
