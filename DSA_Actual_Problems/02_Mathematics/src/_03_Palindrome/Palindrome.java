package _03_Palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the Digits you want to Count No Of Digits : ");
			int digit = sc.nextInt();
			boolean check = checkPalindrome(digit);
			if (check) {
				System.out.println("Yes IT is Palindrome : ");
			} else {
				System.out.println("NO It it Not a Palindrome : ");
			}
		}
	}
//	O(n)
	public static boolean checkPalindrome(int digit) {
		int temp = digit, result = 0;
		int lastDigit;
		while (temp > 0) {
			lastDigit = temp % 10;				// % will give remender i.e Last Digit
			result = result * 10 + lastDigit;
			temp = temp / 10;
		}
		return (digit == result);
	}

}
