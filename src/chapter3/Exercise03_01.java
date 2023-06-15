package chapter3;

import java.util.Scanner;

public class Exercise03_01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// ax2 + bx + c = 0
		// 0 = (a * Math.pow(x, 2)) + (b * x) + c;
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		
		System.out.print("The equation has ");

		if (discriminant > 0) {
			
			double r1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a ; 
			double r2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a ; 
			System.out.println("two roots " + r1 + " and " + r2);
		
		} else if (discriminant == 0) {
			
			double r1 = -b + Math.pow(discriminant, 0.5) / 2 * a ; 
			System.out.println("one root " + r1);
		
		} else {
			
			System.out.println("no real roots.");
		
		}
	}
}
	


