/**
* @Developer : Sagar_Pokale
* 22-Dec-2022 6:34:55 AM
**/

package _04_Binary_Search;

public class _06_Count_Occurence {

	public static void main(String[] args) {
		int arr[] = { 5, 10, 10, 15, 15, 15, 20, 20, 20 };

		System.out.println(countOccurence(arr,10));
	}

	public static int countOccurence(int[] arr, int k) {
		int first = binarySearch(arr, 0, arr.length - 1, k);
		System.out.println(first + "asddsf");
		if (first == -1)
			return -1;
		else {
			int last = last_Occurence(arr, k);
			System.out.println(last + "asddsf");
			return (last - first + 1);
		}
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
