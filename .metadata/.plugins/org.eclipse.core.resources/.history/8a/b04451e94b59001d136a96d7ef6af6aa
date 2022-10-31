/**
* @Developer : Sagar_Pokale
* 29-Oct-2022 5:46:32 PM
**/

package Day_02;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 3, 8, 2, 4 };
		System.out.println(Arrays.toString(arr));
		int count = selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Count = "+count);
		
	}
	
	public static int selectionSort(int [] arr) {
		int count = 0;
		for(int i = 0; i < arr.length - 1 ; i++) {
			for(int j = i + 1; j < arr.length ; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					count++;
				}
			}
		}
		
	return count;	
	}

}
