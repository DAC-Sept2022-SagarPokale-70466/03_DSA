/**
* @Developer : Sagar_Pokale
* 23-Dec-2022 6:18:16 AM
**/

package _08_Square_Root;

public class Square_Root {

	public static void main(String[] args) {

//		System.out.println(squareRoot(15));

		System.out.println(betterSquareRoot(17));
	}

//	Better Version
	private static int betterSquareRoot(int key) {
		int ans = -1, left = 0, right = key;
		
		while (left <= right) {
			int mid = (left + right) / 2;
			int mSqrt = mid * mid;
			if (mSqrt == key)
				return mid;
			else if (mSqrt > key)
				right = mid - 1;
 			else {
				left = mid + 1;
				ans = mid;
			}
		}
		
		return ans;
	}

	// Naive Solution 0(sqrt. root of x)
	private static int squareRoot(int x) {

		int i = 0;
		while (i * i <= x) {
			i++;
		}
		return i - 1;
	}

}
