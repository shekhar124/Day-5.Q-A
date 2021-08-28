package com.bl;

import java.util.Scanner;

public class Triplets {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int sizeOfArray = scan.nextInt();
		int[] arr = new int[sizeOfArray];
		System.out.println("Enter the elements of array:");
		for (int i = 0; i < sizeOfArray; i++) {
			arr[i] = scan.nextInt();
		}

		int len = arr.length;
		findAllTriplets(arr, len);
	}

	public static void findAllTriplets(int[] arr, int len) {
		boolean foundTriplets = false;
		int tripletCount = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				for (int k = j + 1; k < len; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						tripletCount++;
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						foundTriplets = true;
					}
				}
			}
		}
		System.out.println("total number of triplets:" + tripletCount);
		if (!foundTriplets)
			System.out.println("no triplets found");
	}
}