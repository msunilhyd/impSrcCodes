package com.friday;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node {
	int data;
	Node left;
	Node right;
	int height;
	
	public Node(int data) {
		this.data = data;
	}
}

public class TopViewBinaryTree {

	public static void main(String[] args) {
		TopViewBinaryTree tvb = new TopViewBinaryTree();
		tvb.root = new Node(2);
		tvb.root.left = new Node(4);
		tvb.root.right = new Node(7);
		tvb.root.left.left = new Node(1);
		tvb.root.left.right = new Node(8);
		tvb.printTopView();
	}
	
	public Node root;
	
	public void printTopView() {
		Queue<Node> q = new LinkedList<Node>();
		root.height = 0;
		q.add(root);
		TreeMap<Integer, Integer> t = new TreeMap();
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			int height = temp.height;
			if (!t.containsKey(height)) {
				t.put(height, temp.data);
			}
			if (temp.left != null) {
				int lHeight = height - 1;
				temp.left.height = lHeight;
				q.add(temp.left);
			}
			if (temp.right != null) {
				int rHeight = height + 1;
				temp.right.height = rHeight;
				q.add(temp.right);
			}
		}
		for (Map.Entry<Integer, Integer> e : t.entrySet()) {
			System.out.print(e.getValue() + ", ");
		}
	}
}
