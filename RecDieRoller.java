/**A class that rolls a random number on a six-sided die, and continues doing so until a 2 is rolled
 * @author aelias2
 */
import java.util.Random;


public class RecDieRoller {
	/**
	 * A cumulative counter variable that holds the total number of rolls thrown over the total number of runs as declared in the driver class.
	 */
	int rollsThrownTotal = 0;
	
	/**
	 * A counter storing the total number of rolls in a single round of dice throwing, which is reset each time a two is reached.
	 */
	int rollsThisRound = 0; 
	
	/**
	 * A recursive method that rolls a random number on a six-sided dice, prints the result, continues running until a 2 is rolled.  and only returns the result when a 2 is rolled.  The total number of rolls is counted in terms of both cumulative rolls over the total number of times roll() is called, as well as the total number of rolls it takes to roll a 2 in a given round.
	 * @return rollsThrownTotal The total number of rolls it took to reach a 2, for as many times as the method was called
	 */
	public int roll() {
		/**
		 * Instantiates a random number generator to be used in the die roller.
		 */
		Random ranNum = new Random();
		
		/*
		 * Instantiates minimum and maximum values of the dice.
		 */
		int min = 1;
		int max = 6;
		
		/**
		 * Instantiates dieFace as a random die-rolled value of 1-6, inclusive.
		 */
		int dieFace = ranNum.nextInt(max - min + 1) + min;
		
		/**
		 * Prints the result of a single die roll.
		 */
		System.out.println("You rolled a " + dieFace + ".");
		
		/**
		 * Recursive if loop that continues to call roll and thus re-roll the die if a 2 is not rolled.  It also increases the count of rollsThrownTotal and rollsThisRound each time this part of code is run, whether a 2 is reached or not.
		 */
		if(dieFace != 2) {
			rollsThrownTotal++;
			rollsThisRound++; //rolls until two, just this round
			return roll();
		}else {
			rollsThrownTotal++;
			rollsThisRound++;
			System.out.println("This round, it took " + rollsThisRound + " rolls to reach 2.");
			rollsThisRound = 0;
			return rollsThrownTotal;
		}
	}//end roll
	
	/**
	 * A method that returns the cumulative number of die rolls
	 * @return rollsThrownTotal the cumulative number of die rolls
	 */
	public int totalRollsUntilTwo() {
		return rollsThrownTotal;
	}//end totalRollsUntilTwo
		
}//end class

