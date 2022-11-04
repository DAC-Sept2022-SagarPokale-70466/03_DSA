/**
* @Developer : Sagar_Pokale
* 03-Nov-2022 10:58:57 PM
**/

package Book;

import java.util.Scanner;

public class Stack {

	private StackUsingDLLL stack;
	private final int SIZE;

	public Stack(int nextInt) {
		stack = new StackUsingDLLL();
		this.SIZE = nextInt;
	}

	public void push(Scanner sc) throws stackFullException {
		if (!stack.isFull(SIZE)) {
//			try {
			Book b = Util.acceptBook();
			stack.addNode(b);
//			}catch(Exception  e) {
//				System.err.println("Error in Input value");
//			}
		} else {
			throw new stackFullException("Stack is Full");
		}
	}

	public void pop() throws stackEmptyException {
		if (!stack.isEmpty()) {
			stack.deleteFirst();
		} else {
			throw new stackEmptyException("Stack is Empty");
		}
	}

	public void peek() throws stackEmptyException {
		if (!stack.isEmpty()) {
			stack.display();
		} else {
			throw new stackEmptyException("Stack is Empty");
		}

	}
}
