package com.basicJava;

import java.util.Random;

public class BlankFiller {
public static void main(String[] args) {
	
	String name="Smitha";
	String lastName="Smitha";
	Random r= new Random();
	int i= r.nextInt();
	System.out.println(i);
	if (i>0) {

	System.out.println(i);
}
else {
	i=-i;
	System.out.println(i);
}
	
	System.out.println("\"Smitha \" is my name \n What is your name? "
			+ "\t and your age?\\ \n how about a cofee    \r in that caf\fe"
			+ "it will be fun");
	if(name==lastName) {
		System.out.println("Enter correct last name");
		
	}

}}