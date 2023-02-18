/**
* @Developer : Sagar_Pokale
* 14-Dec-2022 6:57:42 AM
**/

package _05;

public class Reverse_print {

	public static void main(String[] args) {
		fun(5);
	}

	private static void fun(int i) {
//		start:
		if (i == 0)
			return;

//		fun(i - 1);
		System.out.println(i);
		fun(i - 1); // This is Tail Recursion when this is happen is recursive call
					// There is Save in state of the recursive function
					// Here what happens is at line 21 is replaced by n = n - 1; goto start; // in
					// Modern compiler in speed up

	}

//	Equivalent to tail recursion
//	To Convert into tail recursive just pass the parameter with starting value
//	(Quick sort is also tail recursive and merge sort is NOT)
	static void fun1(int start, int i) {
		if (i == 0)
			return;

		System.out.println(start);
		fun1(start + 1, i - 1);
	}

//	************************************************

	static int fact(int n, int start) {
		if (n == 0 || n == 1)
			return start;
		return fact(n - 1, start * n);
	}

}
