package chapter2;

import java.util.Scanner;

public class Exercise02_12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter speed and acceleration: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		double lenght = (v * v) / (2 * a) ;
		
		System.out.println("The minimum runway length for this airplane is " + lenght);
	}

}
