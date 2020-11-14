package dataStructures.whatIKnow;

public class Linkedlist {

	public static void main(String[] args) {
		Linkedlist lList = new Linkedlist();
		lList.insert(1);
		lList.insert(2);
		lList.insert(3);
		lList.insert(6);
		
		lList.printList();
		lList.reverseLinkedList();
		lList.printList();
	}
	
	public void reverseLinkedList() {
		Node curr = root;
		Node temp = root;
		Node prev = null;
		
		while (curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		root = prev;
		
//		printList();
	}
	
	public Linkedlist() {
		this.root = null;
	}
	
	Node root;
	
	public void insert(int data) {
		Node newNode = new Node(data);
		
		if (root == null) {
			root = newNode;
			return;
		}
		
		Node temp = root;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void printList() {
		Node temp = root;
		
		while(temp != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;	
		}
		System.out.println("\n");
	}
}

class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}