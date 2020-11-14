package dataStructures.whatIKnow;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	int data;
	TreeNode left, right;
	
	public TreeNode(int item) {
		data = item;
		left = null;
		right = null;
	}
}

public class BinaryTree {

	TreeNode root;
	
	void printLevelOrder() {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			TreeNode tempNode = queue.poll();
			System.out.println(tempNode.data + " ");
			
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}
			
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}
	
	public static void main(String[] args) {
		BinaryTree tree_level = new BinaryTree();
		tree_level.root =  new TreeNode(1);
		tree_level.root.left = new TreeNode(2);
		tree_level.root.right = new TreeNode(3);
		tree_level.root.left.left = new TreeNode(4);
		tree_level.root.left.right = new TreeNode(5);
		
		System.out.println("Level order traversal is = ");
		tree_level.printLevelOrder();
	}
}
