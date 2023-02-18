/**
* @Developer : Sagar_Pokale
* 29-Oct-2022 4:12:01 PM
**/

package _08_PrimeNo;

import java.util.Scanner;

public class Prime_no {
	public static void main(String[] args) {
		while (true) {
			System.out.println("Enter the Value  : ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			boolean check = findPrime(n);
			if (check) {
				System.out.println("PRIME NO : ");
			} else
				System.out.println("NOT A PRIME ");
		}
//	
	}

	// Naive Method which is not optimized
	// When there is a actual prime no it will go throw all the iteration i.e O(n);
	// But for even it willl take constant time
	
//	public static boolean findPrime(int n) {
//		int count = 0;
//		if (n == 1 || n == 0)
//			return false;
//		for (int i = 2; i < n; i++) {
	  //			System.out.println(count++);
//			if (n % i == 0)
//				return false;
//		}
//		return true;
//	}

	// Much Better Method

//	public static boolean findPrime(int n) {
//		int count = 0;
//		if (n == 1 || n == 0)
//			return false;
//		for (int i = 2; i * i  <=  n; i++) {						// Iterate 
//			System.out.println(count++);
//			if (n % i == 0)
//				return false; 
//		}
//		return true;
//	}

	// BEST METHOD

	public static boolean findPrime(int n) {
		int count = 0;
		if (n == 1 || n == 0)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		for (int i = 5; i * i <= n; i = i + 6) {
			System.out.println(count++);
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		}
		return true;
	}
}
  