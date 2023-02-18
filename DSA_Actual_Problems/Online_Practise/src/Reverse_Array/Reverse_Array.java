/**
* @Developer : Sagar_Pokale
* 29-Oct-2022 2:03:51 PM
**/

package Reverse_Array;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {

//		int [] arr = new int[5];
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(arr));

		reverseArray(arr, 0, 5);
		System.out.print("Reversed array is \n");

		System.out.println(Arrays.toString(arr));

	}

	public static void reverseArray(int[] arr, int start, int end) {
		int temp;
		System.out.println("inside the reverse");
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
