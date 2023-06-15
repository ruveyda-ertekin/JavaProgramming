package chapter6;

public class CheckPoint06_17 {

	public static void main(String[] args) {
		
		
		double z = m(4, 5);
		double z2 = m(4, 5.4);
		double z3 = m(4.5, 5.4);

		System.out.println(m(z, z));
		System.out.println(m(z2, z2));
		System.out.println(m(z3, z3));

	}

	public static double m(double x, double y) {
		return x;

	}

	public static double m(int x, double y) {
		return x;

	}
}
