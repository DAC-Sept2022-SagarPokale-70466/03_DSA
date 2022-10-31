/**
* @Developer : Sagar_Pokale
* 31-Oct-2022 4:53:49 PM
**/

package Important;

import java.util.Scanner;

public class Reverse_Linked_List {

	public static void main(String[] args) {

		SinglyLinearList list = new SinglyLinearList();
		Scanner sc = new Scanner(System.in);
		int choice, val, pos;
		do {
			System.out.println("\n1. Display\n2. Add First\n3. Add Last\n4. Add at Pos\n5. Del First\n6. Del Last\n7. Del at Pos\n8.Del All\n9.Reverse\n10.Mid\n\nEnter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				list.display();
				break;
			case 2:
				System.out.print("Enter element: ");
				val = sc.nextInt();
				list.addFirst(val);
				break;
			case 3:
				System.out.print("Enter element: ");
				val = sc.nextInt();
				list.addLast(val);
				break;
			case 4:
				System.out.print("Enter element: ");
				val = sc.nextInt();
				System.out.print("Enter position: ");
				pos = sc.nextInt();
				list. addPos(val, pos);
				break;
			case 5:
				list.deleteFirst();
				break;
			case 6:
				list.deleteLast();
				break;
			case 7:
				System.out.print("Enter position: ");
				pos = sc.nextInt();
				list.deletePos(pos);
				break;
			case 8:
				list.deleteAll();
				break;
			case 9:
				list.reverse();
				break;
			case 10: 
				int mid = list.findMId();
				System.out.println("Mid = "+mid);
				break;
			}
		}while(choice != 0);
	}

}
