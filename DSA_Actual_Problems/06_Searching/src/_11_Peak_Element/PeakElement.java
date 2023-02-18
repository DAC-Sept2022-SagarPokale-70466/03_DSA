/**
* @Developer : Sagar_Pokale
* 24-Dec-2022 1:15:07 PM
**/

package _11_Peak_Element;

public class PeakElement {

	public static void main(String[] args) {

		int arr[] = { 10, 7, 8, 20, 12 };
//		System.out.println(findPeak(arr));
		System.out.println(betterFindPeak(arr));
	}

//log(n)
	private static int betterFindPeak(int[] arr) {

//	5,20,40,30,20,50,60

		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (mid == 0 || arr[mid] >= arr[mid - 1] && mid == arr.length - 1 || arr[mid] >= arr[mid + 1])
				return arr[mid];

			if (mid > 0 && arr[mid] <= arr[mid - 1])
				high = mid - 1;
			else
				low = mid + 1;

		}
		return 0;
	}

//	an array of size 1 and 2 then there always be peak element in an array ;

//	Naive Solution
	private static int findPeak(int[] arr) {

		if (arr.length == 1)
			return arr[0];

		if (arr[0] >= arr[1])
			return arr[0];

		if (arr[arr.length - 1] >= arr[arr.length - 2])
			return arr[arr.length - 1];

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
				return arr[i];
		}

		return -1;
	}

}
