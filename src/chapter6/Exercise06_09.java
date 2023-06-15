package chapter6;

public class Exercise06_09 {

	public static void main(String[] args) {
		
		System.out.printf("%5s %13s        |   %12s %9s\n", "Feet", "Meters", "Meters", "Feet");
		System.out.println("----------------------------------------------------------");

		for (double foot = 1, meter = 20.0; foot <= 10 && meter <= 65; foot++, meter+=5) {

			System.out.printf("%4.1f    %10.3f         |   %10.1f    %10.3f\n", foot, footToMeter(foot),
					meter, meterToFoot(meter));

		}

	}

	public static double footToMeter(double foot) {

		return 0.305 * foot;

	}

	public static double meterToFoot(double meter) {

		return 3.279 * meter;
	}

}
