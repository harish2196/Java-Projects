package com.chainsys.dayy3;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		n=sc.nextInt();
		while(n<0) {
			System.out.println("Negative Number!!");
			System.out.println("Enter Valid Number ");
			 n=sc.nextInt();
		}
		for(i=1;i<=n;i+=1) {
			for(j=1;j<=i;j+=1) {
				System.out.print("*");
			}
		
		System.out.println();
		}

		sc.close();
	}

}
