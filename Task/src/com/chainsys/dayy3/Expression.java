package com.chainsys.dayy3;

import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {
		
		int x,y,z;
		System.out.println("Enter numbers for x,y,z: ");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		while(x<0 || y<0 || z<0) {
			System.out.println("Negative Numbers...");
			System.out.println("Enter Positive Numbers: ");
			x=sc.nextInt();
			y=sc.nextInt();
			z=sc.nextInt();
			
		}
				System.out.println(x==2);
				System.out.println(x != 5);
				System.out.println(x != 5 && y >= 5);
				System.out.println(z != 0 || x == 2);
				System.out.println(!(y < 10));
				sc.close();
	}

}
