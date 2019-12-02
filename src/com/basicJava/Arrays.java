package com.basicJava;

public class Arrays {
public static void main(String[] args) {
	
	int i[]= new int[4];
	i[0]=34;
	i[1]=56;
	i[2]=90;
	i[3]=45;
	System.out.println(i.length);
	System.out.print("{");
	for(int j=0;j<i.length;j++) {
		System.out.print(+i[j]+" ");
	}
	//i[1]= java.util.Arrays.remove
	System.out.print("}");
	//System.out.println(i[4]);
	
	
}
}
