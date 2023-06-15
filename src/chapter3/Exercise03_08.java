package chapter3;

import java.util.Scanner;

public class Exercise03_08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three integers: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		if (x > y && x > z && y > z) {
		System.out.println(x + " > " + y + " > " + z);
		}
		if (x > y && x > z && z > y) {
			System.out.println(x + " > " + z + " > " + y);		
		}
		if (y > x && y > z && x > z ) {
			System.out.println(y + " > " + x + " > " + z);
		}
		if (y > x && y > z && z > x ) {
			System.out.println(y + " > " + z + " > " + x);	
		}
		if (z > x && z > y && x > y ) {
			System.out.println(z + " > " + x + " > " + y);	
		}
		if (z > x && z > y && y > x ) {
			System.out.println(z + " > " + y + " > " + x);	
		}
	}

}
