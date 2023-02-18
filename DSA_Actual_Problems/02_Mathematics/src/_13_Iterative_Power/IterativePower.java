/**
* @Developer : Sagar_Pokale
* 10-Jan-2023 6:32:37 AM
**/

package _13_Iterative_Power;

public class IterativePower {

	public static void main(String[] args) {

		System.out.println(power(4, 5));
	}
//o(log n)
	private static int power(int x, int n) {
		int res = 1;
		while (n > 0) {
			if (n % 2 != 0)
				res = res * x;
			x = x * x;
			n = n / 2;
		}
		return res;
	}

}
