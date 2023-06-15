package chapter5;

import java.util.Scanner;

public class Exercise05_31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the initial deposit amount: ");
		double amount = input.nextDouble();

		System.out.print("Enter Annual percentage yield : ");
		double annualInterestRate = input.nextDouble();

		System.out.print("Enter maturity period (number of the months) : ");
		double months = input.nextDouble();

		double monthlyInterestRate = annualInterestRate / 1200;
		
		System.out.println();
		System.out.println("Month" + "\tCD Value");
		for (int i = 1; i <= months; i++) {
			amount = amount + amount * monthlyInterestRate ;
			System.out.printf(i + "\t%5.2f\n", amount);
		}
		
	}

}
