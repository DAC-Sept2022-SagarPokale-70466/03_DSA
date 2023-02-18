/**
* @Developer : Sagar_Pokale
* 30-Oct-2022 4:02:13 PM
**/

package Array;

import java.util.Arrays;

public class Array_11_Remove_Duplicates_From_Sorted_Array {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 4, 4, 4, 6, 6, 7, 7, 7 };
		System.out.println(Arrays.toString(arr));

		removeDublicates(arr);

	}

	// Extra space 
	
//	public static void removeDublicates(int[] arr) {
//		int[] temp = new int[arr.length];
//		temp[0] = arr[0];
//		int count = 1;
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] != temp[count - 1]) {
//				temp[count] = arr[i];
//				count++;
//			}
//		}
//		System.out.println(Arrays.toString(temp));
//	}
	

	
	
	
	// No Extra Space is Required

	
	
	public static void removeDublicates(int [] arr) {
		int count = 1;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[count -1]) {
				arr[count] = arr[i];
				count++;
 			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}
}