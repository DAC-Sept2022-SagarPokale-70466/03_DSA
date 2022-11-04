/**
* @Developer : Sagar_Pokale
* 28-Oct-2022 10:03:35 PM
**/

package _04_Stack;

public class MyStack {

	private final int SIZE;
	private int top;
	private int[] arr;

	public MyStack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}

	public void push(int val) {
		top++;
		arr[top] = val;
	}
	
	public int  pop() {
		return arr[top--];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == SIZE - 1);
	}

}