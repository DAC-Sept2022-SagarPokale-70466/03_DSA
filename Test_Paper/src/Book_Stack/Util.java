/**
* @Developer : Sagar_Pokale
* 03-Nov-2022 11:31:05 PM
**/

package Book_Stack;

import java.util.Scanner;

public class Util {
	public static Book acceptBook() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		String name = sc.next();
		System.out.print("Enter author : ");
		String author = sc.next();
		System.out.print("Enter pages : ");
		int pages = sc.nextInt();
		System.out.print("Enter price : ");
		double price = sc.nextDouble();
		Book book = new Book(name, author, pages, price);
		sc.close();
		return book;
	}

	public static int menuList(Scanner sc) {
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Top");
		return sc.nextInt();
	}

}
