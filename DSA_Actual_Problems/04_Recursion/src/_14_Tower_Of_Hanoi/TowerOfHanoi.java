/**
* @Developer : Sagar_Pokale
* 20-Dec-2022 6:53:19 AM
**/

package _14_Tower_Of_Hanoi;

public class TowerOfHanoi {

	public static void main(String[] args) {

		char A = 'A';
		char B = 'B';
		char C = 'C';
//		towerOfHanoi(2, A, B, C);

		TOH(3, A, B, C);
	}

	private static void towerOfHanoi(int i, char a, char b, char c) {

		if (i == 1) {
			System.out.println("Move 1 From " + a + " to " + c);
			return;
		}
		towerOfHanoi(i - 1, a, c, b);
		System.out.println("Move 1 From " + a + " to " + c);
		towerOfHanoi(i - 1, c, a, b);
	}

	private static void TOH(int i, char a, char b, char c) {

		if (i == 1) {
			System.out.println("Move 1 from " + a + " to " + c);
			return;
		}
		TOH(i - 1, a, c, b);
		System.out.println("Move 1 from "+a+" to "+c);
		TOH(i -1, b, a, c);
	}
}
