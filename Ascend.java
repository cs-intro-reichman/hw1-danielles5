
public class Ascend {
	public static void main(String[] args) {
		
		// Must give the minimum of the range and then the maximum of the range as input!
		int lowerRange = Integer.parseInt(args[0]);
		int upperRange = Integer.parseInt(args[1]);

		int rangeSize = upperRange - lowerRange + 1;

		// Generates three integer random numbers in a given range,
		int randomOne = (int)(Math.random() * rangeSize ) + lowerRange;
		int randomTwo = (int)(Math.random() * rangeSize ) + lowerRange;
		int randomThree = (int)(Math.random() * rangeSize ) + lowerRange;

		// Puts the three integers in increasing order and prints
		int holder;

		if (randomOne > randomTwo) {
			
			holder = randomTwo;
			randomTwo = randomOne;
			randomOne = holder;
		} 
		
		if (randomTwo > randomThree) {

			holder = randomThree;
			randomThree = randomTwo;
			randomTwo = holder;
				
		} 
		
		if (randomOne > randomTwo) {
			
			holder = randomTwo;
			randomTwo = randomOne;
			randomOne = holder;

		}

		System.out.println(randomOne + " " + randomTwo + " " + randomThree);

	}
}
