package com.edu;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num, number1, temp, total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		num = sc.nextInt();
		number1 = num;

		while (number1 != 0) {
			temp = number1 % 10; // 370%10=37
			total = total + temp * temp * temp;
			number1 = number1 / 10;
		}
		if (total == num) {
			System.out.println(num + " is an Armstrong number");
		} else {
			System.out.println(num + " is not an Armstrong number");
		}

	}
}
