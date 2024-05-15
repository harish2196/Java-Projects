package com.chainsys.pojo;

import java.util.Random;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		StudentInfo e1=new StudentInfo();
		Validation v1=new Validation();
		Scanner sc=new Scanner(System.in);
		String dept1 ="",name1 = "",location="";
		while(true) {
			System.out.println("Enter the name:");
			name1=sc.nextLine();
			if(v1.validateString(name1)) {
				e1.setName(name1);
				break;
			}
		}
		while(true) {
			System.out.println("Enter the Dept:");
			dept1=sc.nextLine();
			if(v1.validateString(dept1)) {
				e1.setName(dept1);
				break;
			}
		}
		
		
		while(true) {
			System.out.println("Enter the regno:");
			int regNo1=sc.nextInt();
			if(v1.Numerics(regNo1)) {
				e1.setRegNo(regNo1);
				break;
			}
		}
		while(true) {
			System.out.println("Enter the Location:");
			location=sc.nextLine();
			if(v1.stringChecker(location)) {
				e1.setName(location);
				break;
			}
		}
		System.out.println("Name:" + e1.getName());
		System.out.println("Department: "+ e1.getDepartment());
		System.out.println("RegNo: "+ e1.getRegNo());
		System.out.println("Location: "+ e1.getLocation());
		System.out.println(e1.toString());
	}

}
