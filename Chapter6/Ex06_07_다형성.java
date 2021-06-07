class Animal{
	public void bark() {
		System.out.println("bark bark");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("�۸�");
	}
}

public class Ex06_07_������ {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.bark();
		
		Dog d = new Dog();
		d.bark();
		
		//��ĳ���� : �ڽ� -> �θ�Ÿ��. �ڵ����� �̷���� (Animal) ���� ����
		//�ڽ��� �θ�Ÿ���� ���������� �ִ� ��
		Animal a2 = new Dog(); //Animal a2 = (Animal)new Dog();
		a2.bark();
		
		//�ٿ�ĳ���� : �θ�Ÿ�� -> �ڽ�Ÿ��.
		Dog d2 = (Dog) new Animal(); //Dog ���� �Ұ� -> Animal�� �θ� Ŭ�����̱� ������ �� ū ����
		d2.bark();
	}
}

/*
 ������ : ���� �ڷ����� ���� ��ü�� ������ �پ��� ����� ���� ����
 Ŭ������ ����̳� �������̽��� �����ϴ� �ڽ� Ŭ�������� �޼��带 ������(�������̵�) �ϰ� �ڽ� Ŭ������ �θ� Ÿ������ ��ĳ�����Ѵ�.
 �׸��� �θ� Ÿ���� ��ü���� �ڽ� ����� �����Ͽ� �������� �����Ѵ�.
 �ϳ��� ���� ������ ���� ���� ��� ����
 */
