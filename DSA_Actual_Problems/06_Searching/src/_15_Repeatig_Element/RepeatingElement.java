/**
* @Developer : Sagar_Pokale
* 30-Dec-2022 6:45:02 AM
**/

package _15_Repeatig_Element;

public class RepeatingElement {
	public static void main(String[] args) {
		int arr[] = { 0, 2, 1, 3, 2, 2 };
		System.out.println(findRepetingElement(arr));
	}

//	if max element if 4 then all its descendant and 0  will available in the array
//	Time = o(n) and space = o(n)

//	private static int findRepetingElement(int[] arr) {
//		boolean temp[] = new boolean[arr.length];		// Boolean are by-default false
//		
//		for(int i = 0; i < arr.length ; i++)
//		{
//			if(temp[arr[i]])
//				return arr[i];
//			temp[arr[i]] = true;
//		}
//		return -1;
//	}
//}

// Better Solution
//	Time = o(n) Space = O(1)
	private static int findRepetingElement(int[] arr) {
		return 0;
	}
}