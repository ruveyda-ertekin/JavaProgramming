package chapter3;

import java.util.Scanner;

public class Exercise03_14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int coin = (int)(Math.random() * 2);
		
		System.out.print("Enter a guess 0-heads or 1-trail: ");
		int guess = input.nextInt();
		
		if(guess == coin) {
			System.out.println("Correct guess!");
		} 
		else {
			System.out.println("Incorrect guess.");
		}	

	}

}
