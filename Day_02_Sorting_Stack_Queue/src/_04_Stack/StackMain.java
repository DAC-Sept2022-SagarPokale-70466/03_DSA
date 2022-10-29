/**
* @Developer : Sagar_Pokale
* 28-Oct-2022 10:03:27 PM
**/

package _04_Stack;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MyStack s = new MyStack(5);
		int choice, value;
		do {
			System.out.print("\n1. push\n2. pop\n3. peek\nenter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if(!s.isFull()) {
				 System.out.println("Enter the Element you want to add : ");
				 value = sc.nextInt();
				 s.push(value);
				}
				else {
					System.out.println("Linear Queue Is full ");
				}
				break;

			case 2: 
				if(!s.isEmpty()) {
					value = s.pop();
					System.out.println("Popped : "+value);
				}
				else {
					System.out.println("Linear Queue is Empty ");
				}
				
				break;
			case 3:
				if(!s.isEmpty()) {
					value = s.peek();
					System.out.println("Peek : "+value);
				}	
				break;
				
			default:
				break;
			}
		}while(choice != 0);

		
		
	}

}
