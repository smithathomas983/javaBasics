package com.basicJava;

public class ReverseString {
	public static void main(String[] args) {
		
		String name="smitha";
		String reverseName="";
		for(int i=name.length()-1;i>=0;--i) {
			char st= name.charAt(i);
			reverseName+=st;
			
		}System.out.println(reverseName);
		ReverseString s= new ReverseString();
		try {
		s.m1();}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public void m1() throws Exception{
		throw new Exception ("Smitha Exception");
	}

}
