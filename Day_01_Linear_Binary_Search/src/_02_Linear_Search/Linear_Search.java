/**
* @Developer : Sagar_Pokale
* 27-Oct-2022 11:13:21 PM
**/
package _02_Linear_Search;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		int[] arr = { 88, 33, 66, 99, 11, 77, 22, 55, 11 };
		int key;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to find: ");
		key = sc.nextInt();
		int index  = linearSearch(arr, key);
		System.out.println("Value Find at index = "+index);
	}
	public static int linearSearch(int [] arr, int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key)
				return i;
		}
		return -1;
	}
}
