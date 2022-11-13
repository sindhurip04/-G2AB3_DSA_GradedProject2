package com.greatlearning.BSTtoSkewed;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of node in the tree:");
		int size = sc.nextInt();
		Node root = null;
		int value;
		System.out.println("Enter the values:");
		for(int i = 0; i<size; i++) {
			value = sc.nextInt();
			if(root == null) {
				root = TreeOperations.insertNode(root,value);
			}
			else{
				TreeOperations.insertNode(root, value);
			}
		}
		Node root2 = null;
	   root2 =  TreeOperations.inorder(root);
	   System.out.println("");
	   TreeOperations.printSkewedTree(root2);
	   sc.close();
	}

}
