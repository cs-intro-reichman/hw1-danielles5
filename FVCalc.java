// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Recieves the amount of savings, the average return rate, and amount of time (in years) planned to save
		int savings = Integer.parseInt(args[0]);
		double returnRate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		// Calculates compound interest and prints
		double futureValue = savings * Math.pow(((returnRate / 100) + 1) , years);
		int roundedValue = (int)futureValue;
		//double futureValue = interest + savings;

		System.err.println("After " + years +  " years, $" + savings + " saved at " + returnRate + 
							"% will yield $" + roundedValue);
	}
}