/**
* @Developer : Sagar_Pokale
* 09-Nov-2022 12:33:40 AM
**/

package Array;

import java.util.Arrays;

public class Arrays_12_Move_Zeros {

	public static void main(String[] args) {
		int[] arr = { 8, 5, 0, 10, 0, 20 , 50};
		
		moveZero(arr);
	}

//	 Better Method O(n);
	
	private static void moveZero(int[] arr) {
		int count = 0;
		int temp;
		for(int i = 0 ; i < arr.length - 1; i++) {
			if(arr[i] != 0) {
				temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

//	Navine Method O(n)sq.
	
//	Not work for last index which is 0.
	
//	private static void moveZero(int[] arr) {
//		
//		for(int i = 0 ; i < arr.length ; i++) {
//			int temp;
//			if(arr[i] == 0) {
//				
//				for(int j = i +  1 ; j < arr.length - 1; j++) {
//					if(arr[j] != 0) {
//						temp = arr[j];
//						arr[j] = arr[i];
//						arr[i] = temp;				
//					}
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//	}

	
}
