/**
* @Developer : Sagar_Pokale
* 16-Jan-2023 7:09:19 AM
**/

package String;

public class _04_Palidorme {

	public static void main(String[] args) {

		String str = "ABCBA";

		System.out.println(check(str));
	}

	
//	O(n)
	private static boolean check(String str) {

		int begin = 0;
		int end = str.length() - 1;

		while (begin < end) {
			if (str.charAt(begin) != str.charAt(end))
				return false;
			begin++;
			end--;
		}

		return true;
	}

}
