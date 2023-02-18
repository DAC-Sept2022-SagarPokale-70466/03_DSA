/**
* @Developer : Sagar_Pokale
* 15-Dec-2022 11:27:34 PM
**/

package _11_Sum_of_Digits;

public class _11_Sum_Digits {
	public static void main(String[] args) {
		System.out.println(sumOfDigits(253));
	}

	private static int sumOfDigits(int i) {
		if (i == 0)
			return 0;
		return sumOfDigits(i / 10) + (i % 10);
	}
}
