/**
* @Developer : Sagar_Pokale
* 04-Nov-2022 5:38:38 PM
**/

package Vehicle_HashTable_Chaining;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashTable table = new HashTable();

		Vehicle v = new Vehicle("DFF", "fgfgf", "fgsfgf", 454, 101, "asfdasd");
		table.put(v);
		v = new Vehicle("adfads", "afadsf", "afdadsfgf", 454,401, "asfdasd");
		table.put(v);
		System.out.println("Enter the Vehicle no . you want to find ");
		v = table.get(sc.nextInt());
		System.out.println(v.toString());

	}
}
