package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RailwayTicket1 {
	String name;
	String coach;
	long mobno;
	int amount;
	int tickets;
	int totalamount;

	void accept() throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter Customer name : ");
		name = br.readLine();
		System.out.println(" ");
		System.out.println("*****Select your choice******");
		System.out.println("1.FirstAc");
		System.out.println("2.SecondAc");
		System.out.println("3.ThirdAc");
		System.out.println("4.Sleeper");
		System.out.println("Enter your coach name : ");
		coach = br.readLine();
		System.out.println(" ");

		System.out.println("Enter mobno : ");
		mobno = Long.parseLong(br.readLine());
		System.out.println("Enter number of tickets : ");
		tickets = Integer.parseInt(br.readLine());
		System.out.println(" ");
	}

	void update() {
		if (coach.equals("firstac")) {
			amount = 700;
		} else if (coach.equals("secondac")) {
			amount = 500;
		} else if (coach.equals("thirdac")) {
			amount = 250;
		} else {
			System.out.println("none");
		}
		System.out.println("The amount for the " + coach + " is " + amount);
		totalamount = amount * tickets;
		System.out.println("The total amount for the " + tickets + " tickets is " + totalamount);
		System.out.println(" ");
	}

	void display() {
		System.out.println("*********** Details of Customer ********");
		System.out.println("name = " + name);
		System.out.println("coach = " + coach);
		System.out.println("mobno = " + mobno);
		System.out.println("total amount = " + totalamount);
	}
}

public class RailwayTicket {
	public static void main(String[] args) throws IOException {
		RailwayTicket1 rt = new RailwayTicket1();
		rt.accept();
		rt.update();
		rt.display();
	}
}
