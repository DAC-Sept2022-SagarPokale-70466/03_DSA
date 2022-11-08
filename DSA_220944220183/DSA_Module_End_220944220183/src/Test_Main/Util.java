package Test_Main;

import java.util.Scanner;

public class Util {

	public static int menu(Scanner sc) {
		System.out.println("\n\n\n\n0. Add The Double Value to tree"
										+"\n1. Search user entered node in tree."
										+ "\n2. Preorder recursive"
										+ "\n3. Postorder recursive"
										+ "\n4. Check if ancestor (Input two values from user. Check if first is ancestor of second. boolean isAncestor(v1, v2);)"
										+ "\n5. Count the number of leaf nodes in the tree (int countLeafNodes())."
										);		
		return sc.nextInt();
	}

}
