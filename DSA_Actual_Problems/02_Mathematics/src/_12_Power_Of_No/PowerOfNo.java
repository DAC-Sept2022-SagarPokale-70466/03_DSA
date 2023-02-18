/**
* @Developer : Sagar_Pokale
* 10-Jan-2023 6:18:05 AM
**/

package _12_Power_Of_No;

public class PowerOfNo {

	public static void main(String[] args) {

		System.out.println(power(3, 4));
	}

//	if Power(x, n) if n % 2 == 0 (i.e Even)
//		power (x, n / 2) * power (x, n / 2) ;
//	else 
//		power (x, n - 1) * x 

	private static int power(int x, int n) {
		if (n == 0)
			return 1;

		int temp = power(x, n / 2);
		temp = temp * temp;
		if (n % 2 == 0)
			return temp;
		else
			return temp * x;

	}

//	Naive Solution
//	private static int power(int x, int n) {
//		int res = 1;
//		for(int i = 0 ; i < n ; i++)
//		{
//			res = res * x;
//		}
//		return res;
//	}

}
