package p1;

import java.util.Scanner;

public class BookFair {
	String Bname;
	double price;
BookFair(){
	
		Bname = " ";
		price = 0.0;
		
		
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Bname");
		Bname = sc.next();
		System.out.println("enter the price");
		price = sc.nextDouble();
System.out.println();
	}
	void calculate() {
		if(price<=1000) {
			System.out.println("2% discount");
		    price=(price*2)/100;
		}
		else if(price>1000 && price<=3000) {
			System.out.println("10% discount");
		price=(price*10)/100;
		
		}
		else {
			price=(price*15)/100;
			
		}
		}
void display() {
	price=price-price;
	System.out.println("name="+Bname);
	System.out.println("price="+price);
}
	public static void main(String[] args) {
BookFair ob=new BookFair();
ob.input();
ob.calculate();
ob.display();
	}

}
