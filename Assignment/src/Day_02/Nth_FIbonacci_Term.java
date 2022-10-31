/**
* @Developer : Sagar_Pokale
* 31-Oct-2022 11:23:06 PM
**/

package Day_02;

public class Nth_FIbonacci_Term {

	public static void main(String[] args) {

//		for (int i = 1; i <= 10; i++) {
			System.out.println(fibo(4));
	}

	public static int fibo(int n) {
		if (n == 1 || n == 2)
			return 1;
		int res = fibo(n - 1) + fibo(n - 2);
		return res;

	}
}
