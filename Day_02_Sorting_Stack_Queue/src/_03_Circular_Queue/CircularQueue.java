/**
* @Developer : Sagar_Pokale
* 28-Oct-2022 9:43:05 PM
**/

package _03_Circular_Queue;

public class CircularQueue {
	private int[] arr;
	private int front;
	private int rear;
	private final int SIZE;

	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
	}

	public void push(int num) {
		rear = (rear + 1) % SIZE;
		arr[rear] = num;
	}

	public int pop() {
		front = (front+1) % SIZE;
		int val = arr[front];			// THIS IS REQUIRED OTHERWISE FRONT WILL BECOME -1
		if(front == rear) {
			front = -1;
			rear = -1;
		}
		return val;
		}

	public int peek() {
		int next = (front + 1) % SIZE;
		return arr[next];
	}

	public boolean isFull() {
		return (front == -1 && rear == SIZE - 1) || (rear == front && rear != -1);
				// When no one element is deleted      // when one or more deleted 
	}

	public boolean isEmpty() {
		return (front == rear && rear == -1);
	}
}