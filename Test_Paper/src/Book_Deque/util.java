/**
* @Developer : Sagar_Pokale
* 04-Nov-2022 11:18:46 PM
**/

package Book_Deque;

import java.util.Scanner;

public class util {
	public static Book acceptBook(Scanner sc){
//		System.out.print("Enter name : ");
//		String name = sc.next();
//		System.out.print("Enter author : ");
//		String author = sc.next();
//		System.out.print("Enter pages : ");
//		int pages = sc.nextInt();
//		System.out.print("Enter price : ");
//		double price = sc.nextDouble();
//		Book book = new Book(name, author, pages, price);
//		return book;
		
		return new Book("abc","Sagar", 45, 100);
	}

	public static int menu(Scanner sc) {
		System.out.print("\n0. Exit\n" + "1. Push\n" + "2. Pop\n" + "3. Peek\n" + "Enter Choice : ");
		return sc.nextInt();
	}
	
}
