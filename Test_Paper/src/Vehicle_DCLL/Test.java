/**
* @Developer : Sagar_Pokale
* 03-Nov-2022 4:59:02 PM
**/

package Vehicle_DCLL;

import java.util.Scanner;

public class Test {

	public static void main(String[] args){ 

		Scanner sc = new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		int choice;
		do {
			System.out.println("---------------------------------------------------------");
			System.out.println(
					"Enter your choice\n 0.Exit\n 1.Add Last Vehicle object in to the list\n 2.add Fisrt Vehicle object in to the list\n 3.delete Last Vehicle object from the list\n 4.delete First Vehicle object from the list\n 5.search Vehicle by No\n 6.print all Vehicle details\n 7.print Vehicle list in reverse order\n 8.Sort Vehicle List by price");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				break;
			case 1:
				Vehicle v = addVehicle(sc);
				l1.addNodeAtLastPosition(v);
				break;

			case 2:
				v = addFirstVehicle(sc);
				l1.addNodeAtFirstPosition(v);
				break;

			case 3:
				try {
				l1.deleteNodeAtLastPosition();
				System.out.println("Last postition Vehical deleted successfully");
				}catch(ListEmptyException e) {
					System.out.println(e.getMsg());
				}
				break;
			case 4:
				try {
				l1.deleteNodeAtFirstPosition();
				System.out.println("First postition Vehical deleted successfully");
				} catch (ListEmptyException e) {
					System.out.println(e.getMsg());
				}
				break;

			case 5:
				
				System.out.println("Enter no.");
				int number = sc.nextInt();
				l1.searchByNo(number);
				break;

			case 6:
				System.out.println("Vehicle List");
				l1.displayLinkedList();
				System.out.println();
				break;

			case 7:
				System.out.println("Reverse List ");
				l1.reversedLinkedList();
				break;
			case 8:
				l1.sortByPrice();
				System.out.println("Sorted successfully");
				break;
			}
		} while (choice != 0);
	}

	private static Vehicle addFirstVehicle(Scanner sc) {
		System.out.println("Success");
		return new Vehicle("Mahindra", "Thar", "SUV", 1000, 201, "Black");
	}

	private static Vehicle addVehicle(Scanner sc) {
//		System.out.println("Enter Details");
//		System.out.println("Company: ");
//		String company = sc.next();
//		System.out.println("Model: ");
//		String model = sc.next();
//		System.out.println("Type: ");
//		String type = sc.next();
//		System.out.println("Price: ");
//		double price = sc.nextDouble();
//		System.out.println("No: ");
//		int no = sc.nextInt();
//		System.out.println("Color: ");
//		String color = sc.next();		
//        return new Vehicle(company, model, type, price, no, color);
		System.out.println("Success");
		return new Vehicle("TATA", "XUV 700", "SUV", 999, 101, "Red");
	}

}
