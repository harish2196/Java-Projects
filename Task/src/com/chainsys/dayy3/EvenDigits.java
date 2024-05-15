package com.chainsys.dayy3;

import java.util.Scanner;

public class EvenDigits {

	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter the limit: ");

		  int n=sc.nextInt();
		  System.out.println();
		  while(n<0) {
				System.out.println("Negative Number...");
				System.out.println("Enter Valid Limit: ");
				 n=sc.nextInt();
				}
	        System.out.print("Enter the numbers:");
	        int num[]=new int[n];
	        
	        for(int i=0;i<n;i++) {
	        	num[i]=sc.nextInt();
	        	}
	     
	        for(int i=0;i<n;i++) {
		  		   if(num[i]<0) {
		  	System.out.println("Negative Numbers: "+ num[i]);
			   }
				   
			if(num[i]%2==0) {
				System.out.print("Even numbers are: ");
				System.out.println(num[i]);
				
			
				}
			}
	        sc.close();  
	}

}
