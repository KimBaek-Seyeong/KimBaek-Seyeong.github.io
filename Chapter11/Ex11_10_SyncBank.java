class Bank{
	private int money=10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public synchronized void saveMoney(int save) {
		int m = getMoney();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m+save);
//		money = money+save;
	}

	void minusMoney(int money) {
		synchronized(this) {
		//this.money = this.money-money;
			int m = getMoney();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setMoney(m-money);
		}
	}
}
class Park extends Thread{
	public void run() {
		
		Ex11_10_SyncBank.bk.saveMoney(3000);
		
		System.out.println("Park saveMoney(3000):" + 
						Ex11_10_SyncBank.bk.getMoney());
	}
}
class Kim extends Thread{
	public void run() {

		Ex11_10_SyncBank.bk.saveMoney(500);

		System.out.println("Kim saveMoney(500):" +Ex11_10_SyncBank.bk.getMoney());

		
		Ex11_10_SyncBank.bk.minusMoney(1000);
		System.out.println("Kim minusMoney(1000):"
						+ Ex11_10_SyncBank.bk.getMoney());

	}
}

public class Ex11_10_SyncBank {
	
	static Bank bk = new Bank(); // bk.money
	
	public static void main(String[] args) {
		System.out.println("¿ø±Ý:" +bk.getMoney());
		
		Park p = new Park();
		Kim k = new Kim();
		
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		k.start();
	}
}


