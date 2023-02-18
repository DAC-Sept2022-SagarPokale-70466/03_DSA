/**
* @Developer : Sagar_Pokale
* 22-Dec-2022 6:24:44 AM
**/

package _04_Binary_Search;

public class _05_Last_Occurence_Iterative {

	public static void main(String[] args) {
		int arr[] = { 5, 10, 10, 15, 15, 15, 20, 20, 20 };

		System.out.println(last_Occurence(arr, 10));
	}

	private static int last_Occurence(int[] arr, int k) {

		int left = 0, right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == k) {
				if (mid == arr.length - 1 || arr[mid + 1] != arr[mid])
					return mid;
				else
					left = mid + 1;
			}

			else if (arr[mid] > k)
				right = mid - 1;
			else
				left = mid + 1;

		}

		return -1;
	}

}
