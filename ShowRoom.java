package p1;

import java.util.Scanner;

public class ShowRoom {
	String name;
	long mobno;
	double cost, dis, amount;

	ShowRoom(){
		name=" ";
		mobno=01;
		cost=0.0;
		dis=0.0;
		amount=0.0;
		
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		name = sc.next();
		System.out.println("enter mobno");
		mobno = sc.nextLong();
		System.out.println("enter cost");
		cost = sc.nextDouble();
	}

	void calculate() {
		if (cost <= 10000) {
			System.out.println(5 % dis);
			dis = (cost * 5) / 100;
		} else if (cost > 10000 && cost <= 20000) {
			System.out.println(10 % dis);
			dis = (cost * 10) / 100;
		} else if (cost > 20000 && cost <= 35000) {
			System.out.println(15 % dis);
			dis = (cost * 15) / 100;
		} else {
			dis = (cost * 20) / 100;
		}
	}

	void display() {
		amount=cost-dis;
		System.out.println("name=" + name);
		System.out.println("mobno=" + mobno);
		System.out.println("cost=" + cost);
		System.out.println("dis=" + dis);
		System.out.println("amount=" + amount);
	}

	public static void main(String[] args) {
		ShowRoom ob=new ShowRoom();
ob.input();
ob.calculate();
ob.display();





	}
}