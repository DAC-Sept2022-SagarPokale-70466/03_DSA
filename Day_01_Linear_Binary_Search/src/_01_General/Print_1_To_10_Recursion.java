/**
* @Developer : Sagar_Pokale
* 28-Oct-2022 3:09:29 PM
**/

package _01_General;

public class Print_1_To_10_Recursion {

	public static void main(String[] args) {
// Hello 
		System.out.println("Printing 1  to 10 : ");
		 int status = printForward(10, 1);
//		status = printReverse(10);
		if (status == 1) {
			System.out.println("Success");
		}
	}

	// Printing Reverse Direction
	
	
	public static int printReverse(int num) {
		if (num == 0) {
			return 1;
		}
		System.out.println("Num = "+num);
		return printReverse(num - 1);
	}

	// Printing Forward Direction

	public static int printForward(int num, int start) {
		if (start <= num) {
			System.out.println(start);
			return printForward(num, ++start);
		}
		return 1;
	}
}