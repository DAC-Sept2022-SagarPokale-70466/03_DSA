/**
* @Developer : Sagar_Pokale
* 31-Oct-2022 11:40:19 PM
**/

package Important;
public class Prime_Factors {
	public static void main(String[] args) {

		printPrimeFactors(2, 88);
	}
	public static void printPrimeFactors(int prime, int num) {
		if(num == 1)
			return;
		if(num % prime == 0) {
			System.out.println(prime);
			printPrimeFactors(prime, num/ prime);
		}
		else
			printPrimeFactors(prime+1, num);
	}

}
