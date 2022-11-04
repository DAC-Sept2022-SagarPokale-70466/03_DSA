/**
* @Developer : Sagar_Pokale
* 03-Nov-2022 2:58:52 PM
**/

package Binary_Search_Tree;

import Binary_Search_Tree.BinarySearchTree.Node;

public class Binary_Test {

	public static void main(String[] args) {

		BinarySearchTree t = new BinarySearchTree();
		t.add(50);
		t.add(30);
		t.add(90);
		t.add(10);
		t.add(40);
		t.add(70);
		t.add(100);
		t.add(35);
		t.add(60);
		t.add(80);
		t.add(65);
		
		t.preorder();
		
//		Node[] arr  = t.findWithParent(35);
//		if(arr[0] != null)
//			System.out.println("Node found  = "+ arr[0].getData());
//		else
//			System.out.println("Node Not Found ");
//		
//		if(arr[1] != null)
//			System.out.println("Parent Found "+arr[1].getData());
		
		
//		Node[] arr = t.findWithParent(35);
//		Node temp = arr[0], parent = arr[1];
//		if(temp != null)
//			System.out.println("\n\nNode Found: " + temp.getData());
//		else
//			System.out.println("Node Not Found.");
//		if(parent != null)
//			System.out.println("Parent Found: " + parent.getData());

		
		
		t.delete(80);
		System.out.println("\n\nAfter Deleting");
		t.preorder();
		
	}
}
