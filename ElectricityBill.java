package com.edu;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		float fixed_rate = 350.00f;
		int units;
		double amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of units");
		units = sc.nextInt();

		if (units < 100) {
			amount = units * 1.50f + fixed_rate;
		}
		// units 144
		else if (units >= 101 && units <= 150) {
			amount = 100 * 1.50f + (units - 100) * 2.00f;
		}
		// units 244
		else if (units >= 151 && units <= 200) {
			amount = 100 * 1.50f + 50 * 2.00f + (units - 150) * 2.50f + fixed_rate;
		} else {
			amount = 100 * 1.50f + 50 * 2.00f + 100 * 2.50f + (units - 250) * 4.00f + fixed_rate;
		}
		System.out.println("The current bill Rs." + amount);

	}

}

//Output:
//251 units
//854 Totalbill
