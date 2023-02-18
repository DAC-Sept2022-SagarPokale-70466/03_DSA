/**
* @Developer : Sagar_Pokale
* 14-Dec-2022 7:30:43 AM
**/

package _08_Factorial_Fibo;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibo(6));
	}

	static int fibo(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return fibo(n - 1) + fibo(n - 2);
	}
}
