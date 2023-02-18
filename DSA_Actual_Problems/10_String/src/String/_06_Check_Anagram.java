/**
* @Developer : Sagar_Pokale
* 17-Jan-2023 6:40:45 AM
**/

package String;

import java.util.Arrays;

public class _06_Check_Anagram {

//	Anagram = Permutation 
// No. of frequency should match but sequence can be differ
	public static void main(String[] args) {

		String str = "abced";
		String str2= "decba";
		
		System.out.println(checkAnagram(str, str2));
	}

	


// Naive Solution 	
//private static boolean checkAnagram(String str, String str2) {
//	
//	if(str.length() != str2.length())
//		return false;
//	
//	char a[] = str.toCharArray();
//	Arrays.sort(a);
//	str = new String(a);
//	
//	char b[] = str2.toCharArray();
//	Arrays.sort(b);
//	str2 = new String(b);
//	
//	return str.equals(str2);
//}
	
//Better Solution 
//	By Using requency tech.

	static final int CHAR = 256;
	private static boolean checkAnagram(String str, String str2) {
		
		if(str.length() != str2.length())
			return false;
		
		int count[] = new int[CHAR];
		for(int  i = 0; i < str.length() ; i++)
		{
				count[str.charAt(i)]++;
				System.out.println(count[str.charAt(i)]);
//				count[str2.charAt(i)]--;
//				System.out.println(count[str2.charAt(i)]);
		}
		
		for(int i = 0 ; i < CHAR; i++)
		{
			if(count[i] != 0)
				return false;
		}		
		return true;
	}
}
