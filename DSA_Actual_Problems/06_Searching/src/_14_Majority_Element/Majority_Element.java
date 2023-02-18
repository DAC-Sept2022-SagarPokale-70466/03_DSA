/**
* @Developer : Sagar_Pokale
* 30-Dec-2022 6:11:20 AM
**/

package _14_Majority_Element;

public class Majority_Element {

	public static void main(String[] args) {

		int arr[] = { 8, 7, 6, 8, 6, 6, 6, 6 };

		System.out.println(findMajority(arr));
	}
// Majority element in an array is that the given no. in the array should appear more than n/ 2 times 

// Naive Solution o(n2)
//	private static int findMajority(int[] arr) {
//
//		for (int i = 0; i < arr.length; i++) {
//			int count = 1;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j])
//					count++;
//			}
//			if (count > (arr.length / 2))
//				return count; // Return i to get index
//		}
//		return -1;
//	}
//}

//----------------------------------------------------------------------------------

// Better Approach 
//	o(n)
	private static int findMajority(int[] arr) {
		
		int res = 0, count = 1; // initialize the first index with result and count 1;
//		find the candidate
		for (int i = 1; i < arr.length; i++) {
			if (arr[res] == arr[i])
				count++;
			else
				count--;

			if (count == 0) {
				res = i;
				count = 1;
			}
		}
// check candidate is majority or not
		
		count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[res] == arr[i])
				count++;

		}
		if (count <= (arr.length / 2))
			return -1;
		return res;
	}
}