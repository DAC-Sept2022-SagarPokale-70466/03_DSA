/**
* @Developer : Sagar_Pokale
* 01-Nov-2022 3:45:58 PM
**/

package Doubly_Linear_Linked_List;

public class DoublyLinearLinkedList {

	static class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node() {
			data = 0;
			next = null;
			prev = null;
		}

		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}

	private Node head;

	public DoublyLinearLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addLast(int value) {
		Node nn = new Node(value);
		if (isEmpty())
			head = nn;
		else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = nn;
			nn.prev = trav;
		}
	}

	public void display() {
		Node trav = head;
		if (!isEmpty()) {
			while (trav != null) {
				System.out.print(trav.data + " ");
				trav = trav.next;
			}
			System.out.println();
			displayBackward();
		}
	}

	public void displayBackward() {
		Node trav = head;
//		while(trav != null) // If we try somthing like this it will access the next element which is null Point
		while (trav.next != null)
			trav = trav.next;
		while (trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.prev;
		}
		System.out.println("\nEND");
	}

	public void addFirst(int value) {
		Node nn = new Node(value);
		if (isEmpty()) {
			head = nn;
		} else {
			nn.next = head;
			head = head.prev = nn;
		}
	}

	public void addAtPos(int value, int pos) {
		Node nn = new Node(value);

		if (pos <= 1 || isEmpty())
			addFirst(value);
		else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
				if (trav.next == null)
					break;
			}

			Node temp = trav.next;
			nn.next = temp;
			nn.prev = trav;
			trav.next = nn;
			if (temp != null) {
				temp.prev = nn;
			}
		}
	}

	public void deleteFirst() {
		if (isEmpty())
			return;
		if (head.next == null)
			head = null;
		else {
			head = head.next;
			head.prev = null;
		}
	}

	public void deleteLast() {
		Node trav = head;
		if (isEmpty())
			return;
		if (head.next == null)
			head = null;
		else {
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.prev.next = null;
		}
	}

	public void deleteAtPos(int pos) {
		if (isEmpty() || pos < 1)
			return;
		if (pos == 1)
			deleteFirst();
		else {
			Node trav = head;
			for (int i = 1; i < pos; i++) {
				trav = trav.next;
				if (trav == null)
					return;
			}
			trav.prev.next = trav.next;
			if (trav.next != null)
				trav.next.prev = trav.prev;
		}
	}
}