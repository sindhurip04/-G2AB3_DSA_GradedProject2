package com.greatlearning.floor_assembling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static public int[] tree;
	static public int n = 0;
	public static int newvalue;
	public static int root;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of days to construct the building:");
		int height = sc.nextInt();
		System.out.println("Enter the day and floor:");
		tree = new int[height + 1];
		int size = height;
		List<Integer> arr = new ArrayList<>(height);
		for (int it = 0; it < height; it++) {
			int value = sc.nextInt();
			arr.add(value);
		}
		for (int i = 0; i < height; i++) {

			int root = Assembling.insertValue(arr.get(i), tree, n);
			n++;
			System.out.print("Day " + (i + 1) + ": ");

			while (root == size) {
				size--;

				System.out.print(root + " ");

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
