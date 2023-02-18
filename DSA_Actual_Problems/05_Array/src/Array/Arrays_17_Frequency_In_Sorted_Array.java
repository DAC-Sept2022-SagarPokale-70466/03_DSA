/**
* @Developer : Sagar_Pokale
* 09-Nov-2022 10:58:28 PM
**/

package Array;

public class Arrays_17_Frequency_In_Sorted_Array {

	public static void main(String[] args) {

		// Sorted array
//		int[] arr = { 10, 10, 10, [i 25, 30, 30 };

//		int [] arr = {4};
		int[] arr = { 40, 50, 50, 50 };
		findFrequency(arr);
	}

	private static void findFrequency(int[] arr) {

		int i = 1;
		int freq = 1;

		while (i < arr.length) {

			while (i < arr.length && arr[i] == arr[i - 1]) {
				freq++;
				i++;
			}
			System.out.println(arr[i - 1] + " Arr[i - 1] = Freq = " + freq);
			freq = 1;
			i++;

		}
//		Separeate if condition because the upper while loop will fun for less than arr.length and we have a condition when we have only 1 element in an array	

			if (arr[arr.length - 1] != arr[arr.length - 2] || arr.length == 1) {
				System.out.println(arr[arr.length - 1] + " " + 1);
			}
	}
}
