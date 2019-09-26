package com.javabasics;

public class ForLoop {
	
	public static void main (String [] args){
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
