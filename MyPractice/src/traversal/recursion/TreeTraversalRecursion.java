package traversal.recursion;

import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeTraversalRecursion {

	public static void main(String[] args) {
		SortedMap<Integer, ArrayList<Integer>> tree = new TreeMap<Integer, ArrayList<Integer>>();

		ArrayList<Integer> temp1 = new ArrayList<Integer>();
		temp1.add(2);
		temp1.add(3);
		tree.put(1, temp1);

		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		temp2.add(4);
		temp2.add(5);
		temp2.add(8);
		tree.put(2, temp2);

		ArrayList<Integer> temp3 = new ArrayList<Integer>();
		temp3.add(6);
		temp3.add(7);
		tree.put(3, temp3);

		ArrayList<Integer> temp4 = new ArrayList<Integer>();
		tree.put(4, temp4);

		ArrayList<Integer> temp5 = new ArrayList<Integer>();
		tree.put(5, temp5);

		ArrayList<Integer> temp6 = new ArrayList<Integer>();
		tree.put(6, temp6);

		ArrayList<Integer> temp7 = new ArrayList<Integer>();
		tree.put(7, temp7);

		ArrayList<Integer> temp8 = new ArrayList<Integer>();
		tree.put(8, temp8);

		preorder(tree.firstKey(), tree);
		System.out.println("\n");
		inorder(tree.firstKey(), tree);
		System.out.println("\n");
		postorder(tree.firstKey(), tree);

	}

	public static void preorder(Integer node, SortedMap<Integer, ArrayList<Integer>> tree) {
		// list n
		System.out.print(node + " ");

		ArrayList<Integer> children = tree.get(node);

		for (Integer childNode : children) {
			preorder(childNode, tree);
		}
	}

	public static void inorder(Integer node, SortedMap<Integer, ArrayList<Integer>> tree) {
		if (tree.get(node).isEmpty()) {
			System.out.print(node + " ");
		} else {
			inorder(tree.get(node).get(0), tree);
			System.out.print(node + " ");
			for (int i = 1; i < tree.get(node).size(); i++) {
				inorder(tree.get(node).get(i), tree);
			}
		}
	}
	
	public static void postorder(Integer node, SortedMap<Integer, ArrayList<Integer>> tree) {
		ArrayList<Integer> children = tree.get(node);
		for (Integer childNode : children) {
			postorder(childNode, tree);
		}
		System.out.print(node + " ");
	}
	// Test
}
