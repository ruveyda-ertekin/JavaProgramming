package chapter4;

public class CheckPoint04_16 {

	public static void main(String[] args) {
		
		String s1 = "Welcome to Java";
		String s2 = "Programming is fun";
		String s3 = "Welcome to Java";
		
		System.out.println("What are the results of the following expressions?");
	
		System.out.println("s1 == s2 ? " + (s1 == s2));
		System.out.println("s2 == s3 ? " + (s2 == s3));
		System.out.println("s1.equals(s2) ? " + (s1.equals(s2)));
		System.out.println("s1.equals(s3) ? " + (s1.equals(s3)));
		System.out.println("s1.compareTo(s2) ? " + (s1.compareTo(s2)) + "\ns2.compareTo(s3) ? " + (s2.compareTo(s3)) + "\ns2.compareTo(s2) ? " + (s2.compareTo(s2)));
		System.out.println("s1.charAt(0) ? " + (s1.charAt(0)));
		System.out.println("s1.indexOf('j') ? " + (s1.indexOf('j')) + "\ns1.indexOf(\"to\") ? " + (s1.indexOf("to")));
		System.out.println("s1.lastIndexOf('a') ? " + (s1.lastIndexOf('a') + "\ns1.lastIndexOf(\"o\", 15) ? " + (s1.lastIndexOf("o", 15))));
		System.out.println("s1.length() ? " + (s1.length()));
		System.out.println("s1.substring(5) ? " + (s1.substring(5)) + "\ns1.substring(5, 11) ? " + (s1.substring(5, 11)));
		System.out.println("s1.startsWith(\"Wel\") ? " + (s1.startsWith("Wel") + "\ns1.endsWith(\"Java\") ? " + (s1.endsWith("Java"))));
		System.out.println("s1.toLowerCase() ? " + (s1.toLowerCase()) + "\ns1.toUpperCase() ? " + (s1.toUpperCase()));
		System.out.println("s1.concat(s2) ? " + (s1.concat(s2)) + "\ns1.contains(s2) ? " + (s1.contains(s2)));
		System.out.println("\"\\t Wel \\t\".trim() ? " + ("\t Wel \t".trim()));
	}

}
