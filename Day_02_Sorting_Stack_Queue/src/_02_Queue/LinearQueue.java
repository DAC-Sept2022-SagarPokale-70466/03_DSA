/**
* @Developer : Sagar_Pokale
* 28-Oct-2022 6:40:02 PM
**/

package _02_Queue;

public class LinearQueue {
	private int front;
	private int rear;
	private int[] arr;
	private final int SIZE;

	public LinearQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
	}

	public void push(int value) {
		rear++;
		arr[rear] = value;
	}

	public int pop() {
		front++;
//		return arr[front];
		return arr[front];
	}

	public int peek() {
		return arr[front + 1];
	}

	public boolean isFull() {
		return (rear == SIZE - 1);
	}

	public boolean isEmpty() {
		return (rear == front);
	}
}
