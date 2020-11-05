package dataStructures.array.dynamicArray;

public class DynamicArrInt {

	@Override
	public String toString() {
		String str = "";
		for (int i=0; i<len; i++) {
			str = str + arr[i] + ", ";
		}
		return str;
	}
	
	private int[] arr;
	private int len;
	private int capacity;
	
	public DynamicArrInt(int capacity) {
		if (capacity < 0) throw new IllegalArgumentException
			("Illegal capacity : " + capacity);
		this.capacity = capacity;
		arr = new int[capacity];
	}
	
	public int size() {
		return len;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int get(int index) {
		return arr[index];
	}
	
	public void set(int index, int data) {
		arr[index] = data;
	}
	
	public void clear() {
		for (int i=0; i<size(); i++) {
			arr[i] = (Integer) null;
		}
		len = 0;
	}
	
	public void add(int data) {
		
		if (len + 1 >= capacity) {
			// time to resize
			if (capacity == 0) {
				capacity = 1;
			}
			else {
				capacity *= 2; // double the size
			}
			int[] newArr = new int[capacity];
			for (int i=0; i< len; i++) {
				newArr[i] = arr[i];
				arr = newArr;
			}
		}
		arr[len++] = data;
	}
	
	public int removeAt(int rmIndex) {
		if (rmIndex >= len || rmIndex < 0) {
			throw new IndexOutOfBoundsException();
		}
		int data = arr[rmIndex];
		int[] newArr = new int[len-1];
		for (int i=0, j=0; i<len; i++, j++) {
			if (rmIndex == i) {
				j--;
			}
			else {
				newArr[j] = arr[i];		
			}
		}
		arr = newArr;
		capacity = --len;
		return data;
	}
	
	public boolean remove(int data) {
		int index = indexOf(data);
		if (index == -1) {
			return false;
		}
		removeAt(index);
		return true;
	}
	
	public int indexOf(int data) {
		for (int i=0; i<len; i++) {
			if (arr[i] == data) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean contains(int data) {
		return indexOf(data) != -1;
	}
}
