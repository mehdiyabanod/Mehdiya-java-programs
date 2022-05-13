package p1;

import java.lang.reflect.Constructor;
import java.util.Scanner;



class SoftwareEmployee {
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter age");
		int age = sc.nextInt();

	}

	void display() {
		String name ="";
		System.out.println("name=" + name);
		int age = 0;
		System.out.println("age=" + age);
	}
}

public class MainClass {

	public static void main(String[] args) {
		SoftwareEmployee ob = new SoftwareEmployee();
		ob.input();
		ob.display();

	}

}
