/**
* @Developer : Sagar_Pokale
* 14-Dec-2022 7:22:39 AM
**/

package _08_Factorial_Fibo;

public class Factorial {
	public static void main(String[] args) {

		System.out.println(fact(6));

		System.out.println(factBetter(6, 1));
	}

	private static int fact(int i) {
		if (i == 0 || i == 1)
			return i;
		return i * fact(i - 1);
	}

	private static int factBetter(int i, int start) {
		if (i == 0 || i == 1)
			return start;
		return factBetter(i - 1, start * i);
	}
}
