/**
* @Developer : Sagar_Pokale
* 01-Nov-2022 2:24:26 PM
**/

package Singly_Circular_Linked_List;
public class Singly_Circular_LL {
	public static void main(String[] args) {

		SinglyCircularLinkedList list = new SinglyCircularLinkedList();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		
		list.addAtPos(101, 245);
		
		list.deleteAtPos(9);
		
		list.display();
		System.out.println("End");
	}

}
