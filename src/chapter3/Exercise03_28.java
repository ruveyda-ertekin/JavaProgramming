package chapter3;

import java.util.Scanner;

public class Exercise03_28 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter r1's center x-, y-coordinates, width, and height :");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();

		System.out.print("Enter r2's center x-, y-coordinates, width, and height :");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();

		double topRx1 = x1 + w1 / 2;
		double topRy1 = y1 + h1 / 2;

		double bottomLx1 = x1 - w1 / 2;
		double bottomLy1 = y1 - h1 / 2;

		double topRx2 = x2 + w2 / 2;
		double topRy2 = y2 + h2 / 2;

		double bottomLx2 = x2 - w2 / 2;
		double bottomLy2 = y2 - h2 / 2;
		
		if(topRy2 <= topRy1 && bottomLy2 >= bottomLy1 && bottomLx2 >= bottomLx1  && topRx2  <= topRx1)
			System.out.println("r2 is inside r1");
		else if(bottomLy2 > topRy1|| topRy2  < bottomLy1 || bottomLx2  > topRx1 || topRx2  < bottomLx1 )
			System.out.println("r2 does not overlap r1");
		else // if(r2Up <= r1Up || r2Down >= r1Down || r2Left >= r1Left || r2Right <= r1Right)
			System.out.println("r2 overlaps r1");
		
		input.close();
	
	}

}
