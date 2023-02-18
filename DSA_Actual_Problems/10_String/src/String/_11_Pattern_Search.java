/**
* @Developer : Sagar_Pokale
* 20-Jan-2023 6:43:51 AM
**/

package String;

public class _11_Pattern_Search {

	public static void main(String[] args) {

		String str = "ABABABCD";
		String pattern = "ABAB";
		patternSeach(str, pattern);

	}

//	private static void patternSeach(String str, String pattern) {
//
//		int n = pattern.length();
//		int m = str.length();
//		for (int i = 0; i <= m - n; i++) {
//			int j;
//			for (j = 0; j < n; j++)
//				if (pattern.charAt(j) != str.charAt(i + j))
//					break;
//
//			if (j == n)
//				System.out.println(i);
//
//		}
//	}
	
	
//	Improved
	private static void patternSeach(String str, String pattern) {

		int n = pattern.length();
		int m = str.length();
		for (int i = 0; i <= m - n;     ){
			int j;
			for (j = 0; j < n; j++)
				if (pattern.charAt(j) != str.charAt(i + j))
					break;

			if (j == n)
				System.out.println(i);
			
			if(j == 0)
				i++;
			else
				i = (i + j);
			
		}
	
	
	}

}
