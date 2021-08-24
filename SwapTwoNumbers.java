package com.bl;

import java.util.Scanner;

	public class SwapTwoNumbers {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter x vlue");
			int x = scan.nextInt();
			System.out.println("Enter y value");
			int y = scan.nextInt();
			
			int temp = 0;
			temp = x;
			    x=y;
			
			y = temp;
			System.out.println("After Swapping two numbers");
			
			System.out.println("x is :- " + x);
			System.out.println("y is :- " + y);

			
	}

}
