/**
* @Developer : Sagar_Pokale
* 03-Nov-2022 5:00:26 PM
**/

package Vehicle_DCLL;

public class LinkedList {

	static class Node {
		private Vehicle vehicle;
		private Node next;
		private Node prev;

		public Node(Vehicle vehicle) {
			this.vehicle = vehicle;
			this.next = null;
			this.prev = null;
		}
	}

	private Node head;
//	private Node tail;

	public LinkedList() {
		this.head = null;
	}

	public void addNodeAtLastPosition(Vehicle v) {
		Node nn = new Node(v);
		Node trav = head;
		if (head == null) {
			head = nn;
			nn.next = nn.prev = head;
		} else {
			Node tail = head.prev;
			nn.prev = tail;
			nn.next = head;
			head.prev = nn;
			tail.next = nn;
		}
	}

	public void addNodeAtFirstPosition(Vehicle v) {
		Node nn = new Node(v);
		if (head == null) {
			head = nn;
			nn.next = nn.prev = nn;
		} else {
			Node tail = head.prev;
			nn.prev = head.prev;
			nn.next = head;
			head.prev = nn;
			tail.next = nn;
			head = nn;
		}
	}

	private boolean isEmpty() {
		return head == null;
	}

	public void deleteNodeAtLastPosition() throws ListEmptyException {
		if (!isEmpty()) {
			if (head == head.next)
				head = null;
			else {
				Node last = head.prev;
				last.prev.next = last.next;
				head.prev = last.prev;
			}
		} else {
			throw new ListEmptyException("Error in Delete Last");
		}
	}

	public void deleteNodeAtFirstPosition() throws ListEmptyException {
		if (!isEmpty()) {
		if (head == head.next)
			head = null;
		else {
			Node last = head.prev;
			head = head.next;
			head.prev = last;
			last.next = head;
		}
		}
		else {
			throw new ListEmptyException("Error in Delete First");
		}
	}

	public void searchByNo(int number) {
		Node trav = head;
		if (trav.vehicle.getNo() == number)
			System.out.println(trav.vehicle.toString());
		else {
			do {
				if (trav.vehicle.getNo() == number) {
					System.out.println(trav.vehicle.toString());
					break;
				}
				trav = trav.next;
			} while (trav != head);
		}

		System.out.println("Not Found");
	}

	public void displayLinkedList() {
		if (!isEmpty()) {
			Node trav = head;
			do {
				System.out.println(trav.vehicle.toString());
				trav = trav.next;
			} while (trav != head);
		} else
			System.out.println("LinkedList is Empty ");
	}

	public void reversedLinkedList() {
		if (!isEmpty()) {
			Node trav = head.prev;
			do {
				System.out.println(trav.vehicle.toString());
				trav = trav.prev;
			} while (trav != head.prev);
		}
	}

	public void sortByPrice() {
		if (head == null)
			System.out.println("Empty List");
		else {
			Node trav = head, index = null;
			Vehicle temp;
			do {
				index = trav.next;
				while (index != head) {
					if (trav.vehicle.getPrice() > index.vehicle.getPrice()) {
						temp = trav.vehicle;
						trav.vehicle = index.vehicle;
						index.vehicle = temp;
					}
					index = index.next;
				}
				trav = trav.next;
			} while (trav != head);

		}
		displayLinkedList();

	}

}
