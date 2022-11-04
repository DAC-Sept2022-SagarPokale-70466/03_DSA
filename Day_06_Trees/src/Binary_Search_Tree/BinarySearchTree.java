/**
* @Developer : Sagar_Pokale
* 03-Nov-2022 2:58:28 PM
**/

package Binary_Search_Tree;

public class BinarySearchTree {

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

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
	}

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void add(int value) {
		if (root == null)
			root = new Node(value);
		add(root, value);
	}

	public void add(Node trav, int value) {

		if (value < trav.getData()) {
			if (trav.left == null) {
				trav.left = new Node(value);
				return;
			} else {
				add(trav.left, value);
			}
		} else {
			if (trav.right != null)
				add(trav.right, value);
			else {
				trav.right = new Node(value);
				return;
			}
		}
	}

	public void preorder() {
		System.out.print("PreOrder : ");
		preorder(root);
	}

	public void preorder(Node trav) {
		if (trav == null)
			return;
		System.out.print(trav.getData() + " ");
		preorder(trav.left);
		preorder(trav.right);
	}

	public Node[] findWithParent(int value) {
		Node trav = root, parent = null;
		while (trav != null) {
			if (trav.getData() == value)
				break;
			parent = trav;
			if (value < trav.getData()) {
				trav = trav.left;
			} else {
				trav = trav.right;
			}
		}
		if (trav == null)
			parent = null;

		return new Node[] { trav, parent };

	}

	public void delete(int value) {
		Node[] arr = findWithParent(value);

		Node temp = arr[0], parent = arr[1];

		if (temp == null)
			return;

		if (temp.left != null && temp.right != null) { // If temp have both node
			// Find inorder succesor alont with the parent
			parent = temp;
			Node succ = temp.right; // New Node succ
			while (succ.left != null) {
				parent = succ;
				succ = succ.left;
			}
			temp.data = succ.data; // Override the temp(root) data with new successor data
			temp = succ; // Delete the successor node
		}

		if (temp.left == null) {
			if (temp == root)
				root = temp.right;
			else if (temp == parent.right)
				parent.right = temp.right;
			else if (temp == parent.left)
				parent.left = temp.right;
		}

		else if (temp.right == null) {
			if (temp == root)
				root = temp.left;
			else if (temp == parent.right)
				parent.right = temp.left;
			else if (temp == parent.left)
				parent.left = temp.left;
		}

	}

}
