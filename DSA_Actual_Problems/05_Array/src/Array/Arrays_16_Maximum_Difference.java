/**
* @Developer : Sagar_Pokale
* 09-Nov-2022 10:32:55 PM
**/

package Array;
public class Arrays_16_Maximum_Difference {
// Maximum value of arr[j] - arr[i] such that j >  i
	public static void main(String[] args) {

//		int[] arr = {2,3,10,6,4,8,1};
		
		int [] arr = {3,6,10,7,9,1};
		
		findMaxDiff(arr);
	}

	
	
	// O(n)sq
//	private static void findMaxDiff(int[] arr) {
//		int res = 0;
//		for(int i= 0; i < arr.length - 1; i++) {
//			for(int j = 0 ; j < arr.length - 1; j++) {
//				res = Math.max(res, arr[j] - arr[i]);
//			}
//		}
//	System.out.println(res);	
//	}
	
//	Better Method O(n)
	public static void findMaxDiff(int [] arr) {
		int res = arr[1] - arr[0];
		int minValue = arr[0];
		
		for(int j = 1; j < arr.length - 1 ; j++) {
			res = Math.max(res, arr[j] - minValue);
			minValue = Math.min(minValue, arr[j]);
		}
		System.out.println(res);
	}
	

}
