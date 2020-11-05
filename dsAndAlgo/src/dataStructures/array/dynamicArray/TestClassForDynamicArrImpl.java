package dataStructures.array.dynamicArray;

public class TestClassForDynamicArrImpl {

	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args) {
		DynamicArray<T> dArr = new DynamicArray<T>();
		dArr.add((T) new Object());
		dArr.add((T) new Object());
		dArr.add((T) new Object());
		dArr.add((T) new Object());

		dArr.toString();
		System.out.println(dArr.size());
		
		DynamicArrInt dArrInt = new DynamicArrInt(4);
		dArrInt.add(2);
		dArrInt.add(3);
		dArrInt.add(5);
		System.out.println(dArrInt);
		
	}
}
