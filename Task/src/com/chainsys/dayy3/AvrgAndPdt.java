package com.chainsys.dayy3;

import java.util.Scanner;

public class AvrgAndPdt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int product=1;
		int sum=0;
		double average = 0;
		String number;
		System.out.println("Enter integers (press 'q' to quit):");
		while(true) {
			number=sc.nextLine();
			if(number.equals("q")) {
				break;
			}
			int userInput=Integer.parseInt(number);
			 if (userInput < 0) {
	                System.out.println("Negative Number!!");
	                System.out.println("Enter Valid Number ");
	                continue; 
	            }
			sum+=userInput;
			product*=userInput;
			count++;
			
			 average=(double)sum/count;

		}
		
		System.out.println("Average: " + average);
        System.out.println("Product: " + product);

	sc.close();
	}
}