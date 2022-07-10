/**
 * This class is needed so that we can work with the temporary values.
 * Instead of changing the original ones.
 */
package com.lab.currency;

/**
 * @author nishthapradhan
 *
 */
public class Currency {
	public int[] denominations;
	int size;
	
	public Currency(int[] denominations, int size) {
		super();
		this.denominations = denominations;
		this.size = size;
	}

}
