/**
* @Developer : Sagar_Pokale
* 01-Nov-2022 5:48:41 PM
**/

package Doubly_Circular_Linked_List;

public class Doubly_Circular_LL {
	public static void main(String[] args) {
		DoublyCircularLinkedList list = new DoublyCircularLinkedList();
		list.addLast(11);
		list.addLast(22);
		list.addLast(33);
		list.addLast(44);
		list.addLast(55);
		list.addLast(66);
		list.addFirst(101);
		
		list.deleteLast();
		
		list.display();
		
//		list.display();
		System.out.println("\nend");
	}

}
