/**
* @Developer : Sagar_Pokale
* 29-Oct-2022 11:11:52 AM
**/

package Find_The_Peak;

public class Find_Peak {

//	Find a peak element which is not smaller than its neighbours
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 0 };
		int n = arr.length;
//		System.out.print("Index of a peak point is " + findPeak(arr, n));
		System.out.print("Index of a peak point is " + findPeakRecursive(arr, 0, arr.length - 1, n));
	}

	public static int findPeak(int[] arr, int n) {

		// First or last element is peak element
		if (n == 1)
			return 0;
		if (arr[0] >= arr[1])
			return 0;
		if (arr[n - 1] >= arr[n - 2])
			return n - 1;
		// Check for every other element
		for (int i = 1; i < n - 1; i++) {
			// Check if the neighbors are smaller
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
				return i;
		}
		return 0;
	}

//	Find a peak element using recursive Binary Search
//	https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/

	public static int findPeakRecursive(int[] arr, int low, int high, int n) {

		int mid = low + (high - low) / 2;

		if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid] >= arr[mid + 1]))
			return mid;

		if (arr[mid - 1] > arr[mid] && mid > 0)
			return findPeakRecursive(arr, low, mid - 1, n);
		else
			return findPeakRecursive(arr, mid + 1, high, n);

	}

}
