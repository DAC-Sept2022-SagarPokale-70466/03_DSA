/**
* @Developer : Sagar_Pokale
* 06-Jan-2023 5:57:14 AM
**/

package _10_All_Divisors;

public class All_Divisor {

	public static void main(String[] args) {

		printDivisors(25);

	}
//	All divisors appear in pair e.g 30 -> (2,15), (3,10), (5,6)......
//	One of the Divisors in any pair is smaller than or equal to sq. root of n
//	for a pair (x,y) x * y = n
//		let x be the smaller i.e x <= y
//			x * x <= n
//				x <= sq.root of n

//	-------------------------------------------------------------------------------

//	private static void printDivisors(int i) {
//
//		for (int a = 1; a * a <= i; a++) {
//			if (i % a == 0) {
//				System.out.println(a);
//
//				if (a != i / a)	// This servers two purpose 1. print form last divisor and  dont repeat the divisor
//					System.out.println(i / a);
//			}
//		}

//	-------------------------------------------------------------------------------
//	Best Approach 
//o(sq. root n)

	private static void printDivisors(int n) {

		int i;
		for (i = 1; i * i <= n; i++) {
			if (n % i == 0)
				System.out.println(i);
		}

		for (; i >= 1; i--) {
			if (n % i == 0)
				System.out.println(n / i);
		}
	}

//	-------------------------------------------------------------------------------	
//	Naive Solution O(n)
//	public static void printDivisors(int i) {
//		for (int a = 1; a <= i; a++) {
//			if (i % a == 0)
//				System.out.println(a);
//		}
//	}

}
