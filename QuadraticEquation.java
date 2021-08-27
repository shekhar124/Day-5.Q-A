package com.bl;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value A :\nEnter Value B :\nEnter Value C:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		double r1 = 0;
		double r2 = 0;
		double discriminant = b * b - 4 * a * c;
		if (discriminant < 0) {
			System.out.println("you have entered imaginary roots\n________________________________________");
		}
		if (discriminant == 0) {
			System.out.println("ROOTS are equal ");
			r1 = -b / (2 * a);
			r2 = -b / (2 * a);
		}
		if (discriminant > 0) {
			System.out.println("ROOTS are unequal");
			r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			r1 = (-b - Math.sqrt(discriminant)) / (2 * a);
		}
		System.out.println("The roots of the Quadrtic Equation is\n______________________________________");
		System.out.println("Root 1 :"+r1);
		System.out.println("Root 2 :"+r2);

	}

}
