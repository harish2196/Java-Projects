package com.chainsys.arraylist1;

import java.util.ArrayList;
import java.util.Scanner;



public class ProductManager implements Inter {
	ArrayList<Product> productList= new ArrayList<>();;

	public void addProduct(Product product) {
		productList.add(product);
		System.out.println("Product added successfully!");
	}

	public void viewProducts() {
		for (Product product : productList) {
			System.out.println(product);
		}
	}

	public Product getProductById(int id) {
		for (Product product : productList) {
			if (product.getId() == id) {
				return product;
			}
		}
		return null; 
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Validation v1=new Validation();	
		ReadWriteMethods rwm = new ReadWriteMethods();
		double price;
		ProductManager productManager = new ProductManager();
		String name,pass,model;
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
			System.out.println("Welcome to our store!");
			System.out.println("What product would you like to get?");
			System.out.println("Welcome to Product Manager");
			System.out.println("1. Add Product");
			System.out.println("2. View Products");
			System.out.println("3. Retrieve Product by ID");
			System.out.println("4. Exit");

			int choice;
			do {
				System.out.println("Enter your choice:");
				choice = scanner.nextInt();
				scanner.nextLine();
				switch (choice) {
				case 1:
					System.out.println("Enter Product ID:");
					int id = scanner.nextInt();
					if(!v1.isNumerics(id)) {
						System.err.println("Negative Number!");
						System.out.println("Enter Valid Product ID:");
						id = scanner.nextInt();
					}
					scanner.nextLine();
					while (true) {
						System.out.println("Enter Product Name:");
						name = scanner.nextLine();
						if (!v1.isSpecialChar(name)) {
							System.err.println("Invalid Product Name!");
						} else {
							break; 
						}
					}

					while (true) {
						System.out.println("Enter Model Name:");
						model = scanner.nextLine();
						if (!v1.isSpecialChar(model)) {
							System.err.println("Invalid Model Name!");
						} else {
							break; 
						}
					}

					while (true) {
						System.out.println("Enter Product Price:");
						price = scanner.nextDouble();
						if (!v1.isDle(price)) {
							System.err.println("Negative Number!");
						} else {
							break; 
						}
					}
					scanner.nextLine(); 
					Product newProduct = new Product(id, name, model, price);
					productManager.addProduct(newProduct);
					break;
				case 2:
					System.out.println("Products:");
					productManager.viewProducts();
					break;
				case 3:	
					int searchId ;
					while (true) {
						System.out.println("Enter the ID of the product:");
						searchId = scanner.nextInt();
						if (!v1.isNumerics(searchId)) {
							System.err.println("Invalid Product Id!");
						} else {
							break; 
						}
					}
					Product product = productManager.getProductById(searchId);
					if (product != null) {
						System.out.println("Product found:");
						System.out.println(product);
					} else {
						System.out.println("Product not found!");
					}
					break;
				case 4:
					System.out.println("Exiting...");
					return;

				default:
					System.out.println("Invalid choice!");
					continue;
				}
			} while (choice!=4);

			//scanner.close();
		


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

			System.out.println("Welcome to Product Manager");
			System.out.println("1. Add Product");
			System.out.println("2. View Products");
			System.out.println("3. Retrieve Product by ID");
			System.out.println("4. Exit");

			int choice;
			do {
				System.out.println("Enter your choice:");
				choice = scanner.nextInt();
				scanner.nextLine(); 

				switch (choice) {
				case 1:
					System.out.println("Enter Product ID:");
					int id = scanner.nextInt();
					if(!v1.isNumerics(id)) {
						System.err.println("Negative Number!");
						System.out.println("Enter Valid Product ID:");
						id = scanner.nextInt();
					}
					scanner.nextLine();
					while (true) {
						System.out.println("Enter Product Name:");
						name = scanner.nextLine();
						if (!v1.isSpecialChar(name)) {
							System.err.println("Invalid Product Name!");
						} else {
							break; 
						}
					}

					while (true) {
						System.out.println("Enter Model Name:");
						model = scanner.nextLine();
						if (!v1.isSpecialChar(model)) {
							System.err.println("Invalid Model Name!");
						} else {
							break; 
						}
					}

					while (true) {
						System.out.println("Enter Product Price:");
						price = scanner.nextDouble();
						if (!v1.isDle(price)) {
							System.err.println("Negative Number!");
						} else {
							break; 
						}
					}
					scanner.nextLine(); 
					Product newProduct = new Product(id, name, model, price);
					productManager.addProduct(newProduct);
					break;
				case 2:
					System.out.println("Products:");
					productManager.viewProducts();
					break;
				case 3:	
					int searchId ;
					while (true) {
						System.out.println("Enter the ID of the product:");
						searchId = scanner.nextInt();
						if (!v1.isNumerics(searchId)) {
							System.err.println("Invalid Product Id!");
						} else {
							break; 
						}
					}
					Product product = productManager.getProductById(searchId);
					if (product != null) {
						System.out.println("Product found:");
						System.out.println(product);
					} else {
						System.out.println("Product not found!");
					}
					break;
				case 4:
					System.out.println("Exiting...");
					return;

				default:
					System.out.println("Invalid choice!");
					continue;
				}
			} while (choice!=4);

		}
	}
}
