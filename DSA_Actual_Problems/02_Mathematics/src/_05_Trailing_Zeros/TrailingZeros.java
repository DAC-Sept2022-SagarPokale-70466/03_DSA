/**
* @Developer : Sagar_Pokale
* 01-Jan-2023 12:35:35 PM
**/

package _05_Trailing_Zeros;

public class TrailingZeros {

	public static void main(String[] args) {

		System.out.println(findTrailingZeros(251));
	}

//	 Logic is : FindOut the Pairs of 5 and 2 which will give 0 
//	o(lon n)
	private static int findTrailingZeros(int i) {
		int res = 0;
		for (int a = 5; a <= i; a *= 5) {
			res = res + i / a;
		}
		return res;
	}

}
