/**
 * 
 */
package com.lab.services;

/**
 * @author nishthapradhan
 *
 */
public class NotesCount {

	public static void numberOfDenominations(int[] denominations, int amount) {
		int[] notes_counter = new int[denominations.length];
		try {
			for (int i = 0; i < notes_counter.length; i++) {
				if(amount >= denominations[i]) {
					notes_counter[i] = amount / denominations[i];
					amount = amount - denominations[i]*notes_counter[i];
				}
			}
				if(amount > 0)
					System.out.println("\n\nRequired amount can not be provided with the given set of denomination");
				else {
					System.out.println("\n\nYour payment approach in order to give "
							+ "minimum number of notes should be to use:");
					for(int i = 0; i < notes_counter.length; i++) {
						if(notes_counter[i] != 0)
							System.out.printf("%d notes of %d.\n", notes_counter[i], denominations[i]);
					}
				}
			}
		catch(ArithmeticException e) {
			System.out.println("\nOops! We were not able to process "
					+ "your request due to the following reasons:\n" + e);
		}
	}
}
