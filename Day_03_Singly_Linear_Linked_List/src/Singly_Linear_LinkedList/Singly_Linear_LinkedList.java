/**
* @Developer : Sagar_Pokale
* 31-Oct-2022 2:15:52 PM
**/

package Singly_Linear_LinkedList;

public class Singly_Linear_LinkedList {

	public static void main(String[] args) {
		
		SinglyLinearList list = new SinglyLinearList();
		
		list.addNode(11);
		list.addNode(201);
		list.addLast(66);
		list.addNode(22);
//		list.addNode(33);
		list.addNode(44);
		list.addFirst(101);
		list.addNode(55);
		list.addPos(33, 11);
		
		list.display();
		
//		list.deleteLast();
		
//		list.deletePos(5);
		
		System.out.println("\nNew LIst");
		
		list.display();
	}
}