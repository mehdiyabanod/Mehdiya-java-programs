package edu.com;

class Hello extends Thread{
	public void run() {
		System.out.println("Hello display"+Thread.currentThread());
	}
}
public class MainThreadClass {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Hello ob=new Hello();
		Hello ob1=new Hello();
		ob.start();
		ob1.start();
	}

}
