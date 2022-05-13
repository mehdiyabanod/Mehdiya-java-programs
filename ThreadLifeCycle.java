//Life Cycle of thread 
package p1;

class MyClass extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " " + Thread.currentThread());

		}
	}
}

public class ThreadLifeCycle {

	public static void main(String[] args) throws InterruptedException {
MyClass ob=new MyClass();
MyClass ob1=new MyClass();
System.out.println("State of Thread ob"+ob.isAlive());//false
System.out.println("State of Thread ob1"+ob1.isAlive());//false
ob.start();
System.out.println("State of thread ob"+ob.isAlive());//true
ob.join();
System.out.println("State of thread ob"+ob.isAlive());//false
ob1.start();
System.out.println("State of thread ob1"+ob1.isAlive());//true

	
	}

}
