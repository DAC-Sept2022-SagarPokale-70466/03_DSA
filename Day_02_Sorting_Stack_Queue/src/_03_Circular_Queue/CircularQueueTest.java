/**
* @Developer : Sagar_Pokale
* 28-Oct-2022 9:42:50 PM
**/

package _03_Circular_Queue;

import java.util.Scanner;

import _02_Queue.LinearQueue;

public class CircularQueueTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CircularQueue c = new CircularQueue(5);
		int choice, value;
		do {
			System.out.print("\n1. push\n2. pop\n3. peek\nenter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if(!c.isFull()) {
				 System.out.println("Enter the Element you want to add : ");
				 value = sc.nextInt();
				 c.push(value);
				}
				else {
					System.out.println("Linear Queue Is full ");
				}
				break;

			case 2: 
				if(!c.isEmpty()) {
					value = c.pop();
					System.out.println("Popped : "+value);
				}
				else {
					System.out.println("Linear Queue is Empty ");
				}
				
				break;
			case 3:
				if(!c.isEmpty()) {
					value = c.peek();
					System.out.println("Peek : "+value);
				}	
				break;
				
			default:
				break;
			}
		}while(choice != 0);
			

		
		
	}
}
