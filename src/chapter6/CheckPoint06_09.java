package chapter6;

public class CheckPoint06_09 {

	public static void main(String[] args) {

	}

	public static void method1(int n, int m) {
		n += m;
		method2(3.4);
	}

	public static int method2(double d) {
		if (d > 0)
			return 1;
		else if (d == 0)
			return 0;
		else if (d < 0)
			return 0;
		return -1;
	}
}
