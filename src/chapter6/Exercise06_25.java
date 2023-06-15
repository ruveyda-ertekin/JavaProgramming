package chapter6;

public class Exercise06_25 {

	public static void main(String[] args) {

		System.out.println(convertMillis(5500));
		System.out.println(convertMillis(100000));
		System.out.println(convertMillis(555550000));

	}

	public static String convertMillis( long millis) {
		
		long totalSec = millis / 1000;
		long seconds = totalSec % 60;
		long minutes = (totalSec / 60) % 60;
		long hour = (totalSec / 60) / 60;
		
		String timeString = hour + ":" + minutes + ":" + seconds;
		
		return timeString;
	}
}
