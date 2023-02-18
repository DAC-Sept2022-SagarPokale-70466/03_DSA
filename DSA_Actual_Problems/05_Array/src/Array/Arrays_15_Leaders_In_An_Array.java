/**
* @Developer : Sagar_Pokale
* 09-Nov-2022 1:25:45 AM
**/

package Array;

public class Arrays_15_Leaders_In_An_Array {

	public static void main(String[] args) {
//		Leaders in an array meance there is no element greater on right side of current element 
//		so the right most(last element) will be always the leader element
//		also if the value is repeated then the left one is not a leader but the right one is leader element

		int[] arr = { 7, 10, 4, 10, 6, 5, 2 };

		findLeader(arr);
	}

	// Efficient Method O(n);
	// Here we are starting from the last index and make that last index into
	// cur_lead and the check the lower index with the current_leader
	private static void findLeader(int[] arr) {
		int cur_lead = arr[arr.length - 1];
		System.out.println(cur_lead);

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > cur_lead) {
				cur_lead = arr[i];
				System.out.println(arr[i]);
			}
		}

	}

//	Inefficient method
//	private static void findLeader(int[] arr) {
//
//		for (int i = 0; i < arr.length ; i++) {
//			boolean flag = false;
//			for (int j = i + 1; j < arr.length ; j++) {
//				if (arr[i] <= arr[j]) {
//					flag = true;
//					break;
//				}
//			}
//			if (flag == false)
//				System.out.println(arr[i]);
//		}
//	}

}
