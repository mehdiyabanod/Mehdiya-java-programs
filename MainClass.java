package p2.parent;

class parent {
	private int sal;

	public parent() {
		System.out.println("parent class constructor");
	}

	public parent(int sal) {
		this.sal = sal;
		System.out.println("salary=" + sal);
	}
}

class Child extends parent {
	public Child() {
		System.out.println("Child class costructor");
	}

	public Child(int sal) {
		super(sal);
		System.out.println("Other statements");
	}
}

public class MainClass {

	public static void main(String[] args) {
		parent ob=new parent();
Child ob1=new Child();
Child ob2=new Child(456);

	}

}
