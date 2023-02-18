/**
* @Developer : Sagar_Pokale
* 10-Nov-2022 12:05:40 AM
**/

package Array;

public class Arrays_20_Trapping_Rain_Water {

	public static void main(String[] args) {

		int[] arr = { 3, 0, 1, 2, 5 };

		trapWater(arr);
	}

	
//	O(n)sq
	private static void trapWater(int[] arr) {
		
		int res = 0;
		for(int i = 1; i < arr.length - 1; i++) {
			int lMax = arr[i];
			for(int j = 0; j < i; j++) {
				lMax = Math.max(lMax, arr[j]);
			}
			
			int rMax = arr[i];
			for(int j = i +1 ; j < arr.length; j++) {
				rMax = Math.max(rMax, arr[j]);
			}
			
			res = res + (Math.min(lMax, rMax) - arr[i]);
		}
		System.out.println(res);
		
		
	}
	
//	 Better Approach 
}
