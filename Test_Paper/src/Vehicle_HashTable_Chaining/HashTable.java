/**
* @Developer : Sagar_Pokale
* 04-Nov-2022 5:40:07 PM
**/

package Vehicle_HashTable_Chaining;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashTable {

	static class Entry {
		private Vehicle vehicle;
		private int key;
		private int count;

		public Entry(int key, Vehicle vehicel) {
			this.vehicle = vehicel;
			this.key = key;
		}

	}

	private int SIZE = 10;
	private int count = 0;
	List<Entry> table[];
	public HashTable() {
		table = new List[SIZE];
		for(int i = 0; i < table.length; i++) {
			table[i] = new ArrayList<Entry>();
		}
	}

	public boolean isFull() {
		return count == SIZE;
	}

	public int hash(int key) {
		return key % SIZE;
	}

	public void put(Vehicle value) {
		int key = value.getNo();
		int index = hash(key);
		for (Entry ent : table[index]) {
			if (ent.key == key) {
				ent.vehicle = value;
				return;
			}
		}
		Entry ent = new Entry(key, value);
		table[index].add(ent);
		count++;
	}

	public Vehicle get(int key) {
		int index = hash(key);
		for (Entry ent : table[index]) {
			if (ent.key == key) {
				return ent.vehicle;
			}
		}
		return null;
	}
}
