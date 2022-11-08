/**
* @Developer : Sagar_Pokale
* 03-Nov-2022 10:59:16 PM
**/

package Book_Stack;

@SuppressWarnings("unused")
public class StackUsingDLLL {

	static class Node {
		private Book book;
		private Node next;
		private Node prev;


		public Node(Book book) {
			this.book = book;
			next = null;
			prev = null;
		}
	}

	private Node head;
	private int count_Node;

	public StackUsingDLLL() {
		this.head = null;
		this.count_Node = 0;
	}

	public boolean isFull(int SIZE) {
		return count_Node == SIZE;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addNode(Book b) {
		Node nn = new Node(b);
		if (isEmpty()) {
			head = nn;
			count_Node++;
		} else {
			nn.next = head;
			head.prev = nn;
			head = nn;
			count_Node++;
		}

	}

	public void deleteFirst() {
		if (!isEmpty()) {
			if (head.next == null)
				head = null;
			count_Node--;
		} else {
			head = head.next;
			head.next= null;
			count_Node--;
		}
	}

	public void display() {
		System.out.println(head.book.toString());
		System.out.println(count_Node);
	}

}
