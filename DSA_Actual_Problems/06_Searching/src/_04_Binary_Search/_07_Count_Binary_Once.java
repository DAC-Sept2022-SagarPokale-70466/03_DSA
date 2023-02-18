/**
* @Developer : Sagar_Pokale
* 22-Dec-2022 6:59:44 AM
**/

package _04_Binary_Search;

public class _07_Count_Binary_Once {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 1, 1, 1 };
		// still error in for index 0
		System.out.println(countOnce(arr));
	}

	private static int countOnce(int[] arr) {

		int left = 0, right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == 1) {
				if (arr[mid - 1]== 0 || mid == 0) {
					return ( (arr.length) - mid);
				} else
					right = mid - 1;

			} else {
				left = mid + 1;
			}
		}

		return 0;
	}

}
