package p1;

import java.util.Scanner;

public class Employee{
	String name;
	int id;
	float salary;
	

	
	void Input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of an employee");
		name=sc.nextLine();
		System.out.println("Enter the id of an employee");
		id=sc.nextInt();
		System.out.println("Enter the salary of an employee");
		salary=sc.nextFloat();
		
		
		}
	void Display() {
		System.out.println("Name="+name);
		System.out.println("id="+id);
		System.out.println("salary="+salary);
		
		
		}
	public static void main(String[] args) {
		Employee ob=new Employee();
		ob.Input();
		ob.Display();
		System.out.println(ob);
			
		}
	}


