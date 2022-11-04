/**
* @Developer : Sagar_Pokale
* 02-Nov-2022 2:02:23 PM
**/

package Hashing_Separate_Chaining;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HashTableMain {
	public static void main(String[] args) {

		Hashtable ht = new Hashtable();
		ht.put(411037, "A1");
		ht.put(411052, "A2");
		ht.put(411046, "A3");
		ht.put(400027, "A4");
		ht.put(411002, "A5");
		ht.put(411026, "A6");
		ht.put(421037, "A7");
		ht.put(400027, "A9"); // duplicate key
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter pin: ");
			int pin = sc.nextInt();
			String area = ht.get(pin);
			if (area == null)
				System.out.println("Not Found");
			else
				System.out.println("Found: " + area);
		}
	}
}

class Hashtable {

//	================================================

	static class Entry {
		private int key;
		private String value;

		public Entry() {
			key = 0;
			value = "";
		}

		public Entry(int key, String value) {
			this.key = key;
			this.value = value;
		}
	}

//	================================================

	private final int SIZE = 10;
	List<Entry> table[];

	public Hashtable() {
		table = new List[SIZE];
		for (int i = 0; i < table.length; i++) {
			table[i] = new LinkedList<Entry>();
		}
	}

//	=================================================

	public int hash(int key) {
		return key % SIZE;
	}

	public void put(int key, String value) {
		int index = hash(key);
		for (Entry ent : table[index]) {
			if (ent.key == key) {
				ent.value = value; // If Duplicates found it will be override the value with new value
				break;
			}
		}
		Entry ent = new Entry(key, value);
		table[index].add(ent);
	}

	public String get(int key) {
		int index = hash(key);
		for (Entry ent : table[index]) { // Iterating on the index of the table -> because in the index there is a list
			if (ent.key == key)
				return ent.value;
		}
		return null;
	}

}
