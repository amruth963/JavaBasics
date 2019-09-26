package com.javabasics;

public class ForLoop {
	
	public static void main (String [] args){
		/**
		 * Question
		 * 1. Why variable i is started with 1
		 * 2. Why i<=10? why it cant be i>=10? and what happens if you do so
		 * 3. what happens when u remove = in condition
		 * 4. Why num=2 any reason in ypur logic?
		 * 5. Since its a for of for loop why num=2 and j=1? We will get the o/p but logic is bad
		 */
		
		int i;
		for(i=1;i<=10;i++){
		System.out.println("This is a test");
		}
		
		/**Example for nested Loop
		* Printing table of 2 to 10
		*/
		int num;
		for (num=2;num<=10;num++){
			System.out.println("Table of " + num);
			int j;
		for(j=1 ;j<=10;j++){
			System.out.println( num + " x " + j + " = " + num*j );
		}
		}
		
	}

}
