/**
* @Developer : Sagar_Pokale
* 03-Nov-2022 10:23:35 PM
**/

package Book;

import java.util.Scanner;

public class Test {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Stack : ");
		Stack s = new Stack(sc.nextInt());
		int choice;
		do {
			choice = menuList();
			switch (choice) {
			case 0:
				break;
			case 1:
				try {
					s.push(sc);
				} catch (stackFullException e) {
					System.out.println(e.getError());
				}
				break;

			case 2:
				try {
					s.pop();
				}catch(stackEmptyException e) {
					System.out.println(e.getError());
				}
				break;

			case 3:
				try {
					s.peek();
				}catch(stackEmptyException e) {
					System.out.println(e.getError());
				}
				break;
			}

		} while (choice != 0);
	}

	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Top");
		return sc.nextInt();
	}
}
