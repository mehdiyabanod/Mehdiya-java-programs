package p1;

class Bank {
	static int amount = 10000;

	synchronized void deposit(int damt) {
		System.out.println("Deposit method");
		amount = amount + damt;
		System.out.println("amount after deposit=" + amount);
		System.out.println("deposit is completed");
		notify();

	}

	synchronized void withdraw(int wamt) throws InterruptedException {
		System.out.println("Withdraw method");
		if (wamt < amount) {
			wait();

		}
		amount = amount + wamt;
		System.out.println("amount after witdraw=" + amount);

	}
}

public class MainBank {

	public static void main(String[] args) {
		Bank ob = new Bank();
		new Thread() {
			public void run() {
				try {
					ob.withdraw(30000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}.start();

		new Thread() {
			public void run() {
				ob.deposit(20000);
			}
		}.start();

	}
}
