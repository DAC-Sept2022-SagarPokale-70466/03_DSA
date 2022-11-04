/**
* @Developer : Sagar_Pokale
* 04-Nov-2022 2:31:01 PM
**/

package Vehicle_Tree;

import java.util.Scanner;

import Vehicle_DCLL.LinkedList;
import Vehicle_DCLL.ListEmptyException;
import Vehicle_DCLL.Vehicle;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehicle_Binary_Search_Tree list = new Vehicle_Binary_Search_Tree();
		Vehicle_Tree v;
		int choice;
		do {
			System.out.println("---------------------------------------------------------");
			System.out.println(
					"Enter your choice\n 0.Exit\n "
					+ "1. Add Last Vehicle object in to the Tree \n "
					+ "2. Add Another Vehicle object in to the Tree\n "
					+ "3. Delete a Vehicle object from the Tree\n "
					+ "4. Search Vehicle by No\n "
					+ "5. Print all Vehicle details (InOrder )\n "
					+ "6. Print Vehicle list in  (PostOrder\n "
					+ "7. Sort Vehicle List by price");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Exited : ) ");
				break;
			case 1:
				try {
					v = addVehicle(sc);
					list.addNode(v);
					System.out.println("Vehicel Node Added : ) ");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 2:
				v  = addFirstVehicle(sc);
				list.addNode(v);
				System.out.println("Another Vehicle added ");
				break;

			case 3:
				try {
					System.out.println("Enter the Vehicle No. You want to delete : ");
					list.deleteVehicle(sc.nextInt());
				} catch (Exception e) {
				}
				break;
			case 4:// 4. Search Vehicle by No\
				try {
					System.out.println("Enter the no you want to find");
					list.find(sc.nextInt());
				} catch (ListEmptyException e) {
					System.out.println(e.getMsg());
				}
				break;

			case 5:
				list.inOrder();
				break;

			case 6:
				list.preOrder();
				break;

			case 7:
				list.preOrder();
				break;
			case 8:
				System.out.println("Sorted successfully");
				break;
			}
		} while (choice != 0);
	}

	private static Vehicle_Tree addVehicle(Scanner sc) {
//			System.out.println("Enter Details");
//			System.out.println("Company: ");
//			String company = sc.next();
//			System.out.println("Model: ");
//			String model = sc.next();
//			System.out.println("Type: ");
//			String type = sc.next();
//			System.out.println("Price: ");
//			double price = sc.nextDouble();
//			System.out.println("No: ");
//			int no = sc.nextInt();
//			System.out.println("Color: ");
//			String color = sc.next();		
//	        return new Vehicle_Tree(company, model, type, price, no, color);
//			System.out.println("Success");
		return new Vehicle_Tree("TATA", "XUV 700", "SUV", 999, 101, "Red");
	}

	private static Vehicle_Tree addFirstVehicle(Scanner sc) {
		System.out.println("Success");
		return new Vehicle_Tree("Mahindra", "Thar", "SUV", 1000, 201, "Black");
	}

}
