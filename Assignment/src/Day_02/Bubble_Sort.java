/**
* @Developer : Sagar_Pokale
* 29-Oct-2022 5:52:38 PM
**/

package Day_02;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 3, 8, 2, 4 };
		System.out.println(Arrays.toString(arr));
		int count = bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Count = "+count);
		
	}
	
	public static int bubbleSort(int [] arr) {
		int count = 0;
		for(int i = 0; i < arr.length - 1 ; i++) {
			for(int j = 0 ; j < arr.length - 1 - i ; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					count++;
				}
			}
		}
		return count;
	}

}