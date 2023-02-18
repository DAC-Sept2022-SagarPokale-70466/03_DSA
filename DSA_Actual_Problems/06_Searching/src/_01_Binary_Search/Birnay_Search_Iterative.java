/**
* @Developer : Sagar_Pokale
* 21-Dec-2022 6:18:19 AM
**/

package _01_Binary_Search;

public class Birnay_Search_Iterative {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(binarySearch(arr, 1));
	}
	private static int binarySearch(int[] arr, int k) {
		
		int left = 0;
		int right = arr.length - 1;

//		if (k == left) {
//			return 0;
//		}
//		if (k == right)
//			return right;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid] > k) {
				right = mid - 1;
			} else {
				left = mid;
			}
		}
		return -1;
	}

}
