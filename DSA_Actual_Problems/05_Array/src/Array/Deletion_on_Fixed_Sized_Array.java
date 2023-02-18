/**
* @Developer : Sagar_Pokale
* 30-Oct-2022 12:25:12 PM
**/

package Array;

import java.util.Arrays;

public class Deletion_on_Fixed_Sized_Array {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		int element = 2;
		int check= deleteElement(arr, arr.length, element);
		System.out.println("Check = "+check);
	}

	public static int deleteElement(int arr[], int size, int element) {
		int i;
		for (i = 0; i < size; i++) {
			if (arr[i] == element) {
				System.out.println("Found");
				break;
			}
		}
		if (i == size) {
			return -1;
		}
		for (int j = i; j < size - 1; j++) {
			System.out.println("second FOr loop");
		}

		return size - 1;
	}
}
