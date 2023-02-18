/**
* @Developer : Sagar_Pokale
* 13-Dec-2022 12:34:08 AM
**/

package _01_Basic;

public class Exercise_02 {
	public static void main(String[] args) {
		fun(3);
	}

	private static void fun(int i) {

		if (i == 0)
			return;

		fun(i - 1);
		System.out.println(i);
		fun(i - 1);

	}

}
