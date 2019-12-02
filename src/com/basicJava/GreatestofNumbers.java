package com.basicJava;

public class GreatestofNumbers {
	public static void main(String[] args) {
		
		int number1=2000;
		int number2=300;
		int number3=500;
		int number4=50000;
		if((number1>number2)&&(number1>number3)&&(number1>number4)){
			System.out.println("The greatest of the four number is ;"+number1);
		}
		else if( (number2>number3)&&(number2>number4)){
			System.out.println("The greatest of the four number is ;"+number2);
		}
		else if(number3>number4) {
			System.out.println("The greatest of the four number is ;"+number3);
		}
		else {
			System.out.println("The greatest of the four number is ;"+number4);
		}
	}

}
