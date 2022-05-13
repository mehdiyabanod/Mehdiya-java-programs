package p1;

import java.util.Scanner;

//user defined Exception
class CheckAge extends Exception {
	public CheckAge(String s) {
		super(s);// call constructor
	}
}

public class MainClass {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		try {
			if(age<18) {
				throw new CheckAge("Not Eligible for voting");
				}
			else {
				System.out.println("You can vote");
			}
		}catch(CheckAge e) {
			System.out.println("object"+e);//object printing
			e.printStackTrace();
		}
	}

}
