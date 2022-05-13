package p1;

import java.util.Scanner;

public class CheckedException {

	public static void main(String[] args) {
		String name;
		int age;
		float salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		age = sc.nextInt();
		System.out.println("Enter the name");
		sc.nextLine();
		
		name = sc.nextLine();
		System.out.println("Enter the salary");
		salary = sc.nextFloat();
System.out.println("age="+age);
System.out.println("name="+name);
System.out.println("salary="+salary);
sc.close();
	}

}
