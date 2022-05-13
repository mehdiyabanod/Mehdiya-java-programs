package p1;

interface MyInt {
	void m1();

	default void m2() {
		System.out.println("m2 method implementation");

	}

	static void m3() {
		System.out.println("m1 static method");
	}
}

class MyClass implements MyInt {
	public void m2() {
		System.out.println("m3 interface abstract method");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		ob.m1();
		ob.m2();
		MyInt.m3();

		
	}

}
