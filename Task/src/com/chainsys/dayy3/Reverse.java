package com.chainsys.dayy3;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int rem,reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		while(num<0) {
			System.out.println("Number can't be Negative...");
			System.out.println("Enter Valid Number: ");
			num=sc.nextInt();
		}
		while(num!=0) {
			
			rem=num%10;
			reverse=reverse*10+rem;
			num/=10;
		
		}
		System.out.print(reverse);
		

	}

}
