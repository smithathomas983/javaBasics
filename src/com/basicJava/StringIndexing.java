package com.basicJava;

public class StringIndexing {
	public static void main(String[] args) {
		
		String name="my name is Smitha";
		int j=0;
		String newName="";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			
			if(ch=='m') {
				j++;
				newName= name.replace(ch, ' ');
				
				System.out.println(ch);
				//name.trim();
			
			}
			
		}
		System.out.println(j );		
		//System.out.println(name.replaceAll("\\s+", ""));
		//System.out.println(newName.replaceAll("\\s+", ""));
		String nameArray[]=name.split(" ");
		System.out.println(nameArray.length);
		for(int i=0; i<nameArray.length;i++) {
			System.out.println(nameArray[i]);
		}
		
	}

}
