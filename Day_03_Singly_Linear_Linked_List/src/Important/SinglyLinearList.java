/**
* @Developer : Sagar_Pokale
* 31-Oct-2022 4:54:47 PM
**/

package Important;

public class SinglyLinearList {
	
//	=====================================================
	
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

//=======================================================

	private Node head;

	public SinglyLinearList() {
		head = null;
	}

	public void reverse() {
		Node oldHead;
		Node newHead;
		oldHead = head;
		newHead = null;

		while (oldHead != null) {
			Node temp = oldHead;
			oldHead = oldHead.next;

			temp.next = newHead;
			newHead = temp;

		}
		while (newHead != null) {
			System.out.print(newHead.data+" ");
			newHead = newHead.next;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		Node trav = head;
		System.out.println();
		while (trav != null) {
			System.out.print(trav.data + " , ");
			trav = trav.next;
		}
	}

	public void addNode(int value) {
		Node nn = new Node(value);
		if (isEmpty())
			head = nn;
		else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = nn; // For Only 2 Node is directly jump to here not going to while
		}
	}

	public int findMId() {
		if (isEmpty())
			return 0;
		Node slow = head, fast = head;
		System.out.println();
		while (fast != null && fast.next != null) {
			
			System.out.println(slow.data +"       "+fast.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public void addFirst(int value) {
		Node nn = new Node(value);
		if (isEmpty()) {
			head = nn;
		} else {
			nn.next = head;
			head = nn;
		}
	}

	public void addLast(int value) {
		Node nn = new Node(value);
		if (isEmpty())
			head = nn;
		else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			trav.next = nn;
		}
	}

	public void addPos(int value, int pos) {
		Node nn = new Node(value);
		if (pos <= 1 || isEmpty())
			addFirst(value);
		else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				if (trav.next == null)
					break;
				trav = trav.next;
			}
			nn.next = trav.next;
			trav.next = nn;
		}
	}

	public void deleteFirst() {
		if (isEmpty())
			return;
		head = head.next;
	}

	public void deleteAll() {
		head = null; // Garbage collector will take care to delete the unreferenced variable
	}

//	public void deleteLast() {
//		Node trav = head, prev = null;
//		while(trav.next != null) {
//			prev = trav;
//			trav = trav.next;
//		}
//		prev.next = null;
//	}

	// Another Method
	public void deleteLast() {
		Node trav = head;
		while (trav.next.next != null)
			trav = trav.next;
		trav.next = null;
	}

	public void deletePos(int pos) {
		if (pos == 1)
			deleteFirst();
		if (pos < 1)
			return;
		if (isEmpty())
			return;
		else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
				if (trav == null)// case 4: if pos beyond count, do nothing
					return;
			}
			trav.next = trav.next.next;
		}
	}
}
