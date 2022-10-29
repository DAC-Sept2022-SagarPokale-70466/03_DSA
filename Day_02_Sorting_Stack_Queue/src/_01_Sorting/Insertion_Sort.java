/**
* @Developer : Sagar_Pokale
* 28-Oct-2022 6:02:27 PM
**/

package _01_Sorting;

import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 3, 8, 2, 4 };
		System.out.println(Arrays.toString(arr));
		System.out.println("Bubble Sort : ");
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr) {
		int i, j, temp;
		for (i = 1; i < arr.length; i++) {		// Starting from index 1
			temp = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {		// Condition while j is greater than 0 and arr[j] greater than temp variable
				arr[j + 1] = arr[j];								// Moving element by 1 index
			}
			arr[j + 1] = temp;
		}
	}
}