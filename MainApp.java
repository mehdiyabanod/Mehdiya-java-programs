package p1;

import java.util.Scanner;

class parent{
	private int sal;
	public String name;
	protected int age;
	int accno;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary");
		sal=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter accno");
		accno=sc.nextInt();
		System.out.println("age="+age);
	}
void printsal() {
	System.out.println("salary="+sal);
}
}
class Child extends parent{
	void display() {
		
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("accno="+accno);
		
	}
}
public class MainApp {

	public static void main(String[] args) {
		Child ob=new Child();
		ob.input();
		ob.display();
		ob.printsal();
	}

}
