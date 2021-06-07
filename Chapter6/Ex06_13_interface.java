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
		System.out.println("TV��û");
	}

	@Override
	public void playMP3() {
		// TODO Auto-generated method stub
		System.out.println("���ǰ���");
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("�����Կ�");
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

//final Ŭ���� : ��� ���� ���� ������ ����� �� ���� ����

//���� ������
//private : �ڱ� Ŭ���������� ���� ����(���� ����)
//default : ���� ��Ű�� �������� ��ü ���� ����
//protected : ��� ���� Ŭ�������� ���� ����
//public : �ٸ� ��Ű������ ��ü ���� ����

//�߻�޼��� : ��ӹ��� Ŭ������ ��� ������ �����ϱ� ���� ���Ǵ� �̿ϼ� �޼ҵ�, abstract

//�߻�Ŭ����, �������̽�
//������ : �߻�޼��尡 ���� �� �ִ�
//������ : �߻�Ŭ������ �ϼ��� �޼��� �־ �Ǵµ�, �������̽��� ������ �ȵȴ�
//Ư¡ : ���� ��� �Ұ���, ���� ��� ����
/*
1. ������ 
abstract class(�߻� Ŭ����)�� interface �� ���� �ְ� ���� ������ ���� Ŭ�����̴�.
�׷��� �ڱ� �ڽ��� new�� �ؼ� ��ü�� ������ �� ������, �߻�Ŭ������ extends �ްų�, interface�� implements �� �ڽĸ��� ��ü�� ������ �� �ִ�.
��ӹ��� �ڽ��� ������ �ݵ�� �ϵ��� �ؾ��� �� ����Ѵ�. JAVA������ type�� �������ֱ� ������ ����� type�� �ڽ��� type�� ���ƾ߸� �Ѵ�.

2. ������
�߻�Ŭ������ ���״�� Ŭ�����̰�, interface�� �����ϱ� ���� �޼ҵ忡 ���� ���� ���̶���?
�׷��� ����� �������� �ұ��ϰ� Ŭ�������� ����̶�� ������ interface�� implemets(����) �̶�� ����.
�߻�Ŭ������ ���Ǵ� abstract �޼ҵ尡 �ϳ��� �����ϴ� Ŭ������ ���´´�. ������ �Ϻδ� ������ �޼ҵ嵵 �ְ�, abstract��� �پ��ִ� �޼ҵ�� ������ �ȵǾ��ִ�.
�߻�Ŭ������ ��ӹ޴� Ŭ������ �ݵ�� �߻�޼ҵ带 �����ؾ��Ѵ�. �׷��� �ʼ������� �����ؾ��� �޼ҵ尡 ���� �� �߻�Ŭ������ ���Եȴ�.
�������̽��� ����ü ����, �޼ҵ忡 ���� ���� �Ǿ��ִ�. �������̽��� ��ӹ޴� Ŭ���������� �ݵ�� �������̽��� �ִ� �޼ҵ带 �� �����ؾ��Ѵ�.
�ڹٴ� ���ϻ���� �����ϱ� ������ �߻�Ŭ������ ���ϻ��������, interface�� ����ϰ� �Ǹ�, implements�� �����ϴ� �κп��� extends ���� ����� �� �ִ�. ��, ���߻���� ����������.
'�̷��̷��� �޼ҵ带 �� ���̴�.' �������̽��� ������ �س���, �����ٰ� �ݵ�� ����� �״�� ��� �����ϸ� �Ǵ°� �������̽��̰�, �̷��̷��� �޼ҵ尡 ������ ������ ���ų� �������̵� �ϰų�, abstract�� ���� �޼ҵ�� �ݵ�� �����ϸ� �Ǵ°� abstract class�̴�.

3. �뵵
�������̽��� �����Ϸ��� ������(Polymorphism)�� ���� ������ �����Ѵ�.
�������̽��� �������̶� �����ϸ�ǰ�, ����� �θ� - �ڽ� ����..
�θ� �����ִ� ����� ���� �����鼭, ����� �� �߰��Ѵٰų�, �θ��� ������ ����� �ణ ������ �� ����.
*/