package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedException2 {

	public static void main(String[] args) throws IOException {

		String name = "";
		int age = 0;
		float sal = 0.0f;
		InputStreamReader Is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(Is);
		System.out.println("Enter your name");
		name = br.readLine();
		System.out.println("Enter your age");
		age = Integer.parseInt(br.readLine());
		System.out.println("Enter your salary");
		sal = Float.parseFloat(br.readLine());
		
		System.out.println("Details of Employee");
		System.out.println("age=" + age);
		System.out.println("name=" + name);
		System.out.println("salary=" + sal);
	
	}

}
