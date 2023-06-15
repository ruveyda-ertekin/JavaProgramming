package chapter3;

import java.util.Scanner;

public class Exercise03_30 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the time zone offset to GMT : ");
		int gmt = input.nextInt();
		
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		
		long currentSecond = totalSeconds % 60 ;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinute = totalMinutes % 60 ;
		
		long totalHours = totalMinutes / 60;
		
		long currentHour = totalHours % 24 ;
		currentHour = currentHour + gmt ;
		
		if (currentHour > 12) {
			currentHour = currentHour - 12;
			System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " PM");
		} else {
			System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " AM");
		}
		
		
		
		

	}

}
