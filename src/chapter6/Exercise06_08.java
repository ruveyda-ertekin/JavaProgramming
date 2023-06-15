package chapter6;

public class Exercise06_08 {

	public static void main(String[] args) {

		System.out.printf("%s %15s    |   %15s %10s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
		System.out.println("----------------------------------------------------------");

		for (double celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0 && fahrenheit >= 30; celsius--, fahrenheit-=10) {

			System.out.printf("%.1f    %10.1f         |   %10.1f    %10.2f\n", celsius, celsiusToFahrenheit(celsius),
					fahrenheit, fahrenheitToCelsius(fahrenheit));

		}

	}

	public static double celsiusToFahrenheit(double celsius) {

		return (9.0 / 5) * celsius + 32;

	}

	public static double fahrenheitToCelsius(double fahrenheit) {

		return (5.0 / 9) * (fahrenheit - 32);
	}

}
