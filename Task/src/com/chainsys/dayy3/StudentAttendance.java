package com.chainsys.dayy3;

import java.util.Scanner;

public class StudentAttendance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("No of Classes held: ");
		float held=sc.nextInt();
		while(held<0) {
			System.out.println("Number can't be Negative...");
			System.out.println("Enter Valid Classes Held: ");
			held=sc.nextInt();
		}
		
		System.out.println("No of Classes attended: ");
		float attended=sc.nextInt();
		while(attended<0) {
			System.out.println("Number can't be Negative...");
			System.out.println("Enter Valid Classes Attended: ");
			attended=sc.nextInt();
		}
		
		float percentage=(attended/held)*100;
		System.out.println("Percentage: "+ percentage);
		
		if(percentage>=75.0) {
			System.out.println("Students allowed to sit in the Exam");
		}else {
			  System.out.print("Do you have a medical cause? (Y/N): ");
	            char medical = sc.next().charAt(0);
	        if(medical=='Y') {
	        	 System.out.println("Student is allowed to sit in the exam due to medical cause.");
	        }else {
	        	System.out.println("Not allowed in the Exam hall");
	        }
		}
		sc.close();
	}

}
