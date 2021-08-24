package com.bl;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		double number,Remainder;
		System.out.println("enter any number");
		 Scanner scan = new Scanner(System.in);
		 number = scan.nextDouble();
		 Remainder = number %2;
		 if(Remainder == 0) 
			 System.out.println("number is even");
			 else 
				 System.out.println("number is odd");
			 
		 }
	        
	}


