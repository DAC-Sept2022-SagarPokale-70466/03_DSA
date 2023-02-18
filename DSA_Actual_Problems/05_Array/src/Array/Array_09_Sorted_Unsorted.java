/**
* @Developer : Sagar_Pokale
* 30-Oct-2022 3:33:57 PM
**/

package Array;

import java.util.Arrays;

public class Array_09_Sorted_Unsorted {

	public static void main(String[] args) {

		int arr[] = { 5, 20, 80, 100 };
		System.out.println(Arrays.toString(arr));
		boolean check = sortedUnsorted(arr);
		System.out.println("index = " + check);
	}

//	Better method O(n)
	
	private static boolean sortedUnsorted(int[] arr) {
		for(int i = 1; i < arr.length - 1 ; i++) {
			if(arr[i] < arr[i -1])
				return false;
		}
		return true;
	}

//	Naive Method		O(n)sq
//	public static boolean sortedUnsorted(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[j] < arr[i]) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}

	// Better Method	O(n) 
	
	
}
