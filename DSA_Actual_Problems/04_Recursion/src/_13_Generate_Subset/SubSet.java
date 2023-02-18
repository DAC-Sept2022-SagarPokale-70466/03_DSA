/**
* @Developer : Sagar_Pokale
* 16-Dec-2022 6:45:17 AM
**/

package _13_Generate_Subset;

public class SubSet {

	public static void main(String[] args) {

		String str = "abc";
		subset(str, "", 0);
	}

	private static void subset(String string, String curr, int n) {

		if (n == string.length()) {
			System.out.println(curr);
			return;
		}

		subset(string, curr, n + 1);
		subset(string, curr + string.charAt(n), n + 1 );

	}
// subset is always 2 power n 	 
//	Logic here is start with empty string and add 1  index for and condition and for other don't add any char
}
