package chapter4;

import java.util.Scanner;

public class Exercise04_06 {

	public static void main(String[] args) {

		double r = 40;
		double circle = 2 * Math.PI * r;

		// Write a program that generates three random points on a
		// circle centered at (0, 0) with radius 40 and display three angles
		// in a triangle formed by these three points.
		System.out.print("(a) A triangle is formed from three random points on the circle.");
		double angle1 = (Math.random() * (Math.PI * 2));
		double angle2 = (Math.random() * (Math.PI * 2));
		double angle3 = (Math.random() * (Math.PI * 2));

		double x1 = r * Math.cos(Math.toRadians(angle1));
		double y1 = r * Math.sin(Math.toRadians(angle1));
		double x2 = r * Math.cos(Math.toRadians(angle2));
		double y2 = r * Math.sin(Math.toRadians(angle2));
		double x3 = r * Math.cos(Math.toRadians(angle3));
		double y3 = r * Math.sin(Math.toRadians(angle3));

		System.out.println("(" + x1 + ", " + y1 + ")");
		System.out.println("(" + x2 + ", " + y2 + ")");
		System.out.println("(" + x3 + ", " + y3 + ")");
		
		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

		System.out.println("1. angle: " + Math.round(A * 100) / 100.0);
		System.out.println("2. angle: " + Math.round(B * 100) / 100.0);
		System.out.println("3. angle: " + Math.round(C * 100) / 100.0);
		
		System.out.println("(b) A random point on the circle can be generated using a random angle a.");
		
		double anglea = (Math.random() * (Math.PI * 2));
		double x = r * Math.cos(Math.toRadians(anglea));
		double y = r * Math.sin(Math.toRadians(anglea));
		System.out.println("angle a :" + anglea + "(" + x + " , " + y + " )" );
		
		System.out.println("(c) A pentagon is centered at (0, 0) with one point at the 0 o’clock position.");
	
	}

}
