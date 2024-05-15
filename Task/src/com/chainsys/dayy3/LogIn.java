package com.chainsys.dayy3;

import java.util.Scanner;

public class LogIn {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		 	System.out.println("Enter  yourname:");
	        String name=sc.next();
	        while(name.length()>7) {
	        	System.out.println("Name can't be accept more than six Char...");
	        	System.out.println("Enter Valid Name:");
	            name=sc.next();
	        }
	        
	        System.out.println("create passwords:");
	        int password=sc.nextInt();
	        
	        System.out.println("Enter for login credentials:");
	        
	        System.out.println("Enter username:");
	        String userName=sc.next();
	        System.out.println("Enter password:");
	        int passWord=sc.nextInt();
	        
	        if(userName.equals(name) && passWord==password) {
	            System.out.println("Login sucessfully...");
	        }else {
	            System.out.println("invalid username or password");
	        }
	    

	        sc.close();
	}

}
