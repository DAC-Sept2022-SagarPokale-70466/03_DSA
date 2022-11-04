/**
* @Developer : Sagar_Pokale
* 04-Nov-2022 11:15:50 PM
**/

package Book_Deque;

import java.util.Scanner;

public class Stack {
	
	private Deque stack;
	private int SIZE;
	
	public Stack(int size) {
		stack = new Deque();
		SIZE= size;
	}
	
	public void push(Scanner sc) 
	{
		if(!stack.isFull(SIZE)) {
			Book b = util.acceptBook(sc);
			stack.addLast(b);
		}else {
			System.out.println("Stack is full");
		}
	}
	
	public void pop() {
		if(!stack.isEmpty()) {
			stack.deleteFirst();
		}
		else {
			System.out.println("Stack is Empty");
		}
	}
	
	public void peek() {
		if (!stack.isEmpty()) {
			stack.display();
		} else
		System.out.println("Stack Underflow");
	}

}
