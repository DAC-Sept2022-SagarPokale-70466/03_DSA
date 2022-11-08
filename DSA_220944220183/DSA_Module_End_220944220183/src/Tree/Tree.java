package Tree;

import java.util.Scanner;

import User_Expection.ListEmptyException;

public class Tree {

//	============================================

	static class Node {
		private double value;
		private Node left;
		private Node right;

		public Node() {
			left = null;
			right = null;
		}

		public Node(double value) {
			this.value = value;
			left = null;
			right = null;
		}
	}

//	=============================================

	private Node root;
	int count;

	public Tree() {
		root = null;
		count = 0;
	}

	public boolean isEmpty() {
		return root == null;
	}

//==============================================	

	public void addNode(double value) {
		if (root == null) {
			root = new Node(value);
			count++;
		} else
			addNode(root, value);
	}

	public void addNode(Node trav, double value) {

		double findMax = Double.max(trav.value, value);
		double findMin = Double.min(trav.value, value);

		System.out.println(" max" + findMax);
		System.out.println("Min = " + findMin);

		if (findMin < trav.value) {
			if (trav.left == null) {
				trav.left = new Node(value);
				count++;
				return;
			} else
				addNode(trav.left, value);
		}

		else if (findMax >= trav.value) {
			if (trav.right == null) {
				trav.right = new Node(value);
				count++;
				return;
			} else {
				addNode(trav.right, value);
			}
		}
	}

//	============================================

	public void preOrder() {
		if (!isEmpty()) {
			preOrder(root);
		} else {
			System.out.println("Tree is Empty");
		}
	}

	public void preOrder(Node trav) {
		if (trav == null)
			return;
		System.out.print(trav.value + " ");
		postOrder(trav.left);
		postOrder(trav.right);

	}

//-------------------------------------------------------------------------------

	public void postOrder() {
		if (!isEmpty()) {
			postOrder(root);
		}
	}

	public void postOrder(Node trav) {
		if (trav == null)
			return;
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(trav.value + " ");
	}

//	-------------------------------------------------------------------------------

	public void inOrder() {
		if (!isEmpty()) {
			inOrder(root);
		}
	}

	public void inOrder(Node trav) {
		if (trav == null)
			return;
		postOrder(trav.left);
		System.out.print(trav.value + " ");
		postOrder(trav.right);
	}

//===================================================

	public void checkAncestor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Child and 2nd Parent");
		double child = sc.nextDouble();
		double parent = sc.nextDouble();

		Node[] arr = findParent(child);
		
		System.out.println(arr[1] + "parent");
		
		if (arr[1].value == parent) {
			System.out.println(parent + " is Parent of  " + child);
		} else
			System.out.println(parent + " is NOT Parent of  " + child);
	}

	public Node[] findParent(double key) {
		Node trav = root, parent = null;
		while (trav != null) {
			if (trav.value == key)
				break;
			parent = trav;
			if (key < trav.value) {
				trav = trav.left;
			} else {
				trav = trav.right;
			}
		}
		if (trav == null)
			parent = null;
		return new Node[] { trav, parent };
	}

//	=====================================================

	public void find(Node trav, double value) {
		if (trav == null)
		{
			System.out.println("NOT FOUND ");
			return;
		}
		if (value == trav.value) {
			System.out.println("Foud " + trav.value);
			return;
		}
		if (value < trav.value)
			find(trav.left, value);
		else
			find(trav.right, value);
	}

	public void find (double key) {
		find(root, key);
		
	}

//=================================================

	public void calLeafNode() {
		printLeafNodes(root);
	}

	int countLead = 0;

	public void printLeafNodes(Node root) {

		if (root == null)
			return;
		// If node is leaf node, print its data
		if (root.left == null && root.right == null) {
			System.out.print(root.value + " ");
			countLead++;
			return;
		}

		if (root.left != null)
			printLeafNodes(root.left);

		if (root.right != null)

			printLeafNodes(root.right);
	}

	public void print() {
		System.out.print(countLead + " ");
	}
}