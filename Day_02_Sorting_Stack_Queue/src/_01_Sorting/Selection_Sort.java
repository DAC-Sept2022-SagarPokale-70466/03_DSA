/**
* @Developer : Sagar_Pokale
* 28-Oct-2022 5:14:58 PM
**/

package _01_Sorting;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 3, 8, 2, 4 };
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void selectionSort(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			count++;
		}
		System.out.println(count);
	}
}
