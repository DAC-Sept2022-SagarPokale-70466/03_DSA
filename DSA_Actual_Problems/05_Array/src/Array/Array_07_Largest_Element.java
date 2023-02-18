/**
* @Developer : Sagar_Pokale
* 30-Oct-2022 1:18:13 PM
**/

package Array;

import java.util.Arrays;

public class Array_07_Largest_Element {
	public static void main(String[] args) {

		int arr[] = { 10, 2, 13, 4, 5 };
		System.out.println(Arrays.toString(arr));
		int check = largestElement(arr);
		System.out.println("index = " + check);

	}

//	O(n)sq.
	public static int largestElement(int[] arr) {
 		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] >  arr[i]) {		// Comparing J with i because j is constantly traversing 
					flag =false;
						break;		
				}
			}
			if (flag == true)
				return i;
		}
		return -1;
	}

	// Better Method
	// Time Complexity : O(n)
//	public static int largestElement(int[] arr) {
//		int index = 0;
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > arr[index])
//				index = i;
//		}
//		return index;
//	}
}
