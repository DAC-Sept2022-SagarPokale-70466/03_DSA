/**
* @Developer : Sagar_Pokale
* 13-Dec-2022 12:21:54 AM
**/

package _01_Basic;

public class Exercise_01 {

	public static void main(String[] args) {
		func(3);
	}

	private static void func(int i) {
		if (i == 0)
			return;
		System.out.println(i);
		func(i - 1);
		System.out.println(i);
	}
}
