/**
* @Developer : Sagar_Pokale
* 04-Nov-2022 11:02:07 PM
**/

package Book_Deque;

public class Deque {
	static class Node {
		private Book book;
		private Node prev;
		private Node next;

		public Node(Book book) {
			this.book = book;
			this.prev = null;
			this.next = null;
		}
	}

	private Node head;
	private Node tail;
	private int count;

	public Deque() {
		head = null;
		tail = null;
		count = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public boolean isFull(int size) {
		return count == size;
	}

	public void addFirst(Book b) {
		Node nn = new Node(b);

		if (isEmpty()) {
			head = nn;
			tail = nn;
			count++;
		} else {
			nn.next = head;
			head.prev = nn;
			head = nn;
			count++;
		}
	}

	public void addLast(Book b) {
		Node nn = new Node(b);

		if (isEmpty()) {
			head = nn;
			tail = nn;
			count++;
		} else {
			nn.prev = tail;
			tail.next = nn;
			tail = nn;
			count++;
		}
	}

	public void deleteFirst() {
		if (isEmpty()) {
			return;
		} else if (head.next == null) {
			head = null;
			tail = null;
			count--;
		} else {
			head = head.next;
			head.prev = null;
			count--;
		}
	}

	public void display() {
		System.out.println(head.book.toString());
	}
}
