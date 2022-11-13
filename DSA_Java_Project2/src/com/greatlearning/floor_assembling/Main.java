package com.greatlearning.floor_assembling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static public int[] tree; //To store numbers in max heap
	static public int n = 0; //To store the last index of the max heap
	public static int root;	//Root value in max heap
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of days to construct the building:");
		int height = sc.nextInt();
		System.out.println("Enter the day and floor:");
		tree = new int[height + 1];
		int size = height;
		//List to store input values
		List<Integer> arr = new ArrayList<>(height);
		for (int it = 0; it < height; it++) {
			int value = sc.nextInt();
			arr.add(value);
		}
		for (int i = 0; i < height; i++) {
			//Inserting values into max heap
			int root = Assembling.insertValue(arr.get(i), tree, n);
			n++;
			System.out.print("Day " + (i + 1) + ": ");
			//Comparing the size with root node of max heap
			while (root == size) {
				size--;

				System.out.print(root + " ");
				//Deleting root node from max heap
				root = Assembling.delete(tree, n);
				n--;
				if (size == 0) {
					break;
				}
			}
			System.out.println();
		}
	}

}
