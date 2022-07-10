/**
 * You are a traveler and traveling to a country where the currency denominations are 
 * unknown and as you travel, you get to know about the denomination in random order.
 * You want to make a payment of amount x, in such a way 
 * that the number of notes you give is minimum.
 */

package com.lab;

import java.util.Scanner;

import com.lab.currency.Currency;
import com.lab.services.MergeSort;
import com.lab.services.NotesCount;

/**
 * @author nishthapradhan
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Collect information about available currency denominations
		System.out.println("How many unique currency denominations do you have?");
		int number_of_denominations = sc.nextInt();
		int[] denominations = new int[number_of_denominations];
		for (int i = 0; i < number_of_denominations; i++) {
			System.out.print("Enter the available currency denominations: ");
			denominations[i] = sc.nextInt();
		}
		
		System.out.print("\nEnter the amount you want to pay:");
		int payable_amount = sc.nextInt();
		System.out.println();
		System.out.print("These are your currently entered denominations: ");
		printArray(denominations, denominations.length);
		
		// Processing denominations in Currency class
		Currency currency = new Currency(denominations, number_of_denominations);
		// Sort the denominations into descending order
		MergeSort.sort(currency.denominations, 0, number_of_denominations - 1);
		System.out.print("\n\nIn order to use minimum number of currency denominations, "
				+ "we will be using up the higher denominations first.\n"
				+ "So the order of use will be: ");
		printArray(currency.denominations, number_of_denominations);
		System.out.println();
		
		// Finally, count the number of denominations that need to be used
		NotesCount.numberOfDenominations(currency.denominations, payable_amount);
	}
	
	public static void printArray(int[] array, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
