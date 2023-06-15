package chapter6;

import java.util.Scanner;

public class Exercise06_07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("The amount investment : ");
		double investmentAmount = input.nextDouble();

		System.out.print("Annual interest rate: ");
		double monthlyInterestRate = input.nextDouble();

		System.out.println("Years\t" + "     Future Value");

		for (int years = 1; years <= 30; years++) {

			System.out.printf("%-8d %11.2f\n", years,
					futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
		}

	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {

		return investmentAmount * (Math.pow((1 + (monthlyInterestRate / 1200)), years * 12));
	}

}
