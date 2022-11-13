package com.greatlearning.BSTtoSkewed;

public class TreeOperations {
	public static Node insertNode(Node root, int data) {
		Node temp_node = Node.newNode(data);
		Node x = root;
		Node current_parent = null;

		while (x != null) {
			current_parent = x;
			if (data > current_parent.data) {
				x = current_parent.right;
			} else if (data < current_parent.data) {
				x = current_parent.left;
			} else {
				System.out.println("No duplicate values allowed.");
				return temp_node;
			}
		}

		if (current_parent == null) {
			current_parent = temp_node;
		} else if (data < current_parent.data) {
			current_parent.left = temp_node;
		} else {
			current_parent.right = temp_node;
		}
		return current_parent;
	}

	public static Node insertRightNode(Node root, int data) {
		Node temp_node = Node.newNode(data);
		Node x = root;
		Node current_parent = null;

		while (x != null) {
			current_parent = x;
			x = current_parent.right;
		}
		if (current_parent == null) {
			current_parent = temp_node;
		} else {
			current_parent.right = temp_node;
		}
		return current_parent;
	}

	static Node newRoot = null;

	public static Node inorder(Node root) {
		if (root == null) {
			return null;
		} else {
			inorder(root.left);
			if (newRoot == null) {
				newRoot = insertRightNode(newRoot, root.data);
			} else {
				insertRightNode(newRoot, root.data);
			}
			inorder(root.right);
		}
		return newRoot;
	}

	public static void printSkewedTree(Node root) {
		Node tempNode = root;
		while (tempNode != null) {
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.right;
		}
	}

}
