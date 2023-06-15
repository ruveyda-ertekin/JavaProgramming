package chapter3;

import java.util.Scanner;

public class Exercise03_02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		System.out.print("What is " + number1 + " + " + number2 + " ? ");
		
		int answer = input.nextInt();
		
		System.out.println(number1 + " + " + number2 + " = " + answer + " is " + 
				(number1 + number2 == answer));

	}

}
