package com.chainsys.pricing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import com.chainsys.pojo.Validation;


class Store1 {
	//public static List<Item> purchasedProducts = new ArrayList<>();
	public static void getLap() {
		Scanner scanner = new Scanner(System.in);
		Validation v1=new Validation();	
		while(true) {
			System.out.println("Enter no: 1 for Dell");
			System.out.println("Enter no: 2 for Lenovo");
			System.out.println("Enter no: 3 for Hp");
			System.out.println("Enter no: 0 to exit");
			System.out.println("Enter your choice:");
			int choice = scanner.nextInt();
			if(!v1.Numerics(choice)) {
				System.err.println("Negative Number!");
				System.out.println("Enter your choice:");
				choice = scanner.nextInt();
			}
			switch (choice) {
			case 1:
				getLaptop1();
				break;
			case 2:
				getLaptop2();
				break;
			case 3:
				getLaptop3();
				break;
			case 0:
				System.out.println("Exiting...");
				return;
			default:
				System.out.println("Invalid choice!");
				continue;
			}
		}
	}
	public static void getLaptop1() {
		Scanner sc = new Scanner(System.in);
		Validation v1 = new Validation();  
		TotalPrice tp = new TotalPrice();
		String name,model,processor;
		int ram,storage;
		while (true) {
			System.out.println("You have Selected the Dell Laptop");
			System.out.println("Enter Model Name:");
			model = sc.nextLine();

			if (!v1.isSpecialChar(model)) {
				System.err.println("Invalid model Name!");
			} else {
				break; 
			}

		}

		while (true) {
			System.out.println("Enter Processor Name:");
			processor = sc.nextLine();

			if (!v1.isSpecialChar(processor)) {
				System.err.println("Invalid Processor Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter RAM:");
			ram = sc.nextInt();

			if (!v1.Numerics(ram)) {
				System.err.println("Invalid RAM Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Storage:");
			storage = sc.nextInt();

			if (!v1.Numerics(storage)) {
				System.err.println("Invalid Storage Name!");
			} else {
				break; 
			}
		}

		System.out.println("You've selected a Laptop!");
		Laptop laptop = new Laptop(model, processor, ram, storage, 799.99);
		double totalPrice = laptop.getPrice();

		if (totalPrice > 600.00) {
			double discount = 0.10;
			double discountedAmount = totalPrice * discount;
			double discountedPrice = totalPrice - discountedAmount;        

			System.out.println("Laptop that you have Picked:");
			System.out.println(laptop);
			System.out.println("********************Bill************************");
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("Discount Applied: " + (discount * 100) + "%");
			System.out.printf("Discount Amount: $%.2f%n", discountedAmount);
			System.out.printf("Discounted Price: $%.2f%n", discountedPrice);
			System.out.println("**********************************************");
			//tp.TotalPriceCalculator(discountedPrice);
		} else {
			System.out.println("Laptop that you have Picked:");
			System.out.println("********************Bill************************");
			System.out.println("Sorry, No Discount Applied!");
			System.out.println(laptop);
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("**********************************************");
			//tp.TotalPriceCalculator(totalPrice);
		}
	}
	public static void getLaptop2() {
		Scanner sc = new Scanner(System.in);
		TotalPrice tp = new TotalPrice();
		Validation v1 = new Validation();  
		String name,model,processor;
		int ram,storage;
		while (true) {
			System.out.println("You have Selected the Lenovo Laptop");
			System.out.println("Enter Model Name:");
			model = sc.nextLine();

			if (!v1.isSpecialChar(model)) {
				System.err.println("Invalid model Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Processor Name:");
			processor = sc.nextLine();

			if (!v1.isSpecialChar(processor)) {
				System.err.println("Invalid Processor Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter RAM:");
			ram = sc.nextInt();

			if (!v1.Numerics(ram)) {
				System.err.println("Invalid RAM Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Storage:");
			storage = sc.nextInt();

			if (!v1.Numerics(storage)) {
				System.err.println("Invalid Storage Name!");
			} else {
				break; 
			}
		}
		System.out.println("You've selected a Laptop!");
		Laptop laptop = new Laptop( model, processor, ram, storage, 699.99);
		double totalPrice = laptop.getPrice();    
		if (totalPrice > 600.00) {
			double discount = 0.10;
			double discountedAmount = totalPrice * discount;
			double discountedPrice = totalPrice - discountedAmount;	        
			System.out.println("Laptop that you have Picked:");
			System.out.println(laptop);
			System.out.println("********************Bill************************");
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("Discount Applied: " + (discount * 100) + "%");
			System.out.printf("Discount Amount: $" + "%.2f", discountedAmount);
			System.out.println();
			System.out.printf("Discounted Price: $%.2f%n", discountedPrice);
			System.out.println("**********************************************");
			//tp.TotalPriceCalculator(discountedPrice);
		} else {
			System.out.println("Laptop that you have Picked:");
			System.out.println("********************Bill************************");
			System.out.println("Sorry, No Discount Applied!");
			System.out.println(laptop);
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("**********************************************");
			//tp.TotalPriceCalculator(totalPrice);
		}
	}  
	public static void getLaptop3() {
		TotalPrice tp = new TotalPrice();
		Scanner sc = new Scanner(System.in);
		Validation v1 = new Validation();  
		String name,model,processor;
		int ram,storage;
		while (true) {
			System.out.println("You have Selected the Hp Laptop");
			System.out.println("Enter Model Name:");
			model = sc.nextLine();

			if (!v1.isSpecialChar(model)) {
				System.err.println("Invalid model Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Processor Name:");
			processor = sc.nextLine();

			if (!v1.isSpecialChar(processor)) {
				System.err.println("Invalid Processor Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter RAM:");
			ram = sc.nextInt();

			if (!v1.Numerics(ram)) {
				System.err.println("Invalid RAM Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Storage:");
			storage = sc.nextInt();

			if (!v1.Numerics(storage)) {
				System.err.println("Invalid Storage Name!");
			} else {
				break; 
			}
		}
		System.out.println("You've selected a Laptop!");
		Laptop laptop = new Laptop(model, processor, ram, storage, 999.99);
		double totalPrice = laptop.getPrice();    
		if (totalPrice > 999.00) {
			double discount = 0.10;
			double discountedAmount = totalPrice * discount;
			double discountedPrice = totalPrice - discountedAmount;	        
			System.out.println("Laptop that you have Picked:");
			System.out.println(laptop);
			System.out.println("********************Bill************************");
			System.out.println("Total Price: $" + totalPrice);
			System.out.printf("Discount Applied: " + "%.2f",(discount * 100) + "%");
			System.out.println();	
			System.out.printf("Discount Amount: $" + "%.2f", discountedAmount);
			System.out.println();
			System.out.printf("Discounted Price: $%.2f%n", discountedPrice);
			System.out.println("**********************************************");
			//tp.TotalPriceCalculator(discountedPrice);
		} else {
			System.out.println("Laptop that you have Picked:");
			System.out.println("**********************************************");
			System.out.println("Sorry, No Discount Applied!");
			System.out.println(laptop);
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("***********************************************");
			//tp.TotalPriceCalculator(totalPrice);
		}
	}
}


