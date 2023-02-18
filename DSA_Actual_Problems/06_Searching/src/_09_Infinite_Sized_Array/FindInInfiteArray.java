/**
* @Developer : Sagar_Pokale
* 23-Dec-2022 6:53:33 AM
**/

package _09_Infinite_Sized_Array;

public class FindInInfiteArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 10, 20, 30, 40, 50, 70, 100, 110, 120, 140, 260, 670, 432 };
		System.out.println(seachInInfinite(arr, 100));
	}

//	Log(position)
//	Unbounded Binary Search
	private static int seachInInfinite(int[] arr, int key) {
		if (arr[0] == key)
			return 0;
		int i = 1;
		while (arr[i] < key) {
			i = i * 2;
		}
		if (arr[i] == key)
			return i;

		return 0;// Get the binary search From ( i /2 + 1) to ( i -1)
	}

}
