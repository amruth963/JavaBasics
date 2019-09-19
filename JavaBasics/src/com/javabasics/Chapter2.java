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
	
	public static void main(String args[]) {
		Chapter2 cpt2 = new Chapter2();
		cpt2.testMethod();
	}
	
	//This method print the value of test global variable
	public void testMethod() {
		System.out.println(test);
	}
	

}
