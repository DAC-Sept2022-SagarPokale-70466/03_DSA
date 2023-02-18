/**
* @Developer : Sagar_Pokale
* 30-Oct-2022 11:51:57 AM
**/

package Array;

import java.util.Arrays;

public class Insertion_At_Fixed_Size_Array {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		int element = 15;
		int pos = 2;
		int newarr[] = new int[arr.length + 1];
		newarr = insertElement(arr, arr.length, element, pos);
		System.out.println("New Array : \n " + Arrays.toString(newarr));
		System.out.println(newarr.length);
	}

	public static int[] insertElement(int[] arr, int size, int element, int pos) {
		int count = 0;
		int[] newarr = new int[size + 1];
		System.out.println("inside new array " + newarr.length);
		for (int i = 0; i < newarr.length; i++) {
			System.out.println(count++);
			if (i < pos - 1)
				newarr[i] = arr[i];

			else if (i == pos - 1) {
				newarr[i] = element;
			} else
				newarr[i] = arr[i - 1];
		}
		return newarr;
	}
}
