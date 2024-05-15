package com.chainsys.pricing;

import java.util.Scanner;

import com.chainsys.pojo.Validation;

public class Pricing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ReadWriteMethods rwm = new ReadWriteMethods();
		Validation v1=new Validation();	
		Store3 store1=new Store3();
		Store2 store=new Store2();
		String name,pass;
		String passWord = "";
		String userName = "";
		System.out.println("Do you have any Account in our Store: \n(Yes or No)");
		String choose=scanner.nextLine().toLowerCase();
		while(!choose.equals("yes") && !choose.equals("no")) {
			System.err.println("Please Re-enter Valid Input:");
			choose=scanner.nextLine().toLowerCase();
		}
		if(choose.equals("no")) {
			System.out.println("Please Sign Up");	
			
			System.out.println("Enter UserName:");
			userName = scanner.nextLine();
			System.out.println("Enter PassWord:");
			passWord= scanner.nextLine();
			rwm.write(userName, passWord);
			System.out.println("Signed Successfully!");
			System.out.println("Please Log In!");
			System.out.println("Enter The Name: ");
			name=scanner.next();
			

			System.out.println("Enter The Password: ");
			pass=scanner.next();

			
			if(rwm.read(name, pass))
			{
				System.out.println("valid");
			}
			
			while(!rwm.read(name, pass))
			{
				System.out.println("notvalid");
				System.out.println("Enter The Name: ");
				name=scanner.next();
				System.out.println("Enter The Password: ");
				pass=scanner.next();
			}
			System.out.println("Logg In Succesfully!");
			
		} else if (choose.equals("yes")){
			System.out.println("Please Log In!");
			System.out.println("Enter The Name: ");
			name=scanner.next();
			System.out.println("Enter The Password: ");
			pass=scanner.next();

			
			if(rwm.read(name, pass))
			{
				System.out.println("valid");
			}
			while(!rwm.read(name, pass))
			{
				System.out.println("notvalid");
				System.out.println("Enter The Name: ");
				name=scanner.next();
				System.out.println("Enter The Password: ");
				pass=scanner.next();
			}

			System.out.println("Logg In Succesfully!");
			System.out.println("Welcome to our store!");
			System.out.println("What product would you like to get?");
			
			
		}
		while(true) { 
			System.out.println("1. Laptop");
			System.out.println("2. Clothes");
			System.out.println("3. Mobiles");
			System.out.println("0 - to exit");
			System.out.println("Enter your choice(1, 2 or 0):");
			int choice = scanner.nextInt();
			if(!v1.Numerics(choice)) {
				System.err.println("Negative Number!");
				System.out.println("Enter your choice:");
				choice = scanner.nextInt();
			}
			switch (choice) {
			case 1:
				Store1.getLap();
				break;
			case 2: 
				store.getCloth();
				break;
			case 3:
				store1.getMobile();
				break;
			case 0:
				System.err.println("Exiting...");
				return;
			default:
				System.err.println("Invalid choice!");	
				continue;
			}
		}
	
	}
}
