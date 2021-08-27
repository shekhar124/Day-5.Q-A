package com.bl;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		double x = 0, y = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x1 condinate");
		double x1 = scan.nextDouble();
		System.out.println("Enter y1 condinate");
		double y1 = scan.nextDouble();
		double distance = Math.sqrt(Math.pow((x1 - x), 1) + Math.pow((y1 - y), 1));
		System.out.println(distance);
		scan.close();

	}

}
