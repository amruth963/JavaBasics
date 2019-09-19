package com.javabasics;

public class Chapter2 {
	
	/* 
	 * Global variables can be set after the class declaration 
	 * These values can reflect globally within the class
	 * 
	 * */
	//This is global variables 
	String test = "Tester";
	int num = 123;
	float floatNum = (float) 123.467;
	char oneCharacter = 'a';
	
	/**
	 * Also global variables can have the access modifiers
	 * They can be declared Public, Private and Protected based on developers need
	 * Its not mandatory to assign a value for global variables. It can be declared where ever required within a method
	 */
	
	/**
	 * Public access modifiers is visible for all
	 * Private access modifiers is visible only in class
	 * Protected access modifiers is visible within the package and outside the package through child class
	 */
	public String globalVariable;
	public int studentCount;
	public float monthlySalary;
	public char oneLetter;
	
	

	
	public static void main(String args[]) {
		Chapter2 cpt2 = new Chapter2();
		cpt2.testMethod();
	}
	
	//This method print the value of test global variable
	public void testMethod() {
		System.out.println(test);
	}
	

}


