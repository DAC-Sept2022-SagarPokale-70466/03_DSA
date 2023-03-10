/**
* @Developer : Sagar_Pokale
* 27-Oct-2022 10:53:41 PM
**/
package _01_General;

import java.util.Arrays;
import java.util.Stack;

public class Reverse_Array {
	// input space => S proportional to n => O(n)
	// aux space => S proportional to n => O(n)
	// Stack (S proportional to n), i variable (S is const)
	// time complexity: O(n)
	public static void reverseArray(int[] arr) {
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0; i < arr.length ; i++) {
			s.push(arr[i]);
		}
		for(int i = 0; i < arr.length; i++)
			arr[i] = s.pop();
	}
	
	// input space => S proportional to n => O(n)
	// aux space => S is const => O(1)
	// variable i, j, temp. (S is const)
	// time complexity: O(n)
	// running time is very less (as compared to above)
	
	public static void reverseArray2(int[] arr) {
		int i, j;
		for(i=0, j=arr.length-1; i<j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

		
	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55 };
		System.out.println(Arrays.toString(arr));
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
	
	}
}
