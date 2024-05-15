package com.chainsys.dayy3;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		int hike;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary: ");
		int salary=sc.nextInt();
		while(salary<0) {
			System.out.println("Negative Number...");
			System.out.println("Enter  Salary: ");
			 salary=sc.nextInt();
			
		}
		System.out.println("Enter Year: ");
		int year=sc.nextInt();
		
		Validation myObj=new Validation();
		if(myObj.Numbers(salary)) {
			if(myObj.Numbers(year)) {
			
			if(year>5) {
				hike=(salary*5/100);
				System.out.println("Salary hiked: "+ hike);
				System.out.println("Salary hiked: "+ (salary+hike));
				
			}else {
				System.out.println("Salary not hiked ");
			}
		}
		}
		
		sc.close();
	}

}
