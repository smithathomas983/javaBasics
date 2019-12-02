package com.basicJava;

import java.util.ArrayList;

public class ArrayListCollections {

	public static void main(String[] args) {
		
		 ArrayList ar=new ArrayList();
		 //creating an object of the ArrayList
		 //Array list comes under the collections class...java.Util.ArrayList package
		 ar.add(100);
		 ar.add("smitha");
		 //iterator<> i=new iterator<ar.iterator()>;
		 
		 for(int i=0; i<ar.size();i++) {
			 System.out.println(ar.get(i));
		 }
		 ArrayList<String> a1= new ArrayList<String>();
		 a1.add("Smitha");
		 System.out.println(a1.size());
	}
}
