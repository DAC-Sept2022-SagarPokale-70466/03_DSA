/**
* @Developer : Sagar_Pokale
* 15-Nov-2022 10:24:12 PM
**/

package Array;
public class Arrays_21_Max_consicative_one {

	public static void main(String[] args) {

		int[] arr = {0,1,1,1,0,1,1,0};
		
		find_consicative(arr);
	}

//	O(n)
	private static void find_consicative(int[] arr) {

		int count = 0 , small = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 1) {
				small++;
				count = Math.max(small, count);
			}
			
			else if(arr[i] == 0) {
				small = 0;
			}
				
		}
		System.out.println(count);
	}

}
