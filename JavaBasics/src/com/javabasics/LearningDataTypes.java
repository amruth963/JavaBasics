package com.javabasics;

public class LearningDataTypes {

public static void main (String []args){
	//Variables in Java
	int age = 25; //to indicate a small number range
	long price = 241375321;// to indicate large number
	double cost = 25.1;// to indicate a decimal number
	float money = (float) 25.14345544; //Even this is used to indicate decimal number
	
	System.out.println(age);
	System.out.println(price);
	System.out.println(cost);
	
	//Boolean is used to indicate condition (True/False)
	boolean answer = true;
	System.out.println(answer);
	
	//Characters in java
	
	char name = 'H';
	System.out.println(name);
	
	int a = 2;
	int b = 3;
	System.out.println(a>b);// boolean as a output
	System.out.println(a+2);
	System.out.println(b-1);
	
	// Incrementing and decrementing values
	
	int x =1;
	x = x+1;
	x += 1; //Even this can be used in java to increment both are same but this is in standard way
	System.out.println(x);
	x++;
	System.out.println(x);
	x--;
	System.out.println(x);
	
	
}

}