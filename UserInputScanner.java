package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputScanner {
	public static void main(String[] args) throws  IOException {
		String name;
		int age;
		float salary;
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		InputStreamReader Is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(Is);
		
		
		
		System.out.println("Enter the age");
		age=Integer.parseInt(br.readLine());
		System.out.println("Enter the name");
		name=br.readLine();
		System.out.println("Enter the salary");
		salary=Float.parseFloat(br.readLine());
		
		
System.out.println("age="+age);
System.out.println("name="+name);
System.out.println("salary="+salary);

	}

}
