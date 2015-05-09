package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestReadFile {
	private static BufferedReader in;

	/**
	 * fp_growth function using recursive
	 * 
	 * @param T
	 * @param alpha
	 */
	private static void fp_growth(Tree T, int alpha) {
		/**
		 * what are differents of single prefix-path and multipath and how to
		 * find it ???
		 */
		/**
		 * how to use recursive here ???
		 */
	}

	/**
	 * function insert_tree
	 * 
	 * @param a
	 * @param T
	 * @return
	 */
	private static boolean insert_tree(int[] a, Tree T, Node parent) {
		if (a.length == 0) {
			return true;
		} else {
			int p = a[0];
			int P[] = remain(a);

			Node t = new Node();
			t = parent.findchild(p);
			if (t != null) {
				t.setCount(t.getCount() + 1);
				insert_tree(P, T, t);
			} else {
				Node n = new Node(p, 1);
				T.insert2(parent, n);
				insert_tree(P, T, n);
			}
		}
		return true;
	}

	/**
	 * function remain
	 * 
	 * @param a
	 * @return
	 */
	private static int[] remain(int[] a) {
		// TODO Auto-generated method stub
		int[] t = new int[a.length - 1];
		for (int i = 0; i < a.length - 1; i++) {
			t[i] = a[i + 1];
		}
		return t;
	}

	/**
	 * function main
	 * 
	 * @param argv
	 * @throws IOException
	 */
	public static void main(String[] argv) throws IOException {
		File file = new File("data");
		if (file.isDirectory()) {
			String[] files = file.list();
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i]);
			}
		} else {
			FileReader fr = new FileReader(file);
			in = new BufferedReader(fr);
			String line;
			int[] a = new int[5];
			/**
			 * how to read real input file ???
			 */
			while ((line = in.readLine()) != null) {
				String[] values = line.split(" ");
				int[] b = new int[values.length];
				for (int i = 0; i < values.length; i++) {
					b[i] = Integer.parseInt(values[i]);
					a[b[i] - 1]++;
				}
			}
			fr = new FileReader(file);
			in = new BufferedReader(fr);
			Node root = new Node();
			Tree tree = new Tree(root);

			while ((line = in.readLine()) != null) {
				String[] values = line.split(" ");
				int[] b = new int[values.length];
				for (int i = 0; i < values.length; i++) {
					b[i] = Integer.parseInt(values[i]);
				}
				for (int i = 0; i < b.length - 1; i++)
					for (int j = i + 1; j < b.length; j++)
						if (a[b[j] - 1] > a[b[i] - 1]) {
							int t = b[i];
							b[i] = b[j];
							b[j] = t;
						}
				insert_tree(b, tree, root);
				tree.print();
				System.out.println();
			}
		}
	}

	private static void testfind() {
		Node root = new Node();
		Tree tree = new Tree(root);
		/*
		 * tree.insert(0, 2, 7); tree.insert(0, 1, 2);
		 * 
		 * tree.insert(2, 1, 4); tree.insert(2, 3, 2); tree.insert(2, 4, 1);
		 * 
		 * tree.insert(1, 5, 1); tree.insert(1, 3, 2); tree.insert(1, 4, 1);
		 * 
		 * tree.insert(3, 5, 1);
		 */

		/**
		 * error here !!!
		 */
		// tree.insert(1, 3, 2);

		tree.print();
		tree.find(3);
	}
	/**
	 * how to find common prefix path of one node (example 5) ???
	 */
	/**
	 * how to read real input ???
	 */
}
