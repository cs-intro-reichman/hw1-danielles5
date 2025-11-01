// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// Input received as 3 names (of the diners) and their total bill (as the final input)
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double billTotal = Double.parseDouble(args[3]);

		// Calculates the total each person should pay, and prints it
		double splitBill = billTotal / 3;
		double billRounded = Math.ceil(splitBill);
		/* 
		if (splitBill % 1 == 0) {
			int billRounded = (int)splitBill;
			System.err.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": please pay " + billRounded + " shekels each.");
		} else {
			int billRounded = (int)(splitBill + 1);
			System.err.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": please pay " + billRounded + " shekels each.");
		}
		*/

		System.err.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + billRounded + " Shekels each");
	}
}
