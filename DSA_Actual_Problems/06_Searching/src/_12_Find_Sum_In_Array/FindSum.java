/**
* @Developer : Sagar_Pokale
* 28-Dec-2022 6:24:32 AM
**/

package _12_Find_Sum_In_Array;

public class FindSum {

	public static void main(String[] args) {

//		int arr[] = { 3, 5, 9, 2, 8, 10, 11 };
//		System.out.println(findSum(arr, 17));

//		Two Pointer Approach to find sum of two in sorted array
//		maintain two pointer 1. at index 0 and 2. and last index

		int arr[] = { 2, 5, 8, 12, 30 };
		System.out.println(twoPointerApproach(arr, 17));
	}

//	O(n)
	private static int twoPointerApproach(int[] arr, int key) {

		int left = 0, right = arr.length - 1;

		while (left < right) {
			if (arr[left] + arr[right] == key)
				return key;
			else if (arr[left] + arr[right] > key)
				right--;
			else
				left++;
		}
		return -1;
	}

	private static int findSum(int[] arr, int key) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] + arr[j] == key)
					return key;
			}
		}
		return -1;
	}

}


// To Find the triplets
// Run 3 Loops where 
// for(int i = 0; i < n ; i ++)
// if(isPair(arr, i + 1, n - 1, x - arr[i])
//						from     to      find(key - index[i])