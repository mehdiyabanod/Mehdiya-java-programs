package p1;

import java.util.Scanner;

public class SumDigits {
	static void SumDigits() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int d,s=0;
		int c=0;
		while (n != 0) {
			d = n % 10;
			s = s + d;
			n = n / 10;

		}
		System.out.println("Sum of digits =" + s);
		System.out.println("Number of digits =" + c);
	}

	public static void main(String[] args) {
SumDigits.SumDigits();
	}

}
