/**
* @Developer : Sagar_Pokale
* 31-Oct-2022 11:36:11 PM
**/

package Day_02;
public class Print_01_to_10_Recusion2 {

	public static void main(String[] args) {

		print(1, 10);
	}
	public static void print(int n , int max) {
		if(n > max)
		return;
		System.out.println(n);
		print(n+1, max);// if you just interchange the 16 and 17 line you will get the reverse result. 		
	}
}