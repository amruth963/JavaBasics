package com.javabasics;

public class WhileLoop {

	public static void main (String [] args){
		// The major difference between while and do while loop is that in while loop the condition is checked after initializing and then the value is incremented 
		// where as in do while the condition is checked in the last
		
		/**
		 * For multiple line comments use comments structure like this
		 * instead of above comment style. This will keep the coding standards
		 */
		
		int i =1;	// initializing 
		while (i<=15){	//Condition 
			System.out.println("I am testing while loop");
			i++;   //Incrementing value
		}
		int j=1; // initializing 
		do{
			System.out.println("I am testing Do while loop");	
			j++;//Incrementing value
		}
			while (j<=15);//Condition 
	}
}
