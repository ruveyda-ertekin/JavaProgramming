package chapter2;


public class Exercise02_18 {
	
	public static void main(String[] args) {
	
	System.out.println("a     b     pow(a,b)");
		
		for(int i = 1; i < 6; i++) {
			System.out.println(i + "     " + (i+1) + "     " + (int) Math.pow(i, i+1));
		}
	}
}
