package com.chainsys.dayy3;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age=sc.nextInt();
		while(age<0) {
			System.out.println("Negative Number...");
			System.out.println("Enter Age: ");
			 age=sc.nextInt();
		}
		
		System.out.println("Enter Gender M or F: ");
		char gender=sc.next().charAt(0);
		
	
		if(gender=='F' || gender=='M') {
			
		
		
			if(gender=='F') 
			{
				System.out.println("she will work only in urban areas.");
			}
			else if(gender=='M' && (age>=20 && age<=40)) 
			{
				System.out.println(" he may work in anywhere");
			}
			else if(gender=='M' && (age>=40 && age<=60)) 
			{
				System.out.println("he will work in urban areas only");
			}
			else 
			{
				System.out.println("Error");
			}
		
		}else{
			System.out.println("Invalid Data");
			}
	
		sc.close();
		
	 
	

	}
}
