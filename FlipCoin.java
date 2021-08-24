package com.bl;

import java.util.Scanner;

		public class FlipCoin {
		public static void main(String[] args) {
			
		int i = 0 , H =0 , T = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number To flip the coin :   ");
		int input = scan.nextInt();
		scan.close();
		while ( i < input) {
		int random = (int) Math.floor(Math.random()*10%2);
		if (random == 1) {
		     H++;}
		else             {
		     T++;
						}
		      i++;
		}
		System.out.println("PERCENTAGE OF COIN FLIP");
		int headPercentage = (H*100/input);
		int tailPercentage = (T*100/input);
		System.out.println("Number of  head comes = " +H);
		System.out.println("Number of tail comes = " +T);
		System.out.println("Percentage of head = " +headPercentage);
		System.out.println("Percentage of tail = " +tailPercentage);
		
		}

		}
