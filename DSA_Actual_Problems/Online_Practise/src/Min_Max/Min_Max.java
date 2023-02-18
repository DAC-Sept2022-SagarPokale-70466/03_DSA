/**
* @Developer : Sagar_Pokale
* 29-Oct-2022 12:16:08 PM
**/

package Min_Max;

public class Min_Max {

	static class Pair {
		int min;
		int max;
	}

//	Maximum and minimum of an array using the tournament method:
	
	public static void main(String[] args) {
		int arr[] = { 1000, 11, 445, 1, 330, 3000 };
		int arr_size = arr.length;
		System.out.println("Length = " + arr_size);
		Pair minmax = getMinMax(arr, 0, arr_size - 1);
		System.out.printf("\nMinimum element is %d", minmax.min);
		System.out.printf("\nMaximum element is %d", minmax.max);

	}

	public static Pair getMinMax(int[] arr, int left, int right) {
		Pair minmax = new Pair();
		Pair mml = new Pair();
		Pair mmr = new Pair();

		int mid;

		if (left == right) { // No of element 1
			minmax.min = arr[left];
			minmax.max= arr[left];
			return minmax;
		}

		if (right == left + 1) { // If there are two elements
			if (arr[left] > arr[right]) {
				minmax.max = arr[left];
				minmax.min = arr[right];
			} else {
				minmax.max = arr[right];
				minmax.min = arr[left];
			}
			return minmax;
		}

		mid = (left + right) / 2;
		mml = getMinMax(arr, left, mid);
		mmr = getMinMax(arr, mid + 1, right);

		if (mml.min < mmr.min) {
			minmax.min = mml.min;
		} else {
			minmax.min = mmr.min;
		}

		if (mml.max < mmr.max) {
			minmax.max = mmr.max;
		} else {
			minmax.max = mml.max;
		}

		return minmax;
	}
}
