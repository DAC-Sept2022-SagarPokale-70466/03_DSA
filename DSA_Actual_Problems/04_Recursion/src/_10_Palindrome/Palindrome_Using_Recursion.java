/**
* @Developer : Sagar_Pokale
* 15-Dec-2022 11:13:03 PM
**/

package _10_Palindrome;

public class Palindrome_Using_Recursion {

	public static void main(String[] args) {

		String s = "Sagar";
		System.out.println(checkPalindrome(s, 0, s.length() - 1));
	}

//	O(n)
	private static boolean checkPalindrome(String s, int i, int j) {

		if (j <= i)
			return true;

		if (s.charAt(i) != s.charAt(j))
			return false;

		return checkPalindrome(s, i + 1, j - 1);
	}
}
