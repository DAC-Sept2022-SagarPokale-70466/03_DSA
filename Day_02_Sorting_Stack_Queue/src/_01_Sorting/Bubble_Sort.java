/**
* @Developer : Sagar_Pokale
* 28-Oct-2022 5:26:20 PM
**/

package _01_Sorting;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 3, 8, 2, 4 };
		System.out.println(Arrays.toString(arr));
		System.out.println("Bubble Sort : ");
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		int[] arr1 = { 5, 6, 3, 8, 2, 4 };
		System.out.println("\n\n");
		System.out.println("\nImporved Bubble Sort : ");
		improvedBubbleSort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		
		
		int[] arr3 = { 1, 2, 3, 4, 5, 6 };
		System.out.println("\n\n");
		System.out.println(Arrays.toString(arr3));
		System.out.println("\n Further Imporved Bubble Sort : ");
		furtherImprovedBubbleSort(arr3);
		System.out.println(Arrays.toString(arr3));

	}

	public static void bubbleSort(int[] arr) {
		int count = 0, comp = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					comp++;
				}
			}
			count++;
		}
		System.out.println("Comparisions = " + comp);
		System.out.println(count);
	}

	public static void improvedBubbleSort(int[] arr) {
		int count = 0, comp = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					comp++;
				}
			}
			count++;
		}
		System.out.println("Comparisions = " + comp);
		System.out.println("Count = " + count);
	}

	public static void furtherImprovedBubbleSort(int[] arr) {
		int count = 0, comp = 0;
		for (int i = 1; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					comp++;
					flag = true;
				}
			}
			count++;
			if (!flag)
				break;
		}
		System.out.println("Comparisions = " + comp);
		System.out.println("Count = " + count);
	}

}
