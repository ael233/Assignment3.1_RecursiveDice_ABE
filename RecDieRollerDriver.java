/**
 * An application class that calls a recursive random die roller, which rolls until 2 is reached, a specified number of times.  It prints the cumulative total number of times the die was rolled, and also prints the mean number of die rolls it took to roll a 2 over the specified number of times the program was run.
 * @author aelias2
 *
 */

public class RecDieRollerDriver {

	public static void main(String[] args) {
		/**
		 * Instantiates a new instance of RecDieRoller, called toss.
		 */
		RecDieRoller toss = new RecDieRoller();
		
		/**
		 * Sets the number of times the RecDieRoller will run.
		 */
		double totalRuns = 1000;
		
		/**
		 * A for loop that runs the toss instance the number of times declared in totalRuns.
		 */
		for (int i = 0; i < totalRuns; i++) {
			toss.roll();
		}//end for loop
		
		/**
		 * Print statements that state the cumulative total die rolls, followed by the mean number of die rolls it took to roll a 2.
		 */
		
		System.out.println("Number of rolls to reach 2 " + totalRuns + " times: " + toss.totalRollsUntilTwo());
		System.out.println("Mean number of die rolls to get a 2: " + (toss.totalRollsUntilTwo()/totalRuns));
	}//end main

}//end class
