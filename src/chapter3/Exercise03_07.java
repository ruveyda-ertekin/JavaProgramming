package chapter3;

import java.util.Scanner;

public class Exercise03_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
			
		int amountInCent= (int) (amount * 100);
			
		int numberOfDollars = amountInCent/ 100;
		amountInCent = amountInCent % 100;
			
		int numberOfQuarters = amountInCent/ 25;
		amountInCent = amountInCent % 25;
			
		int numberOfDimes = amountInCent / 10;
		amountInCent = amountInCent % 10;
			
		int numberOfNickels = amountInCent / 5;
		amountInCent = amountInCent % 5;
			
		int numberOfPennies = amountInCent;
			
		System.out.println("Your amount " + amount + " consists of");
			
		if (numberOfDollars > 0) {
			System.out.println(numberOfDollars + (numberOfDollars == 1 ? " dollar" : " dollars"));
		}
			
		if (numberOfDollars > 0) {
			System.out.println(numberOfQuarters + (numberOfQuarters == 1 ? " quarter" : " quarters"));
		}
		if (numberOfDimes > 0 ) {
			System.out.println(numberOfDimes + (numberOfDimes == 1 ? " dime" : " dimes" ));
			
		}
		if (numberOfDimes > 0 ) {
			System.out.println(numberOfNickels + (numberOfNickels == 1 ? " nickel" : " nickels"));
		}
			
		if (numberOfPennies > 0 ) {
			System.out.println(numberOfPennies + (numberOfPennies == 1 ? " penny" : "pennies"));			}			
	}

}
