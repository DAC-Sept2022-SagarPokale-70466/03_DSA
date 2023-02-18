/**
* @Developer : Sagar_Pokale
* 30-Oct-2022 3:12:18 PM
**/

package Array;

import java.util.Arrays;

public class Array_08_Second_Largest_Element {
	public static void main(String[] args) {

		int arr[] = { 5, 20, 12, 20, 8 };
		System.out.println(Arrays.toString(arr));
		int check = secondLargestElement(arr);
//		int check = secondlargest(arr, arr.length);
		System.out.println("index = " + check);
		System.out.println("Element = " + arr[check]);

	}

	public static int secondLargestElement(int[] arr) {
		int res = -1, largest = 0;

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[largest]) {
				res = largest;
				largest = i;
			} else if (arr[i] != arr[largest]) {
				if (res == -1 || arr[i] > arr[res]) {
					res = i;
				}
			}
		}
		return res  ;
	}

	/*
	 * Here we have to check 3 Condition 1. arr[i] > arr[largest] -> change
	 * res,largest 2. arr[i] == arr[largest] -> Ignore // 2. 3. arr[[i] <
	 * arr[largest] -> res == -1 -> res = i arr[i] <= arr[res] = ignore arr[i] >
	 * arr[res] -> res = i
	 **/

//Naive Method

	public static int getlargest(int a[], int n) {
		int largest = 0;

		for (int i = 1; i < n; i++) {
			if (a[i] > a[largest]) {
				largest = i;
			}
		}
		return largest;
	}

	public static int secondlargest(int a[], int n) {
		int largest = getlargest(a, n);
		int res = -1; // -1 Because second largest might not be available

		for (int i = 0; i < n; i++) {
			if (a[i] != a[largest]) {
				if (res == -1)
					res = i;
				else if (a[i] > a[res])
					res = i;
			}
		}
		return res;
	}
}