// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// Input recieved as 3 names (of the diners) and their total bill (as the final input)
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double billTotal = Double.parseDouble(args[3]);

		// Calculates the total each person should pay, and prints it
		double splitBill = billTotal / 3;
		int roundedBill = (int)(splitBill + 1);

		System.err.println("\n" + name1 + " should pay: $" + splitBill + "\nRounded up: $" + roundedBill + ".00\n" +
							"\n" + name2 + " should pay: $" + splitBill + "\nRounded up: $" + roundedBill + ".00\n" +
							"\n" + name3 + " should pay: $" + splitBill + "\nRounded up: $" + roundedBill + ".00\n");
	}
}
