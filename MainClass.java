package edu.medh;
class MyThread extends Thread{
	public void run() {
		System.out.println("run method");
	}
}

public class MainClass {

	public static void main(String[] args) {
		MyThread ob=new MyThread();
		ob.start();
	}

}
