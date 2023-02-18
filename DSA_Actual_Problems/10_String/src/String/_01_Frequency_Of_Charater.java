/**
* @Developer : Sagar_Pokale
* 16-Jan-2023 6:22:26 AM
**/

package String;

public class _01_Frequency_Of_Charater {

	public static void main(String[] args) {

		String str = "geeksforgeeks";

		int[] count = new int[26];

		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i) - 'a']++; // Getting the index of the char at specific i;

		for (int i = 0; i < 26; i++) {
			if (count[i] > 0) {
				System.out.println(count[i] + " " + (char) (i + 'a'));

			}
		}
	}

}
