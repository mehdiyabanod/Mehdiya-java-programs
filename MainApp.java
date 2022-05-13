package com.edu.student;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// Menu from user
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Database Operations");
			System.out.println("Enter your choice");
			System.out.println("1. To display student information");
			System.out.println("2. Insert student record");
			System.out.println("3. update student information based on id");
			System.out.println("4. delete student information based on id");
			System.out.println("5. select student based on ID");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				StudentDataOperations.displayStudentInfo();
				break;
			case 2:
				StudentDataOperations.insertStudentInfo();
				break;

			case 3:
				StudentDataOperations.updateStudentInfo();
				break;
			case 4:
				StudentDataOperations.deleteStudentInfo();
				break;
			case 5:
				StudentDataOperations.selectStudentInfo();
				break;
			default:System.out.println("Invalid choice");
			
			}//switch
			System.out.println("Do you want to continue yes/no");
			String choice=sc.next();
			if(choice.equalsIgnoreCase("no")) {
				break;
				
			}//if

		}//while end
System.out.println("program terminated");
	}//main

}//main app
