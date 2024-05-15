package com.chainsys.dayy3;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	      
	        int Number = scanner.nextInt();
	     while(Number<0) {
	    	 System.out.println("Negative Number!!");
			 System.out.println("Enter Valid Number ");
				 Number=scanner.nextInt();
	     }
	            for(int i=1; i<Number; i+=2)
	            {
	                for(int j=i; j<=Number; j+=1)
	                {
	                    System.out.print(" ");
	                }
	                for(int j=1; j<=i; j+=1)
	                {
	                    System.out.print("*");
	                }
	                System.out.println();
	            }
	            for(int i=1; i<=Number; i+=2)
	            {
	                for(int j=1; j<=i; j+=1)
	                {
	                    System.out.print(" ");
	                }
	                for(int j=i; j<=Number; j+=1)
	                {
	                    System.out.print("*");
	                }
	                System.out.println();
	            }
	            scanner.close();
	        	

	}

}
