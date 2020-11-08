package dataStructures.queue.llistimpl;

import java.util.Iterator;
import java.util.LinkedList;

// A Queue implementation with a linked list

public class Queue<T> implements Iterable<T> {

	private LinkedList<T> list = new LinkedList<T>();
	
	public Queue() {}
	
	public Queue(T firstElem) {
		offer(firstElem);
	}
	
//	Return the size of the Queue
	public int size() {
		return list.size();
	}
	
//	Returns whether or not the queue is empty
	public boolean isEmpty() {
		return size() == 0;
	}
	
//	Peek the element at the front of the queue
//	The method throws an error if the Queues is empty
	public T peek() {
		if (isEmpty()) throw new RuntimeException("Queue Empty");
		return list.peekFirst();
	}
	
//	Poll an element from the front of the Queue
//	The method throws and error if the Queue is empty
	public T poll() {
		if (isEmpty()) throw new RuntimeException("Queue Empty");
		return list.removeFirst();
	}
	
//	Add an element at the back of the Queue
	public void offer(T elem) {
		list.addLast(elem);
	}
	
//	Return an iterator to allow the user to traverse
//	through the elements found inside the queue
	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}
}
