package com.chainsys.pricing;

import java.util.Scanner;

import com.chainsys.pojo.Validation;

public class Store3 {

    public void getMobile() {
        Scanner scanner = new Scanner(System.in);
        TotalPrice tp = new TotalPrice();
        System.out.println("Enter no: 1 for iPhone");
        System.out.println("Enter no: 2 for Redmi");
        System.out.println("Enter no: 3 for Samsung");
        System.out.println("Enter a Choice:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                getMobile1();
                break;
            case 2:
                getMobile2();
                break;
            case 3:
                getMobile3();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    private void getMobile1() {
        Scanner sc = new Scanner(System.in);
        Validation v1 = new Validation();
        TotalPrice tp = new TotalPrice();
        String model, processor;
        int ram, storage;

        while (true) {
            System.out.println("Enter Processor Name:");
            processor = sc.nextLine();

            if (!v1.validateString(processor)) {
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

        System.out.println("You've selected a Mobile!");
        Mobile mobile = new Mobile(processor, ram, storage, 199.99);
        double totalPrice = mobile.getPrice1();

        if (totalPrice > 190.00) {
            double discount = 0.10;
            double discountedAmount = totalPrice * discount;
            double discountedPrice = totalPrice - discountedAmount;

            System.out.println("Mobile that you have Picked:");
            System.out.println(mobile);
            System.out.println("********************Bill************************");
            System.out.println("Total Price: $" + totalPrice);
            System.out.println("Discount Applied: " + (discount * 100) + "%");
            System.out.printf("Discount Amount: $%.2f%n", discountedAmount);
            System.out.printf("Discounted Price: $%.2f%n", discountedPrice);
            System.out.println("************************************************");
           // tp.TotalPriceCalculator(discountedPrice);
        } else {
        	System.out.println("********************Bill************************");
		   	System.out.println("Mobile that you have Picked:");
			System.out.print("Sorry, No Discount Applied!");
			System.out.println(mobile);
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("***********************************************");
			//tp.TotalPriceCalculator(totalPrice);
        }
    }

    public static void getMobile2() {
        Scanner sc = new Scanner(System.in);
        Validation v1 = new Validation();
        TotalPrice tp = new TotalPrice();
        String name, model, processor;
        int ram, storage;
       while (true) {
            System.out.println("Enter Processor Name:");
            processor = sc.nextLine();

            if (!v1.validateString(processor)) {
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

        System.out.println("You've selected a Mobile!");
        Mobile mobile = new Mobile(processor, ram, storage, 99.99);
        double totalPrice = mobile.getPrice1();
        if (totalPrice > 100.00) {
            double discount = 0.10;
            double discountedAmount = totalPrice * discount;
            double discountedPrice = totalPrice - discountedAmount;

            System.out.println("Mobile that you have Picked:");
            System.out.println(mobile);
            System.out.println("********************Bill************************");
            System.out.println("Total Price: $" + totalPrice);
            System.out.println("Discount Applied: " + (discount * 100) + "%");
            System.out.printf("Discount Amount: $%.2f%n", discountedAmount);
            System.out.printf("Discounted Price: $%.2f%n", discountedPrice);
            System.out.println("************************************************");
            //tp.TotalPriceCalculator(discountedPrice);
        } else {
        	System.out.println("********************Bill************************");
		   	System.out.println("Mobile that you have Picked:");
			System.out.print("Sorry, No Discount Applied!");
			System.out.println(mobile);
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("***********************************************");
			//tp.TotalPriceCalculator(totalPrice);
        }
    }

    public static void getMobile3() {
        Scanner sc = new Scanner(System.in);
        Validation v1 = new Validation();
        TotalPrice tp = new TotalPrice();
        String name, model, processor;
        int ram, storage;
        while (true) {
            System.out.println("Enter Processor Name:");
            processor = sc.nextLine();

            if (!v1.validateString(processor)) {
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

        System.out.println("You've selected a Mobile!");
        Mobile mobile = new Mobile(processor, ram, storage, 139.99);
        double totalPrice = mobile.getPrice1();
        if (totalPrice > 120.00) {
            double discount = 0.10;
            double discountedAmount = totalPrice * discount;
            double discountedPrice = totalPrice - discountedAmount;
            System.out.println("Mobile that you have Picked:");
            System.out.println(mobile);
            System.out.println("********************Bill************************");
            System.out.println("Total Price: $" + totalPrice);
            System.out.println("Discount Applied: " + (discount * 100) + "%");
            System.out.printf("Discount Amount: $%.2f%n", discountedAmount);
            System.out.printf("Discounted Price: $%.2f%n", discountedPrice);
            System.out.println("************************************************");
           // tp.TotalPriceCalculator(discountedPrice);
        } else {
        	System.out.println("********************Bill************************");
		   	System.out.println("Mobile that you have Picked:");
			System.out.print("Sorry, No Discount Applied!");
			System.out.println(mobile);
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("***********************************************");
			//tp.TotalPriceCalculator(totalPrice);
        }
    }
}