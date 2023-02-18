package _03_Factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Enter the Value  : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		findFactorial(n);
//		int result = findFactorialRecursive(n);
//		System.out.println(result);
		sc.close();
	}
	
	public static void findFactorial(int n) {
		int result = 1;
		for(int i = 2; i <= n; i++) {
			result = result * i;
		}
		System.out.println(result);
	}
	
	public static int findFactorialRecursive(int n) {
		if(n == 0)
			return 1;
		return n* findFactorialRecursive(n - 1);
	}
}

// Time Comp =  O(n)
