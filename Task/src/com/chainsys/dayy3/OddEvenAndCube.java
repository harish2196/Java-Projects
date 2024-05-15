package com.chainsys.dayy3;

import java.util.Scanner;

public class OddEvenAndCube {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number (n): ");
		int n = scanner.nextInt();
		while(n<0) {
			System.out.println("Negative Number...");
			System.out.println("Enter Limit: ");
			 n=scanner.nextInt();
		}

		System.out.println("Odd numbers up to " + n + ":");
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\nEven numbers up to " + n + ":");
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		int cube = n * n * n;
		System.out.println("\nCube of " + n + ": " + cube);
		scanner.close();
	}
}


