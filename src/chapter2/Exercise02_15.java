package chapter2;

import java.util.Scanner;

public class Exercise02_15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double firstDistance = Math.pow((x2-x1), 2); 
		double secondDistance =	Math.pow((y2-y1), 2);
		double a = firstDistance + secondDistance ;
		double finalDistance = Math.pow(a, 0.5);
		
		
		
		System.out.println("The distance between the two points is " + finalDistance);

	}

}
