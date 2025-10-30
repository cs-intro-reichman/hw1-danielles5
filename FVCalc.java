// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Recieves the amount of savings, the average return rate, and amount of time (in years) planned to save
		double savings = Double.parseDouble(args[0]);
		double returnRate = Double.parseDouble(args[1]);
		double years = Double.parseDouble(args[2]);

		// Calculates compound interest and prints
		double futureValue = savings * Math.pow(1 + returnRate , years);

		System.err.println("If you invest $" + savings + " today at a " + returnRate + 
							"% rate, you will have approx. $" + futureValue + " in " + years + " years.");
	}
}