/**
* @Developer : Sagar_Pokale
* 09-Nov-2022 1:14:26 AM
**/

package Array;

import java.util.Arrays;

public class Arrays_14_Left_Rotation_By_D_Element {

	public static void main(String[] args) {

		int[] arr = { 8, 5, 0, 10, 0, 20 , 50};
		
		System.out.println("Enter the no of Elements you want to rotate by : ");
		int d = 2;
		reverse(arr, 0, d - 1);					// O(d)
		reverse(arr, d , arr.length - 1);// O(n - d)
		reverse(arr, 0, arr.length - 1);// O(n)
		
		System.out.println(Arrays.toString(arr));
		
	}
//		O(d + n - d + n)
//		This is Done in O(n) and dosn;t require extra space
	
	private static void reverse(int[] arr, int low, int high) {
		int temp;
		while (low < high) {
			temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}

	}
	
//	another approach will be store the first d element into temp array and then shift the elements toward left and 
//	at last add the temp array

}
