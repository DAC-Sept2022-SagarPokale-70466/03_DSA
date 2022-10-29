/**
* @Developer : Sagar_Pokale
* 27-Oct-2022 11:21:02 PM
**/

package _03_Binary_Search;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		int key;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to find: ");
		key = sc.nextInt();
		int index = binarySearch(arr, key);
		System.out.println("Found at index: " + index);
		sc.close();
	}

	public static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == key)
				return mid;
			if (key < arr[mid]) // arr[mid] > key
				right = mid - 1;
			else // key > arr[mid] arr[mid] < key
				left = mid + 1;
		}
		return -1;
	}
}
