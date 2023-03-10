/**
* @Developer : Sagar_Pokale
* 27-Oct-2022 11:57:48 PM
**/

package _02_Linear_Search;

import java.util.Scanner;

public class Linear_Search_Recursive {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[] arr = { 88, 33, 66, 99, 11, 77, 22, 55, 12 };
		int key;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to find: ");
		key = sc.nextInt();
		int index = linearSearch(arr, key);
		System.out.println("Value Find at index = " + index);
	}

	public static int linearSearch(int[] arr, int key) {
		int index = linearSearch(arr, arr.length, key);
		return index;
	}

	public static int linearSearch(int[] arr, int size, int key) {

		if (size == 0)// Terminating Condition
			return -1;
		if (arr[size - 1] == key)
			return size - 1;
		else
			return linearSearch(arr, size - 1, key);
	}
}

//Time Complexity: O(N)
//Auxiliary Space: O(N), for using recursive stack space. 