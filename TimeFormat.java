// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 

		// Concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		//int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));


		// Takes the minutes input as a String
		
        String minutes = "" + args[0].charAt(3) + args[0].charAt(4);
		
		

		// Checks if the military time is AM or PM and prints accordingly
		String morningNight;

		if (hours < 12) {
			morningNight = "AM";
			System.err.println(hours + ":" + minutes + " " + morningNight);

		} else if (hours == 12) {
			morningNight = "PM";
			System.err.println(hours + ":" + minutes + " " + morningNight);

		} else {
			morningNight = "PM";
			hours = hours - 12;
			System.err.println(hours + ":" + minutes + " " + morningNight);

		}


	}
}