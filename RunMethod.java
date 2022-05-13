package edu.com;

import edu.com.MyThread;

class MyThread extends Thread{
	public void run() {
		System.out.println("run method");
	}
}

public class RunMethod {

	public static void main(String[] args) {
		MyThread ob=new MyThread();
		ob.start();
	}

}

