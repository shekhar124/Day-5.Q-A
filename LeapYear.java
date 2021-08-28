package com.bl;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year yyyy = ");
		int year = scan.nextInt();
		if ((year % 400) == 0 || (year % 100 != 0) && (year % 4 == 0)) {
			System.out.println("year is leap year  " + year);
		} else {
			System.out.println("year you entered is not a LeapYear  " + year);
		}

	}

}