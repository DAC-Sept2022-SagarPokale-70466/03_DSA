/**
* @Developer : Sagar_Pokale
* 21-Dec-2022 7:00:16 AM
**/

package _04_Binary_Search;

public class _04_First_Occurence_Index {

	public static void main(String[] args) {

		int arr[] = { 5, 10, 10, 15, 15, 15, 20, 20, 20 };

		System.out.println(binarySearch(arr, 0, arr.length - 1, 15));

	}

	public static int binarySearch(int[] arr, int left, int right, int k) {

		if (left > right)
			return -1;

		int mid = (left + right) / 2;

		if (arr[mid] > k)
			return binarySearch(arr, left, mid - 1, k);
		else if (arr[mid] < k)
			return binarySearch(arr, mid + 1, right, k);

		else {
			if (mid ==0 || arr[mid - 1] != arr[mid])
				return mid;
			else
				return binarySearch(arr, left, mid - 1, k);
		}
	}

}
