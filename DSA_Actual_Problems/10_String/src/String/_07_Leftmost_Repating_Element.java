/**
* @Developer : Sagar_Pokale
* 17-Jan-2023 7:07:07 AM
**/

package String;



//REPEAT
public class _07_Leftmost_Repating_Element {

	public static void main(String[] args) {

		String str = "zaaaaazc";

		System.out.println(leftMost(str));
	}

	private static char leftMost(String str) {

		int[] count = new int[256];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(count[i] );
			if (count[str.charAt(i)] > 1)
				return str.charAt(i);
		}

		return '0';
	}

}
