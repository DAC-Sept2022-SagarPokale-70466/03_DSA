/**
`* @Developer : Sagar_Pokale
* 19-Dec-2022 6:25:14 AM
**/

package _15_Josephus_Prb;
public class Josephus_prb {

	public static void main(String[] args) {
		
		System.out.println(josephus(5, 3));

	}

	private static int josephus(int n, int k) {
		
		if(n == 1)
			return 0;
		else
		return (josephus(n -1, k)+ k) % n;
	}
	
//	1St Consider 5,3 which are no. of elements and no tobe killed/jumped
//	2nd Consider4, 3 
//	By this to condition we can say that (4,3) returns 0 which is going to equal to 3 of (5,3)
//	Find relation between 0 (4,3) and 3 (5,3)
//	i.e (0+3) % 5 => 3
//	            k       n
//	(jose(n-1, k)+k) % n

}
