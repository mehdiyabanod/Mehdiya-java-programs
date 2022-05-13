package edu.com;

class MyThreadClass extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Thread run method"+Thread.currentThread());
	  }
   }
}

public class MyMainClass {

	public static void main(String[] args)throws InterruptedException {
		MyThreadClass ob=new MyThreadClass();
		MyThreadClass ob1=new MyThreadClass();
		System.out.println("main class"); 
ob.setName("First");
ob1.setName("Second");
pa.setpri


ob.start();
System.out.println(ob.isAlive());
ob.join();
System.out.println(ob.isAlive());
	ob1.start();
   }
}

	


