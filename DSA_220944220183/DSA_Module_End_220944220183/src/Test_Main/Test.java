package Test_Main;

import java.util.Scanner;

import Tree.Tree;

public class Test {

//	1. Search user entered node in tree.
//	2. Preorder recursive
//	3. Postorder recursive
//	4. Check if ancestor (Input two values from user. Check if first is ancestor of second. boolean isAncestor(v1, v2);).
//	5. Count the number of leaf nodes in the tree (int countLeafNodes()).
//
//	Input : 50.5 20.2 30.2 40.4 10.1 60.6 70.7 80.8 90.9 100.10
//	
//		45.2 20.3 10.9 70.5 85.6 35.3 55.1 5.8 25.3 40.2 65.8	

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tree list = new Tree();
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Welcome : )  \n");
//		1.1 2.2 3.3 4.4 5.5 6.6
		System.out.println("Enter the Double value array you want to add to tree : ) ");
		System.out.println("But First Enter the Array SIZE; ");
		int SIZE = sc.nextInt();

		double[] arr = new double[SIZE];
		System.out.println("Now Enter the double value");
		
		for (int i = 0; i < SIZE; i++) {
			arr[i] = sc.nextDouble();
		}
		System.out.println("Now For Operation ");
		int choice;
		do {
			choice = Util.menu(sc);
			switch (choice) {
			case 0: // Enter into Tree
				System.out.println("-----------------------Pushing Value to the Tree-------------------");
				int i = 0;
				while (i < SIZE) {
					list.addNode(arr[i]);
					i++;
				}
				System.out.println("\n-------------------All Value Pushed to the Tree-----------------------");
				break;

			case 1: // 1. Search user entered node in tree.
				System.out.println("\nEnter the double value you want to find");
				list.find(sc.nextDouble());
				break;

			case 2:// 2. Preorder recursive
				System.out.println("PreOrder of the Tree is : ");
				list.preOrder();
				break;

			case 3:// 3. Postorder recursive
				System.out.println("PostOrder of the Tree is : ");
				list.postOrder();
				break;

			case 4:// 4. Check if ancestor (Input two values from user. Check if first is ancestor
					// of second. boolean isAncestor(v1, v2);).
				System.out.println();
				list.checkAncestor();
				break;

			case 5:// 5. Count the number of leaf nodes in the tree (int countLeafNodes()).
				list.calLeafNode();
				System.out.print("Left Node are : ");
				list.print();
				break;

			case 6:
				System.out.println();
				list.inOrder();
				
				break;
			default:
				System.out.println("Enter the valid choice ");
			}
		} while (choice != 10);
	}
}
