/*
 * This program sorts the given array into descending order
 */
package com.lab.services;


public class MergeSort
{
	
	// Main function that sorts array[left ... right] using merge()
	public static void sort(int arr[], int left, int right){
		
		if (left < right) {
			
			// Find the middle point
			int mid = left + (right - left)/2;

			// Sort first and second halves
			sort(arr, left, mid);
			sort(arr, mid + 1, right);

			// Merge the sorted halves
			merge(arr, left, mid, right);
			}
	}
	
	
	/* Merges two sub arrays of array[].
	 * First sub array is array [left ... mid]
	 * Second sub array is array[mid+1 ... right]
	 */
	public static void merge(int array[], int left, int mid, int right)
	{
		// Find sizes of the two sub arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Create temporary arrays 
		int temp_left[] = new int[n1];
		int temp_right[] = new int[n2];

		//Copy data to temporary arrays
		for (int i = 0; i < n1; ++i)
			temp_left[i] = array[left + i];
		for (int j = 0; j < n2; ++j)
			temp_right[j] = array[mid + 1 + j];

		// Merge the temporary arrays: 

		// Initializing indexes of first and second sub arrays
		int i = 0, j = 0;

		// Initializing index of resulting merged sub array
		int k = left;
		while (i < n1 && j < n2) {
			// Compare and sort into descending order
			if (temp_left[i] >= temp_right[j]) {
				array[k] = temp_left[i];
				i++;
			}
			else {
				array[k] = temp_right[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of temp_left[] if any 
		while (i < n1) {
			array[k] = temp_left[i];
			i++;
			k++;
		}

		// Copy remaining elements of temp_right[] if any 
		while (j < n2) {
			array[k] = temp_right[j];
			j++;
			k++;
		}
	}

}

