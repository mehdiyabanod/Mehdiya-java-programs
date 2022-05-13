package p2;

import java.util.Scanner;

public class BankDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		float amount = 10000;
		int choice;
		float Deposite_amount, Withdraw_amount;
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Please enter your choice : ");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Display the Balance_amount");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the Deposit amount : ");
				Deposite_amount = sc.nextFloat();

				if (Deposite_amount > 0) {
					amount = amount + Deposite_amount;
					System.out.println("The Deposited amount is " + amount);
				} else {
					System.out.println("Deposite Amount should not be Negative!");
				}
				break;

			case 2:
				System.out.println("Enter the Withdraw amount : ");
				Withdraw_amount = sc.nextFloat();

				if (Withdraw_amount < amount) {
					amount = amount - Withdraw_amount;
					System.out.println("The Balance amount is " + amount);
				} else {
					System.out.println("Insufficient Balance!!");
				}
				break;

			case 3:

				System.out.println("Your account balance is " + amount);
				break;

			default:
				System.out.println("invalid input!!!");
				break;
			}
			System.out.println("Do you want to Continue Y?N");
			ch = sc.next().charAt(0);
		} while (ch != 'N');
		System.out.println("You are out of the do while Loop!!");
	}
}
