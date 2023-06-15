package chapter5;

import java.util.Scanner;

public class Exercise05_30 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Amount : ");
		double amount = input.nextDouble();

		System.out.print("Annual interest rate : ");
		double annualInterestRate = input.nextDouble();

		System.out.print("Number of the months : ");
		double months = input.nextDouble();

		double monthlyInterestRate = annualInterestRate / 1200;

		double account = 0;
		for (int i = 1; i <= months; i++) {
			account = (amount + account) * (1 + monthlyInterestRate);
		}
		System.out.println("Saving in the account : " + (int) (account * 100) / 100.0);
	}

}
