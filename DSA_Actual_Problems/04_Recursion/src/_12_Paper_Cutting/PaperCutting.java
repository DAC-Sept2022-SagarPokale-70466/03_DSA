/**
* @Developer : Sagar_Pokale
* 15-Dec-2022 11:52:16 PM
**/

package _12_Paper_Cutting;

public class PaperCutting {

	public static void main(String[] args) {

		System.out.println(maxPiece(23, 11, 9, 12));
	}

	private static int maxPiece(int i, int j, int k, int l) {

		if (i == 0)
			return 0;
		if (i < 0)
			return -1;
//																						12										14										11
		int res = Math.max(Math.max(maxPiece(i - j, j, k, l), maxPiece(i - k, j, k, l)), maxPiece(i - l, j, k, l));
		if (res == -1)
			return -1;
		return res + 1;
	}
}
