/**
* @Developer : Sagar_Pokale
* 17-Jan-2023 6:07:00 AM
**/

package String;

public class _05_Subsequence_Of_String {

//	Subsequnce can be A and C from ABC should be in forward direction
// Substring only be continuos character

//  Substring = 	2 Power n
	public static void main(String[] args) {

		String str = "GeeksForGeeks";
		String str2 = "eesa";

//		System.out.println(checkSubstring(str, str2));

		System.out.println(checkSubstringRecursrive(str, str2, str.length() - 1, str2.length() - 1));

	}
	
//	private static boolean checkSubstring(String str, String str2) {
//		int i = 0, j = 0;
//		while (i != str.length()) {
//			if (str.charAt(i) == str2.charAt(j)) {
//				i++;
//				if(j < str2.length())
//				j++;
//			} else {
//				i++;
//			}
//		}
//		
//		if(j == str2.length() - 1)
//			return true;
//
//		return false;
//	}

// More efficient
	private static boolean checkSubstring(String str, String str2) {
		int j = 0;

		for (int i = 0; i < str.length() - 1 && j < str2.length() - 1; i++) {
			if (str.charAt(i) == str2.charAt(j))
				j++;
		}
		if (j == str2.length() - 1)
			return true;

		return false;
	}

//	o(i + j)
	private static boolean checkSubstringRecursrive(String str, String str2, int i, int j) {
		
		if(j == 0)
			return true;
		if(i == 0)
			return false;
		
		if(str.charAt(i) == str2.charAt(j))
			return checkSubstringRecursrive(str, str2, i-1, j-1);
		else
			return checkSubstringRecursrive(str, str2, i-1, j);
	}
}
