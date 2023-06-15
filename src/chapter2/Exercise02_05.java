package chapter2;

import java.util.Scanner;

public class Exercise02_05 {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate:");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		
		double gratuityRate = subtotal / 100 * gratuity;
		
		System.out.println("The gratuity is $" + gratuityRate + " and total is $" + (subtotal + gratuityRate));
	
	}

}
