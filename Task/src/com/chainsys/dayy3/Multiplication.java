package com.chainsys.dayy3;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit: ");
		int limit=sc.nextInt();
		while(limit<0) {
			System.out.println("Negative Limit Number...");
			System.out.println("Enter Valid Limit: ");
			 limit=sc.nextInt();
		}
		System.out.println("Enter Multiplier: ");
		int multiplier=sc.nextInt();
		while(multiplier<0) {
			System.out.println("Negative Multiplier Number...");
			System.out.println("Enter Valid Multiplier: ");
			multiplier=sc.nextInt();
		}
		
		for(int i=1;i<=limit;i++) {
			System.out.println(i+ "*"+ multiplier +"=" + (i*multiplier));
		}
		
		sc.close();
	}

}
