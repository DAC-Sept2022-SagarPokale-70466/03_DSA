/**
* @Developer : Sagar_Pokale
* 01-Nov-2022 2:25:30 PM
**/

package Singly_Circular_Linked_List;

public class SinglyCircularLinkedList {

	static class Node {
		private int data;
		private Node next;

		public Node() {
			data = 0;
			next = null;
		}

		public Node(int value) {
			data = value;
			next = null;
		}

	}

	private Node head;

	public SinglyCircularLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Empty List");
			return;
		}
		Node trav = head;
		do {
			System.out.print(trav.data + " ");
			trav = trav.next;
		} while (trav != head);

		System.out.println(" End ");

	}

	public void add(int value) {
		Node nn = new Node(value);
		if (isEmpty()) {
			head = nn;
			nn.next = head;
		} else {
			Node trav = head;
			while (trav.next != head) { // Here while condition is imp in which it will traverse until head position
				trav = trav.next;
			}
			nn.next = head;
			trav.next = nn;
		}
	}

	public void addFirst(int value) {
		Node nn = new Node(value);
		if (isEmpty()) {
			head = nn;
			nn.next = head;
		} else {
			Node trav = head;
			while (trav.next != head) {
				trav = trav.next;
			}
			nn.next = head;
			trav.next = head = nn;
		}
	}

	public void addAtPos(int value, int pos) {
		Node nn = new Node(value);
		if (pos <= 1 || isEmpty())
			addFirst(value);
		else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				if (trav.next == head)// This will break the loop when traverse is at end of list
					break;
				trav = trav.next;
			}
			nn.next = trav.next;
			trav.next = nn;
		}
	}

	public void deleteFirst() {
		Node trav = head;
		if (isEmpty())
			return;
		if (head.next == head)
			head = null;
		else {
			while (trav.next != head)
				trav = trav.next;
			head = head.next;
			trav.next = head;
		}
	}

	public void deleteLast() {
		Node trav = head;
		if (isEmpty())
			return;
		if (head.next == head)
			head = null;
		else {
			while (trav.next.next != head) {
				trav = trav.next;
			}
			trav.next = head;
		}
	}

	public void deleteAtPos(int pos) {
		Node trav = head;
		if (isEmpty() || pos < 1)
			return;
		if (pos == 1)
			deleteFirst();
		for (int i = 1; i < pos - 1; i++) {
			trav = trav.next;
			if (trav == head)// case 4: if pos beyond count, do nothing
				return;
		}
		trav.next = trav.next.next;
	}

}
