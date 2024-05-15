package com.chainsys.dayy3;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		int discount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Quantity: ");
		int quantity=sc.nextInt();
		while(quantity<0) {
			System.out.println("Negative Number...");
			System.out.println("Enter  Quantity: ");
			 quantity=sc.nextInt();
			
		}
		
		int unit=quantity*100;
		if(unit>1000) {
			discount=(unit*90/100);
			System.out.println("After 10% Discount,the Price will be: "+ discount );
		}
		else {
			System.out.println("Discount Not Applicable for amount: "+ unit);
		}
		
		sc.close();
	}

}
