/**
* @Developer : Sagar_Pokale
* 02-Nov-2022 3:00:37 PM
**/

package Binary_Search_Tree;

import java.util.Stack;

public class Binary_Search_Tree {

//	=========================================

	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node() {
			setData(0);
			left = null;
			right = null;
		}

		public Node(int value) {
			setData(value);
			left = null;
			right = null;
		}

//		=========================================

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
	}

	private Node root;

	public Binary_Search_Tree() {
		root = null;
	}

//	================================================

	public void addNodeIterative(int value) {
		Node nn = new Node(value);

		if (root == null)
			root = nn;

		else {
			Node trav = root;
			while (true) {
				if (value < trav.getData()) {
					if (trav.left != null)
						trav = trav.left;
					else {
						trav.left = nn;
						break;
					}
				} else {
					if (trav.right == null) {
						trav.right = nn;
						break;
					} else
						trav = trav.right;
				}
			}
		}
	}

	public void addNodeRecursive(int value) {
		if (root == null)
			root = new Node(value);
		else
			addNodeRecursive(root, value);
	}

	public void addNodeRecursive(Node trav, int value) {

		if (value < trav.getData()) {
			if (trav.left == null) {
				trav.left = new Node(value);
				return;
			} else
				addNodeRecursive(trav.left, value);
		} else {
			if (trav.right != null)
				addNodeRecursive(trav.right, value);
			else {
				trav.right = new Node(value);
			}
		}
	}

//	======================================================

	public Node[] findWithParent(int key) {
		Node trav = root, parent = null;
		Stack<Node> s = new Stack<>();

		if (trav.data == key)
			return new Node[] { trav, null };

		while (trav != null) {
			if (key < trav.data) {
				s.add(trav);
				trav = trav.left;
				if (trav != null) {
					if (trav.data == key) {
						return new Node[] { trav, s.pop() };
					}
				}
			} else {
				if (key > trav.data) {
					s.add(trav);
					trav = trav.right;
				}
				if (trav != null) {
					if (trav.data == key)
						return new Node[] { trav, s.pop() };
				}
			}
		}
		return new Node[] { trav, parent };

	}

//	=======================================================

	// Iterative Approach

	public Node find(int value) {
		Node trav = root;
		if (value == trav.data)
			return trav;
		else {
			while (trav != null) {
				if (value < trav.data) {
					trav = trav.left;
					if (trav != null) {
						if (trav.data == value)
							return trav;
					}
				} else {
					if (value > trav.data)
						trav = trav.right;
					if (trav != null) {
						if (trav.data == value)
							return trav;
					}
				}
			}
		}
		System.out.println("Returning Null");
		return null;
	}

//	 Recursive Approach

//	public Node find(int value) {
//
//		return find(root, value);
//	}

	public Node find(Node trav, int value) {
		if (trav == null)
			return null;
		if (trav != null) {
			if (trav.data == value) {
				System.out.println("Inside ");
				return trav;
			}
		}
		Node temp;
		if (value < trav.data) {
			System.out.println("Left traverse");
			temp = find(trav.left, value);
		} else {
			System.out.println("Right traverse");
			temp = find(trav.right, value);
		}

		return temp;
	}

//	====================================================

	public void preOrder() {
		System.out.print("PreOrder : ");
		preOrder(root);
	}

	public void preOrder(Node trav) {
		if (trav == null)
			return;
		System.out.print(trav.getData() + " ");
		preOrder(trav.left);
		preOrder(trav.right);
	}

	public void preorderNonRec() {
		System.out.print("PRE : 	");
		Stack<Node> s = new Stack<>();
		Node trav = root;
		while (trav != null || !s.isEmpty()) {
			while (trav != null) {
				System.out.println(trav.data + " , "); // Printing Parent
				if (trav.right != null) { // If trav have right element push to stack
					s.add(trav.right);
					System.out.println("Adding on to the stack");
				}
				trav = trav.left;
			} // Exit the loop when trav.left is null
			if (!s.isEmpty()) {
				trav = s.pop(); // In this it will pop the element and continue toward left side
			}

		}
	}

//	================================================================

	public void postorder(Node trav) {
		if (trav == null)
			return;
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(trav.data + ", ");
	}

	public void postorder() {
		System.out.print("POST: ");
		postorder(root);
		System.out.println();
	}

//	========================================================

	public void inorder(Node trav) {
		if (trav == null)
			return;
		inorder(trav.left);
		System.out.print(trav.data + ", ");
		inorder(trav.right);
	}

	public void inorder() {
		System.out.print("IN  : ");
		inorder(root);
		System.out.println();
	}

//	==========================================================
}
