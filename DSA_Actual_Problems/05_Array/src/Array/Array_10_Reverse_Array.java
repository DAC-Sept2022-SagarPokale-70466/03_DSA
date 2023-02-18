/**
* @Developer : Sagar_Pokale
* 30-Oct-2022 3:50:02 PM
**/

package Array;

import java.util.Arrays;

public class Array_10_Reverse_Array {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(arr));

		reverseArray(arr);
		System.out.print("Reversed array is \n");

		System.out.println(Arrays.toString(arr));

	}
	
	public static void reverseArray(int [] arr) {
	int temp;
	int start = 0; 
	int end = arr.length - 1;
	while (start < end) {
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
	}
}
}


/*
  Hackerrank
  
  for(int i = 0, j = a.size() - 1; i < j; i++){
   a.add(i, a.remove(j)); 
   }
  
 return a;
 */