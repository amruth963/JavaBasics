package com.javabasics;

public class ForLoop {
	
	public static void main (String [] args){
		/**
		 * Question
		 * 1. Why variable i is started with 1
		 * Ans:  I have started variable with 1 bcoz i want to start my increments from 1... 
		 * it can be anything it can also start from 10 but my condition value should have difference of 10 i.e if i give i = 10 the my condition will be i<=20
		 * so that i can achieve my output
		 * my output expectation is print "this is a test" 10 times
		 * 2. Why i<=10? why it cant be i>=10? and what happens if you do so
		 * Ans: i value will be incrementing everytime the loop starts so my condition states that when i value reaches 10 stop the loop 
		 * if i give i>=10 the condition will be set to false and i will be out of the loop
		 * 3. what happens when u remove = in condition
		 * Ans: if i remove = in the condition it will execute 9 times bcoz 9 is lesser than 10
		 * 4. Why num=2 any reason in ypur logic?
		 * Ans: bcoz i am starting my tables from 2
		 * i can put it as 1 also so my tables start from 1
		 * 5. Since its a for of for loop why num=2 and j=1? We will get the o/p but logic is bad
		 *  Ans :num 2 bcoz i am starting my tables from 2
		 * i can also change it to 1 and pls see after changing the result
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
