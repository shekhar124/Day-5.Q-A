package com.bl;
import java.util.Scanner;
	public class vowalsorConsonants {
	public static void main(String[]args) {
		char ch;
		System.out.println("enter any alfabt");
		Scanner scan = new Scanner(System.in);
		ch = scan.next().charAt(0);
		if(ch== 'a' || ch == 'e' || ch == 'i' || ch =='o'|| ch =='u' 
				||ch== 'A' || ch == 'E' || ch == 'I' || ch =='O'|| ch =='U') {
			System.out.println("vowel");
			
		}
		else
		{
			System.out.println("consnt");
		}
		
        
	}
	}

	


