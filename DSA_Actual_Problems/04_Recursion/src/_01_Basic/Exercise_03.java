/**
* @Developer : Sagar_Pokale
* 14-Dec-2022 6:51:52 AM
**/

package _01_Basic;
public class Exercise_03 {

	public static void main(String[] args) {
		fun(7);
	}

//	This Prints Binary Equivalent of N
	private static void fun(int i) {
		
		if(i == 0)
			return;
		fun(i / 2);
		System.out.println(i %2);
	}
}
