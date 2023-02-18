/**
* @Developer : Sagar_Pokale
* 19-Dec-2022 5:44:23 AM
**/

package _16_Subset_Sum;
public class Sum_Subset {

	public static void main(String[] args) {
		
		int arr[]  = { 10,20,15, 5, 15};
		int sum = 25;
		
		System.out.println("Total subset = sum => "+countSum(arr, arr.length, sum));

	}

	private static int countSum(int[] arr, int length, int sum) {
		
		if(length == 0) {
			return (sum == 0) ? 1 : 0;
		}
		
		return countSum(arr, length - 1, sum) + countSum(arr, length - 1, sum - arr[length - 1]);
	}

}
