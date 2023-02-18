/**
* @Developer : Sagar_Pokale
* 15-Dec-2022 11:04:59 PM
**/

package _09_Sum_Of_First__n_No;

public class Sum_Of_First_n_no {

	public static void main(String[] args) {

		System.out.println(sum(4));

	}

//	Direct Formula =  n * (n + 1) / 2
	private static int sum(int i) {

		if (i == 0)
			return 0;

		return i + sum(i - 1);
	}
}
