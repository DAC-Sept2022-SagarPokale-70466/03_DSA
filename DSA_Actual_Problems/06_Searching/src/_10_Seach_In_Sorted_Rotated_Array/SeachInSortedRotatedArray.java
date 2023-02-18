/**
* @Developer : Sagar_Pokale
* 24-Dec-2022 10:25:16 AM
**/

package _10_Seach_In_Sorted_Rotated_Array;

public class SeachInSortedRotatedArray {

	public static void main(String[] args) {

		int arr[] = { 100, 200, 300, 400, 10,20,30 };

		System.out.println(searchRotatedArray(arr, 20));

	}
//	o(n)
	private static int searchRotatedArray(int[] arr, int key) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			
			if (arr[mid] == key) {
				return mid;
			}

			if (arr[mid] > arr[left]) {
				if (key >= arr[left] && key < arr[mid]) {
					right = mid - 1;
				} else // arr[mid] > arr[
					left = mid + 1;

			} else // arr[mid] < arr[right]
			{
				if( key > arr[mid] && key <= arr[right]) {
					left = mid + 1;
				}
				else
					right = mid - 1;
			}

		}

		return -1;
	}

}
