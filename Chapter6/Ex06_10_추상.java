//abstract CLASSNAME{} : �߻�Ŭ����
abstract class Shape{
	Shape(){
		System.out.println("Shape ������");
	}
	abstract void draw(); //�̿ϼ� �޼ҵ�, �߻� �޼ҵ�
	abstract void delete(); //Ŭ���� �ȿ� �ݵ�� �ۼ��ؾ� �ϴ� �޼ҵ尡 �ִٸ� Ȱ��
}
class Circle extends Shape{
	Circle(){
		System.out.println("Circle ������");
	}
//	void draw() {
//		System.out.println("���� �׸���");
//	}
//	void delete() {
//		System.out.println("���� �����");
//	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("���� �׸���");
	}
	@Override
	void delete() {
		// TODO Auto-generated method stub
		System.out.println("���� �����");
	}
}
class Rectangle extends Shape{
	Rectangle(){
		System.out.println("Rectangle ������");
	}
	void draw() {
		System.out.println("�簢���� �׸���");
	}
	void delete() {
		System.out.println("�簢���� �����");
	}
}

public class Ex06_10_�߻� {
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
