/**
* @Developer : Sagar_Pokale
* 02-Nov-2022 3:00:14 PM
**/

package Binary_Search_Tree;

import java.util.Scanner;

import Binary_Search_Tree.Binary_Search_Tree.Node;

public class BST_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Binary_Search_Tree t = new Binary_Search_Tree();

		t.addNodeRecursive(50);
		t.addNodeRecursive(25);
		t.addNodeRecursive(15);
		t.addNodeRecursive(75);
		t.addNodeRecursive(90);
		t.addNodeRecursive(35);
		t.addNodeRecursive(85);

//		t.addNodeIterative(50);
//		t.addNodeIterative(25);
//		t.addNodeIterative(15);
//		t.addNodeIterative(75);
//		t.addNodeIterative(90);
//		t.addNodeIterative(35);
//		t.addNodeIterative(85);

//		t.preOrder();
//		t.preorderNonRec();
//		 t.inorder();
//		 t.postorder();
		
//		while(true) {
//		System.out.println("emter");
//		Node[]   array= t.findWithParent(sc.nextInt());
//		
//		System.out.println("child " + array[0].getData() + " Parent = "+array[1].getData());
//		}
		
		
		while (true) {
			System.out.println("\nEnter element to find: ");
			int val = sc.nextInt();
			Node temp = t.find(val);
			if (temp == null)
				System.out.println("Not Found");
			else
				System.out.println("Found: " + temp.getData());
		}
	}

}
