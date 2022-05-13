package p1;

import java.util.Scanner;

public class UserInputScanner2 {
	public static void main(String[] args) {
		String name;
		int age;
		float sal;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age");
		age = sc.nextInt();
		System.out.println("Enter the name");
		name = sc.next();
		System.out.println("Enter the salary");
		sal = sc.nextFloat();
		System.out.println("age=" + age);
		System.out.println("name=" + name);
		System.out.println("salary=" + sal);
		sc.close();
	}

}
