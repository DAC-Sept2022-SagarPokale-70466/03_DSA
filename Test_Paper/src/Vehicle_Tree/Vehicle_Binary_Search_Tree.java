/**
* @Developer : Sagar_Pokale
* 04-Nov-2022 2:30:38 PM
**/

package Vehicle_Tree;

import Vehicle_DCLL.ListEmptyException;

public class Vehicle_Binary_Search_Tree {

//	====================================================
	static class Node {
		private Vehicle_Tree vehicle;
		private Node left;
		private Node right;

		public Node() {
			vehicle = null;
			left = null;
			right = null;
		}

		public Node(Vehicle_Tree v) {
			vehicle = v;
			left = null;
			right = null;
		}
	}

//	=====================================================

	private Node root;

	public Vehicle_Binary_Search_Tree() {
		this.root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

//	=====================================================

	public void addNode(Vehicle_Tree v) {
		if (root == null)
			root = new Node(v);
		addNode(root, v);
	}

	public void addNode(Node trav, Vehicle_Tree v) {
		if (v.getNo() < trav.vehicle.getNo()) {
			if (trav.left == null) {
				trav.left = new Node(v);
				return;
			} else
				addNode(trav.left, v);
		} else {
			if (trav.right != null)
				addNode(trav.right, v);
			else {
				trav.right = new Node(v);
				return;
			}
		}

	}

//	public void addNode(Vehicle_Tree v) {
//		Node nn = new Node(v);
//
//		if (root == null)
//			root = nn;
//
//		else {
//			Node trav = root;
//			while (true) {
//				if (v.getNo() < trav.vehicle.getNo()) {
//					if (trav.left == null) {
//						trav.left = nn;
//						break;
//					} else
//						trav = trav.left;
//				} else // v.getNo() > trav.vehicle.getNo()
//				{
//					if (trav.right == null) {
//						trav.right = nn;
//						break;
//					} else
//						trav = trav.right;
//				}
//			}
//		}
//	}

//	======================================================

	public void deleteVehicle(int key) throws ListEmptyException {

		Node[] arr = findParent(key);

		Node temp = arr[0];
		Node parent = arr[1];

		if (temp.left != null && temp.right != null) {
			parent = temp;
			Node succ = temp.right;
			while (succ.left != null) {
				parent = succ;
				succ = succ.left;
			}
			temp.vehicle = succ.vehicle;
			temp = succ;
		}

		if (temp.left == null) {
			if (temp == root)
				root = temp.right;
			else if (temp == parent.left) {
				parent.left = temp.right;
			} else if (temp == parent.right) {
				parent.right = temp.right;
			}
		}

		else if (temp.right == null) {
			if (temp == root)
				root = temp.left;
			else if (parent.right == temp) {
				parent.right = temp.left;
			} else if (parent.left == temp) {
				parent.left = temp.left;
			}
		}
	}

	public Node[] findParent(int key) {
		Node trav = root, parent = null;
		while (trav != null) {
			if (trav.vehicle.getNo() == key)
				break;
			parent = trav;
			if (key < trav.vehicle.getNo()) {
				trav = trav.left;
			} else {
				trav = trav.right;
			}
		}
		if (trav == null)
			parent = null;
		return new Node[] { trav, parent };
	}

//	===================================================

	public void inOrder() {
		if (root == null)
			return;
		inOrder(root);
	}

	public void inOrder(Node trav) {
		if (trav == null)
			return;

		inOrder(trav.left);
		System.out.println(trav.vehicle.toString());
		inOrder(trav.right);
	}

	public void preOrder() {
		if (root == null)
			return;
		preOrder(root);
	}

	private void preOrder(Node trav) {
		if (trav == null)
			return;
		System.out.println(trav.vehicle.toString());
		inOrder(trav.left);
		inOrder(trav.right);
	}

//	=================================================

	public void find(int key) throws ListEmptyException {
		if (!isEmpty()) {
			Node trav = root;
			while (trav != null) {
				if (key < trav.vehicle.getNo()) {
					if (trav.vehicle.getNo() == key) {
						System.out.println(trav.vehicle.toString());
						break;
					}
					trav = trav.left;
				} else if (trav.vehicle.getNo() == key) {
					System.out.println(trav.vehicle.toString());
					break;
				}
				trav = trav.right;
			}
		} else
			throw new ListEmptyException("List Is Empty");

	}

}