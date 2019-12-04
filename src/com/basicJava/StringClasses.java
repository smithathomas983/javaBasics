package com.basicJava;

public class StringClasses {
	// string is immutable in java because each string we assign will take a memory spacce
	// when we try to assign another value to the same String reference another String with that value id assign in the memory
	// to overcome this we use stringBuilder or StingBuffer
	//String buffer is thread safe and synchronized where as string builder is more faster .
	//String is not a datatype it is a class
	public static void main(String[] args) {
		
		String s="Selenium";
		StringBuffer buffer= new StringBuffer();
		buffer.append(s)
		.append(" java")
		.append(001);
		System.out.println(buffer);
		
		StringBuilder builder =new StringBuilder();
		builder.append(buffer)
		.append(900);
		System.out.println(builder);
		
	}

}
