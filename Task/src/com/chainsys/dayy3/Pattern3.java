package com.chainsys.dayy3;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n=sc.nextInt();
		while(n<0) {
			System.out.println("Negative Number!!");
			System.out.println("Enter Valid Number ");
			n=sc.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - 2 * i; j++) {
				if (j % 2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
