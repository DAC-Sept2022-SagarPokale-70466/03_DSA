/**
* @Developer : Sagar_Pokale
* 21-Dec-2022 6:34:30 AM
**/

package _01_Binary_Search;

public class Birnay_Search_Recursive {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(binarySearch(arr, 0, arr.length - 1, 4));

	}

	private static int binarySearch(int[] arr, int left, int right, int k) {

		if(left > right)
			return -1;
		
		int mid = (left + right) / 2;
		
		if (arr[mid] == k)
			return mid;

		else if (arr[mid] > k) {
			return binarySearch(arr, left, mid - 1, k);
		} else {
			return binarySearch(arr, mid + 1, right, k);
		}
	}

}
