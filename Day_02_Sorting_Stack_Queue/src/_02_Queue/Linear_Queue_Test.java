/**
* @Developer : Sagar_Pokale
* 28-Oct-2022 6:39:34 PM
**/

package _02_Queue;

import java.util.Scanner;

public class Linear_Queue_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearQueue q = new LinearQueue(5);
		int choice, value;
		do {
			System.out.print("\n1. push\n2. pop\n3. peek\nenter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if(!q.isFull()) {
				 System.out.println("Enter the Element you want to add : ");
				 value = sc.nextInt();
				 q.push(value);
				}
				else {
					System.out.println("Linear Queue Is full ");
				}
				break;

			case 2: 
				if(!q.isEmpty()) {
					value = q.pop();
					System.out.println("Popped : "+value);
				}
				else {
					System.out.println("Linear Queue is Empty ");
				}
				
				break;
			case 3:
				if(!q.isEmpty()) {
					value = q.peek();
					System.out.println("Peek : "+value);
				}	
				break;
				
			default:
				break;
			}
			sc.close();
		}while(choice != 0);
			
		
		

		
		
	}
}
