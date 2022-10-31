/**
* @Developer : Sagar_Pokale
* 31-Oct-2022 11:32:25 PM
**/

package Day_02;
public class Print_10_to_01_Recusion {

	public static void main(String[] args) {
		
	print(10);	
		
		
	}
	public static void print(int n) {
		
		if(n == 0)
		return;
		System.out.println(n);
		print(n - 1);
	}
}
