abstract class Employee2{
	private String empno;
	private String name;
	private int pay;
	
	Employee2(){
		
	}
	Employee2(String empno, String name, int pay){
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	String getEmpno() {
		return empno;
	}
	String getName() {
		return name;
	}
	int getPay() {
		return pay;
	}
	
	abstract double getMonthPay(); // 미완성
	abstract void display();
}
class FullTime extends Employee2{
	private int bonus;
	
	FullTime(){
		
	}
	FullTime(String empno, String name, int pay, int bonus){
		super(empno, name, pay);
		this.bonus = bonus;
	}
	
	double getMonthPay(){
		return getPay()/12 + bonus/12;
	}
	void display() {
		System.out.println(getEmpno()+","+getName()+","+getPay()+","+bonus);
	}
}
class Contract extends Employee2{
	private int hireYear;
	
	Contract(){
		
	}
	Contract(String empno, String name, int pay, int hireYear){
		super(empno, name, pay);
		this.hireYear = hireYear;
	}
	
	double getMonthPay(){
		return getPay()/12*hireYear;
	}
	void display() {
		System.out.println(getEmpno()+","+getName()+","+getPay()+","+hireYear);
	}
}
class PartTime extends Employee2{
	private int workDay;
	
	PartTime(){
		
	}
	PartTime(String empno, String name, int pay, int workDay){
		super(empno, name, pay);
		this.workDay = workDay;
	}
	
	double getMonthPay(){
		return getPay()*workDay;
	}
	void display() {
		System.out.println(getEmpno()+","+getName()+","+getPay()+","+workDay);
	}
}

public class Ex06_11_김세영 {
	public static void main(String[] args) {

		FullTime f = new FullTime("f01","웬디",3000,50);
		Contract c = new Contract("c02","슬기",2000,3);
		PartTime p = new PartTime("p03","조이",7000,25);
		
		f.display();
		System.out.println(f.getMonthPay());
		c.display();
		System.out.println(c.getMonthPay());
		p.display();
		System.out.println(p.getMonthPay());

		System.out.println();
		
		Employee2[] e = {new FullTime("f01","웬디",3000,50),
				new Contract("c02","슬기",2000,3),
				new PartTime("p03","조이",7000,25)};
		int i;
		for(i=0; i<e.length; i++) {
			e[i].display();
			System.out.println(e[i].getMonthPay());
		}
	}
	
}