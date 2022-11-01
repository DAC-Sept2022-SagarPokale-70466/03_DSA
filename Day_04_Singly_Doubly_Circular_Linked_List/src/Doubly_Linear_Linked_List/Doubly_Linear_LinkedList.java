/**
* @Developer : Sagar_Pokale
* 01-Nov-2022 3:44:53 PM
**/

package Doubly_Linear_Linked_List;
public class Doubly_Linear_LinkedList {

	public static void main(String[] args) {
		DoublyLinearLinkedList list = new DoublyLinearLinkedList();
		list.addLast(11);
		list.addLast(22);
		list.addLast(33);
		list.addLast(44);
		list.addLast(55);
		list.addLast(66);
//		list.addFirst(101);
//		list.addAtPos(101, 10);
		
//		list.deleteLast();
		list.deleteAtPos(2);
		list.display();
		System.out.println("End");
	}

}
