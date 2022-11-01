/**
* @Developer : Sagar_Pokale
* 01-Nov-2022 5:49:22 PM
**/

package Doubly_Circular_Linked_List;

import Doubly_Circular_Linked_List.DoublyCircularLinkedList.Node;

public class DoublyCircularLinkedList {

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

	public DoublyCircularLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addLast(int value) {
		Node nn = new Node(value);

		if (isEmpty()) {
			head = nn;
			nn.next = nn.prev = head;
		} else {
			Node last = head.prev;
			last.next = nn;
			nn.prev = last;
			nn.next = head;
			head.prev = nn;
		}
	}

	public void display() {
		Node trav = head;
		if (!isEmpty()) {
			do {
				System.out.print(trav.data + " ");
				trav = trav.next;
			} while (trav != head);
			System.out.println();
//			displayReverse();

			System.out.println("Reverse");
			Node last = head.prev;
			do {
				System.out.print(last.data + " ");
				last = last.prev;
			} while (last != head.prev);
		}
	}

	public void addFirst(int value) {
		Node nn = new Node(value);
		Node last = head.prev;

		nn.next = head;
		nn.prev = last;
		last.next = nn;
		head.prev = nn;
		head = nn;
	}

	public void deleteFirst() {
		Node last = head.prev;
		head = head.next;
		last.next = head;
	}

	public void deleteLast() {
		Node last = head.prev;
		last.prev.next = head;
		head.prev  = last.prev;
		
	}
}
