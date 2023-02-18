/**
* @Developer : Sagar_Pokale
* 09-Nov-2022 12:58:59 AM
**/

package Array;

import java.util.Arrays;

public class Arrays_13_Left_Rotation_By_1 {

	public static void main(String[] args) {
		
		int[] arr = { 8, 5, 0, 10, 0, 20 , 50};
		
		rotate(arr);
		
	}

	private static void rotate(int[] arr) {
		
		int temp = arr[0];
		for(int i =1 ; i < arr.length - 1; i++)
			arr[i - 1] = arr[i];
		arr[arr.length - 1] = temp;
		System.out.println(Arrays.toString(arr));
	}
	

}
