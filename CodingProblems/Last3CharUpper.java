public class Last3CharUpper {

	public static void main(String[] args) {
		String printlast3Upper = aa("hi there");

		System.out.println(printlast3Upper);
	}

	public static String aa(String n) {

		int a = n.length();

		// gets second last char of string
		System.out.println(n.charAt(a - 2));

		
		String aaa = n.substring(n.length() - 3);
		System.out.println(aaa);

		System.out.println(n.substring(2,5));

		String charUpper = aaa.toUpperCase();
		System.out.println(charUpper);

		String na = n.substring(1, n.length() - 3);

		return na + charUpper;
	}

}