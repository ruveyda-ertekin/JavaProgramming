package chapter3;

import java.util.Scanner;

public class Exercise03_31 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		double convert = input.nextDouble();
		
		if (convert == 1) {
			
			System.out.print("Enter the RMB amount: ");
			double yuan = input.nextDouble();
			
			System.out.println(yuan + " yuan is $" + (yuan / rate ));
			
		} else if (convert == 0) {
			
			System.out.print("Enter the dollar amount: ");
			double dollar = input.nextDouble();
			
			System.out.println("$" + dollar + " is " + (rate * dollar ) + " yuan.");
			
		} else if (convert != 0 || convert != 1) {
			
			System.out.println("Incorrect input");
			
		}
		
	}

}
