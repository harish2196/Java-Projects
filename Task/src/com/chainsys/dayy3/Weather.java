package com.chainsys.dayy3;

import java.util.Scanner;

public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Weather it is Raining or Not(Y or N):");
		String condition=sc.nextLine().toUpperCase();

		if (condition.equals("Y")) {
		    System.out.println("Take an Umbrella");
		} else if(condition.equals("N")) {
		    System.out.println("No need to take an Umbrella");
		}

		System.out.print("Enter the Temperature: ");
		int temp = sc.nextInt();

		while (temp < 0) {
		    System.out.println("Negative Number...");
		    System.out.println("Enter Valid Temp: ");
		    temp = sc.nextInt();
		}

		if (temp < 31) {
		    System.out.println("Take a Heavy Jacket");
		} else if (temp >= 32 && temp <= 50) {
		    System.out.println("Take a Light Jacket");
		} else {
		    System.out.println("Invalid Data");
		}

		
		sc.close();
	}

}
