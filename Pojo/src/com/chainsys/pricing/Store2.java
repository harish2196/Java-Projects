package com.chainsys.pricing;

import java.util.Scanner;

import com.chainsys.pojo.Validation;

public class Store2 {


	public void getCloth() {
		Scanner scanner = new Scanner(System.in);
		TotalPrice tp = new TotalPrice();
		System.out.println("Enter no: 1 for OverSized Tees");
		System.out.println("Enter no: 2 for Pant");
		System.out.println("Enter no: 3 for Shirt");
		System.out.println("Enter a Choice:");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			getClothes1();
			break;
		case 2:
			getClothes2();
			break;
		case 3:
			getClothes3();
			break;
		default:
			System.err.println("Invalid choice!");
		}
	}

	public  void getClothes1() {
		Scanner sc = new Scanner(System.in);
		TotalPrice tp = new TotalPrice();
		Validation v1 = new Validation();  
		String type,material,size,color;
		while (true) {
			System.out.println("You have Selected the OverSized Tees!");
			System.out.println("Enter Material Name:");
			material = sc.nextLine();

			if (!v1.isSpecialChar(material)) {
				System.err.println("Invalid Material Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Color Name:");
			color = sc.nextLine();

			if (!v1.isSpecialChar(color)) {
				System.err.println("Invalid Color Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Size(S , L , XL & XLL):");
			size = sc.nextLine();

			if (!v1.isSpecialChar(size)) {
				System.err.println("Invalid Size Name!");
			} else {
				break; 
			}
		}	

		System.out.println("You've selected Clothes!");
		Clothes clothes = new Clothes(material, color, size, 29.99);    
		double totalPrice = clothes.getPrice();    
		if (totalPrice > 20.00) {
			double discount = 0.05; 
			double discountedAmount = totalPrice * discount;
			double discountedPrice = totalPrice - discountedAmount;	        
			System.out.println("Clothes that you have Picked:");
			System.out.println(clothes);
			System.out.println("********************Bill************************");

			System.out.println("Total Price: $" + totalPrice);
			System.out.println("Discount Applied: " + (discount * 100) + "%");
			System.out.println("Discount Amount: $ " + discountedAmount);
			System.out.printf("Discounted Price: $" +"%.2f", discountedPrice);
			System.out.println();
			System.out.println("**********************************************");
			//tp.TotalPriceCalculator(discountedPrice);
		} else {
			System.out.println("Clothes that you have Picked:");
			System.out.println("********************Bill************************");
			System.out.println("Sorry No Discount Applied!");
			System.out.println(clothes);
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("**********************************************");

			//tp.TotalPriceCalculator(totalPrice);
		}
	}


	public void getClothes2() {
		Scanner sc = new Scanner(System.in);
		Validation v1 = new Validation();  
		TotalPrice tp = new TotalPrice();
		String type,material,size,color;
		while (true) {
			System.out.println("You have Selected the Pant!");
			System.out.println("Enter Material Name:");
			material = sc.nextLine();

			if (!v1.isSpecialChar(material)) {
				System.err.println("Invalid Material Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Color Name:");
			color = sc.nextLine();

			if (!v1.isSpecialChar(color)) {
				System.err.println("Invalid Color Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Size(S , L , XL & XLL):");
			size = sc.nextLine();

			if (!v1.isSpecialChar(size)) {
				System.err.println("Invalid Size Name!");
			} else {
				break; 
			}
		}	

		System.out.println("You've selected Clothes!");
		Clothes clothes = new Clothes(material, color, size, 29.99);    
		double totalPrice = clothes.getPrice();    
		if (totalPrice > 20.00) {
			double discount = 0.05; 
			double discountedAmount = totalPrice * discount;
			double discountedPrice = totalPrice - discountedAmount;	        
			System.out.println("Clothes that you have Picked:");
			System.out.println(clothes);
			System.out.println("********************Bill************************");

			System.out.println("Total Price: $" + totalPrice);
			System.out.println("Discount Applied: " + (discount * 100) + "%");
			System.out.println("Discount Amount: $ " + discountedAmount);
			System.out.printf("Discounted Price: $" +"%.2f", discountedPrice);
			System.out.println();
			System.out.println("**********************************************");
			//tp.TotalPriceCalculator(discountedPrice);
		} else {
			System.out.println("Clothes that you have Picked:");
			System.out.println("********************Bill************************");
			System.out.println("Sorry No Discount Applied!");
			System.out.println(clothes);
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("**********************************************");

			//tp.TotalPriceCalculator(totalPrice);
		}
	}

	public void getClothes3() {
		Scanner sc = new Scanner(System.in);
		Validation v1 = new Validation();  
		TotalPrice tp = new TotalPrice();
		String type,material,size,color;
		while (true) {
			System.out.println("You have Selected the Shirt");
			System.out.println("Enter Material Name:");
			material = sc.nextLine();

			if (!v1.isSpecialChar(material)) {
				System.err.println("Invalid Material Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Color Name:");
			color = sc.nextLine();

			if (!v1.isSpecialChar(color)) {
				System.err.println("Invalid Color Name!");
			} else {
				break; 
			}
		}

		while (true) {
			System.out.println("Enter Size(S , L , XL & XLL):");
			size = sc.nextLine();

			if (!v1.isSpecialChar(size)) {
				System.err.println("Invalid Size Name!");
			} else {
				break; 
			}
		}	
		System.out.println("You've selected Clothes!");
		Clothes clothes = new Clothes(material, color, size, 30.99);  
		double totalPrice=clothes.getPrice();
		if(totalPrice>35) {
			double  discount = 0.07;
			double discountedAmount = totalPrice * discount;
			double discountedPrice = totalPrice - discountedAmount;	        
			System.out.println("Clothes that you have Picked:");
			System.out.println(clothes);
			System.out.println("********************Bill************************");

			System.out.println("Total Price: $" + totalPrice);
			System.out.println("Discount Applied: " + (discount * 100) + "%");
			System.out.println("Discount Amount: $ " + discountedAmount);
			System.out.printf("Discounted Price: $" +"%.2f", discountedPrice);
			System.out.println();
			System.out.println("**********************************************");
			//tp.TotalPriceCalculator(discountedPrice);
		}else {
			System.out.println("Clothes that you have Picked:");
			System.out.println("********************Bill************************");
			System.out.println("Sorry No Discount Applied!");
			System.out.println(clothes);
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("**********************************************");
			//tp.TotalPriceCalculator(totalPrice);
		}
	}

}


