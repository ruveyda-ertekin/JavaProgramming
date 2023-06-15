package chapter4;

public class CheckPoint04_01 {

	public static void main(String[] args) {
		
		double a = Math.sqrt(4);
		double b = Math.sin(2 * Math.PI);
		double c = Math.cos(2 * Math.PI);
		double d = Math.pow(2, 2);
		double e = Math.log(Math.E);
		double f = Math.exp(1);
		double g = Math.max(2, Math.min(3, 4));
		double h = Math.rint(-2.5);
		double i = Math.ceil(-2.5);
		double j = Math.floor(-2.5);
		double k = Math.round(-2.5f);
		double l = Math.round(-2.5);
		double m = Math.rint(2.5);
		double n = Math.ceil(2.5);
		double o = Math.floor(2.5);
		double p = Math.round(2.5f);
		double q = Math.round(2.5);
		double r = Math.round(Math.abs(-2.5));
		
		System.out.println("1:Math.sqrt(4); " + a);
		System.out.println("2:Math.sin(2 * Math.PI); " + b);
		System.out.println("3:Math.cos(2 * Math.PI); " + c);
		System.out.println("4:Math.pow(2, 2); " + d);
		System.out.println("5:Math.log(Math.E); " + e);
		System.out.println("6:Math.exp(1); " + f);
		System.out.println("7:Math.max(2, Math.min(3, 4)); " + g);
		System.out.println("8:Math.rint(-2.5); " + h);
		System.out.println("9:Math.ceil(-2.5); " + i);
		System.out.println("10:Math.floor(-2.5); " + j);
		System.out.println("11:Math.round(-2.5f); " + k);
		System.out.println("12:Math.rint(2.5); " + l);
		System.out.println("13:Math.ceil(2.5); " + m);
		System.out.println("14:Math.floor(2.5); " + n);
		System.out.println("15:Math.round(2.5f); " + o);
		System.out.println("16:Math.round(2.5); " + p);
		System.out.println("17:Math.round(2.5); " + q);
		System.out.println("18:Math.round(Math.abs(-2.5)); " + r);
	}

}
