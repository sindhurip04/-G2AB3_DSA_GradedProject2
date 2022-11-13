package com.greatlearning.BSTtoSkewed;

public class Node {
	public int data;
	public Node left;
	public Node right;
	
	public static Node newNode(int data) {
		Node newnode = new Node();
		newnode.data = data;
		newnode.left = null;
		newnode.right = null;
		return newnode;
	}
}
