package com.greatlearning.floor_assembling;

public class Assembling {
	public static int insertValue(int value, int[] tree, int n) { // when array is empty
		n = n + 1;

		tree[n] = value;
		int i = n;
		while (i > 1) {
			int parent = i / 2;
			if (tree[parent] < tree[i]) {
				swap(parent, i, tree);
				i = parent;
			} else {
				return tree[1];
			}
		}

		return tree[1];
	}

	public static int delete(int[] tree, int n) {
		tree[1] = tree[n];

		tree[n] = 0;
		n = n - 1;

		int i = 1;

		while (i < n) {
			int left = tree[2 * i];
			int right = tree[(2 * i) + 1];
			int larger = left > right ? 2 * i : 2 * i + 1;
			if (tree[i] < tree[larger]) {
				swap(i, larger, tree);
				i = larger;
			} else {
				return tree[1];
			}
		}
		return tree[1];
	}

	public static void swap(int index1, int index2, int[] tree) {
		int temp;
		temp = tree[index1];
		tree[index1] = tree[index2];
		tree[index2] = temp;
	}

}
