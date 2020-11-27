package com.friday;

public class GlobalVariableCheck {

	
	public static String key = null;
	
	public static void someMethod() {
		key = "sunil";
	}
	
	public static void main(String[] args) {
		someMethod();
		
		System.out.println("key is " + key);
	}
}
