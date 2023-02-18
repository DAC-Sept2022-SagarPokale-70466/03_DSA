/**
* @Developer : Sagar_Pokale
* 04-Jan-2023 8:15:15 AM
**/

package _06_HCF;

public class HCF {

	public static void main(String[] args) {

		System.out.println(GCD(10, 15));

	}

//	Greatest common divisor is not greater than max of two No.
//	e.g.  GCD/ HCF of 100 and 200 -> can not go beyond 100
//	initialize the result as min of two no 

//	Naive Solution
//	O(min(a,b))
//	public static int GCD(int a, int b) {
//		int res = Math.min(a, b);
//
//		while (res > 0) {
//			if (a % res == 0 & b % res == 0)
//				break;
//
//			res--;
//		}
//		return res;
//	}

//	Euclidean Algo

	public static int GCD(int a, int b) {
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}

}
