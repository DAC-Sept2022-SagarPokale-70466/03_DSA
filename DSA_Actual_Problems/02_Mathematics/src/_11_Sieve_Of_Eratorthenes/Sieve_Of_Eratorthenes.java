/**
* @Developer : Sagar_Pokale
* 06-Jan-2023 6:32:19 AM
**/

package _11_Sieve_Of_Eratorthenes;

import java.util.Arrays;

public class Sieve_Of_Eratorthenes {

	public static void main(String[] args) {

		Sieve(20);
	}
// Initialize the boolean array N+1

	private static void Sieve(int i) {

		boolean[] arr = new boolean[i + 1];

		Arrays.fill(arr, true);

		for (int a = 2; a * a <= i; a++) {
			if (arr[i]) {
//				for (int j = a * 2; j <= i; j = j + a)
				for (int j = a * a; j <= i; j = j + a) // Better solutioin
					arr[j] = false;
			}
		}

		for (int a = 2; a <= i; a++) {
			if (arr[a])
				System.out.println(a);
		}

	}
}
