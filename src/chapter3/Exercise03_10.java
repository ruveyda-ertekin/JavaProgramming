package chapter3;

import java.util.Scanner;

public class Exercise03_10 {

	public static void main(String[] args) {
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
	
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if (number1 + number2 == answer)
			System.out.println("Your are correct!");
		else { 
			System.out.println("You are wrong.");
			System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
		}
		
	}

}
