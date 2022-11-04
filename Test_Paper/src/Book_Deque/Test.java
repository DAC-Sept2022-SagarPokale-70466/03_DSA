/**
* @Developer : Sagar_Pokale
* 04-Nov-2022 10:59:26 PM
**/

package Book_Deque;

import java.util.Queue;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack s = null;
		System.out.println("Enter size of Stack : ");
		s = new Stack(sc.nextInt());
		int choice;
		do {
			choice = util.menu(sc);
			switch (choice) {
			case 1:// 1. Push
				s.push(sc);
				break;
			case 2:// 2. Pop
				s.pop();
				break;
			case 3:// 3. Peek
				s.peek();
				break;
			}
		} while (choice != 0);
		sc.close();
	}

}