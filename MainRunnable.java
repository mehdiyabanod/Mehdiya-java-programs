package edu.com;

class MyThread1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside Run method "+Thread.currentThread());
		
		
	}

}

public class MainRunnable {

	public static void main(String[] args) {
		MyThread1 ob = new MyThread1();
		Thread tob = new Thread(ob);
		tob.setName("my first Thread");
		tob.start();
		MyThread1 ob1 = new MyThread1();
		Thread tob1 = new Thread(ob1);
		tob1.setName("My second thread");
		tob1.start();
		MyThread1 ob2 = new MyThread1();
		Thread tob2 = new Thread(ob2);
		tob2.setName("My third thread");
		tob2.start();
	}

}
