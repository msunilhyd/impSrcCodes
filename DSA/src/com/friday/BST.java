package com.friday;

public class BST {

	Node headLinkedList;
	Node prev;
	
	public void bstToDoublyLinkedList(Node node) {
		
		if (node == null) {
			return;
		}
		bstToDoublyLinkedList(node.left);
		
		if (prev == null) {
			headLinkedList = node;
		}
		else {
			node.left = prev;
			prev.right = node;
		}
		prev = node;
		
		bstToDoublyLinkedList(node.right);
	}
}
